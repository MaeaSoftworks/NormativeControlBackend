package ru.maeasoftworks.normativecontrol.core.model

import org.docx4j.TextUtils
import org.docx4j.wml.P
import ru.maeasoftworks.normativecontrol.core.enums.CaptureType
import ru.maeasoftworks.normativecontrol.core.enums.MistakeType
import ru.maeasoftworks.normativecontrol.core.parsers.chapters.AppendixParser
import ru.maeasoftworks.normativecontrol.core.parsers.chapters.BodyParser
import ru.maeasoftworks.normativecontrol.core.parsers.chapters.ChapterParser
import ru.maeasoftworks.normativecontrol.core.parsers.chapters.UndefinedChapter
import ru.maeasoftworks.normativecontrol.core.utils.getPropertyValue

object DocumentChildParsers {
    fun parseDocumentChild(child: Any, context: Context) {
        when (child) {
            is P -> parseP(child, context)
        }
    }

    private fun parseP(p: P, context: Context) {
        val lvl = p.getPropertyValue(context) { outlineLvl }
        if (lvl?.`val` != null) {
            // p is chapter header
            detectChapterByHeader(p, context, lvl.`val`.intValueExact())
        }
    }

    private fun detectChapterByHeader(p: P, context: Context, level: Int) {
        val text = TextUtils.getText(p)
        if (text.matches(Regex("^(\\d+(?:\\.\\d*)?).*\$"))) {
            checkChapterOrderAndSet(BodyParser, context)
            return
        }
        for (keys in 0 until ChapterMarkers.markers.size) {
            for ((title, parser) in ChapterMarkers.markers) {
                if (text.uppercase() == title) {
                    checkChapterOrderAndSet(parser, context)
                    return
                }
            }
        }
        if (text.uppercase().startsWith(ChapterMarkers.APPENDIX_NAME)) {
            checkChapterOrderAndSet(AppendixParser, context)
            return
        }
        checkChapterOrderAndSet(UndefinedChapter, context)
    }

    private fun checkChapterOrderAndSet(chapterParser: ChapterParser, context: Context) {
        if (chapterParser is UndefinedChapter) {
            context.addMistake(
                Mistake(
                    MistakeType.CHAPTER_UNDEFINED_CHAPTER,
                    CaptureType.P,
                    ChapterMarkers.names[chapterParser]!!.joinToString("/"),
                    ChapterMarkers.nextOf[context.lastDefinedChapter]!!.flatMap { ChapterMarkers.names[it]!! }.joinToString("/")
                )
            )
        } else {
            if (!ChapterMarkers.nextOf[context.lastDefinedChapter]!!.contains(chapterParser)) {
                context.addMistake(
                    Mistake(
                        MistakeType.CHAPTER_ORDER_MISMATCH,
                        CaptureType.P,
                        ChapterMarkers.names[chapterParser]!!.joinToString("/"),
                        ChapterMarkers.nextOf[context.lastDefinedChapter]!!.flatMap { ChapterMarkers.names[it]!! }.joinToString("/")
                    )
                )
            }
            context.lastDefinedChapter = chapterParser
        }
        context.chapter = chapterParser
    }
}
