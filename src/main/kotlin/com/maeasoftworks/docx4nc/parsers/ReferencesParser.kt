package com.maeasoftworks.docx4nc.parsers

import com.maeasoftworks.docx4nc.model.Chapter

/**
 * Класс для обработки ссылок
 *
 * @param chapter глава, в которой находится список
 * @param root объект DocumentParser, Обрабатывающий документ. в котором находится список
 *
 * @author prmncr
 */
class ReferencesParser(chapter: Chapter, root: DocumentParser) : ChapterParser(chapter, root) {

    override fun parse() {}
}
