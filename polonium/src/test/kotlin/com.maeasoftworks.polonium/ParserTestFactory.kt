package com.maeasoftworks.polonium

import com.maeasoftworks.polonium.enums.MistakeType
import com.maeasoftworks.polonium.model.DocumentData
import com.maeasoftworks.polonium.model.MistakeOuter
import com.maeasoftworks.polonium.parsers.DocumentParser
import org.docx4j.openpackaging.exceptions.Docx4JException
import org.junit.jupiter.api.Assertions
import java.io.FileInputStream
import java.io.IOException
import kotlin.reflect.KClass

open class ParserTestFactory(testClass: KClass<*>) {
    private val directory: String

    init {
        directory = testClass.simpleName!!.removeSuffix("Tests").lowercase()
    }

    protected fun errorAssert(found: MutableList<MistakeOuter>, vararg expected: MistakeType) {
        Assertions.assertEquals(expected.size, found.size, "Expected: ${expected.size} errors\nFound: ${found.size}")
        for (i in 0 until found.size) {
            Assertions.assertEquals(
                expected[i],
                found[i].mistakeType,
                "Expected: ${expected[i].name}\nFound: ${found[i].mistakeType.name}"
            )
        }
    }

    protected fun createParser(filename: String, useFullPath: Boolean = false): DocumentParser {
        return try {
            DocumentParser(
                DocumentData(
                    FileInputStream(
                        if (useFullPath) {
                            "src/test/resources/$filename"
                        } else {
                            "src/test/resources/$directory/$filename"
                        }
                    ).readAllBytes()
                ),
                "test"
            )
        } catch (e: IOException) {
            println(e.message)
            throw RuntimeException("Parser cannot be initialized!")
        } catch (e: Docx4JException) {
            println(e.message)
            throw RuntimeException("Parser cannot be initialized!")
        }
    }
}
