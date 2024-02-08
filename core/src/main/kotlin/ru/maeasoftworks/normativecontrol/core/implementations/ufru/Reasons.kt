package ru.maeasoftworks.normativecontrol.core.implementations.ufru

import ru.maeasoftworks.normativecontrol.core.abstractions.MistakeReason

object Reasons {
    object PAGE_WIDTH_IS_INCORRECT: MistakeReason("Некорректная высота страницы")
    object PAGE_HEIGHT_IS_INCORRECT: MistakeReason("Некорректная ширина страницы")
    object PAGE_MARGIN_TOP_IS_INCORRECT: MistakeReason("Некорректный верхний отступ страницы")
    object PAGE_MARGIN_LEFT_IS_INCORRECT: MistakeReason("Некорректный левый отступ страницы")
    object PAGE_MARGIN_BOTTOM_IS_INCORRECT: MistakeReason("Некорректный нижний отступ страницы")
    object PAGE_MARGIN_RIGHT_IS_INCORRECT: MistakeReason("Некорректный правый отступ страницы")
    object UndefinedChapterFound: MistakeReason("Неопознанная часть")
    object ChapterOrderMismatch: MistakeReason("Неверный порядок разделов")
    object CHAPTER_BODY_DISORDER: MistakeReason("Основная часть находится на некорректной позиции")
    object WORD_GRAMMATICAL_ERROR: MistakeReason("Грамматическая ошибка, которую нашел Word")
    object WORD_SPELL_ERROR: MistakeReason("Ошибка правописания, которую нашел Word")
    object CHAPTER_FRONT_PAGE_NOT_FOUND: MistakeReason("Раздел \"Титульный лист\" не найден")
    object CHAPTER_FRONT_PAGE_POSITION_MISMATCH: MistakeReason("Раздел \"Титульный лист\": некорректная позиция")
    object CHAPTER_ANNOTATION_NOT_FOUND: MistakeReason("Раздел \"Реферат\" не найден")
    object CHAPTER_ANNOTATION_POSITION_MISMATCH: MistakeReason("Раздел \"Реферат\": некорректная позиция")
    object CHAPTER_CONTENTS_NOT_FOUND: MistakeReason("Раздел \"Содержание\" не найден")
    object CHAPTER_CONTENTS_POSITION_MISMATCH: MistakeReason("Раздел \"Содержание\": некорректная позиция")
    object CHAPTER_INTRODUCTION_NOT_FOUND: MistakeReason("Раздел \"Введение\" не найден")
    object CHAPTER_INTRODUCTION_POSITION_MISMATCH: MistakeReason("Раздел \"Введение\": некорректная позиция")
    object CHAPTER_BODY_NOT_FOUND: MistakeReason("Раздел \"Основная часть\" не найден")
    object CHAPTER_BODY_POSITION_MISMATCH: MistakeReason("Раздел \"Основная часть\": некорректная позиция")
    object CHAPTER_CONCLUSION_NOT_FOUND: MistakeReason("Раздел \"Заключение\" не найден")
    object CHAPTER_CONCLUSION_POSITION_MISMATCH: MistakeReason("Раздел \"Заключение\": некорректная позиция")
    object CHAPTER_REFERENCES_NOT_FOUND: MistakeReason("Раздел \"Список литературы\" не найден")
    object CHAPTER_REFERENCES_POSITION_MISMATCH: MistakeReason("Раздел \"Список литературы\": некорректная позиция")
    object CHAPTER_APPENDIX_NOT_FOUND: MistakeReason("Раздел \"Приложение\" не найден")
    object CHAPTER_APPENDIX_POSITION_MISMATCH: MistakeReason("Раздел \"Приложение\": некорректная позиция")
    object TODO_ERROR: MistakeReason("Неопределенная ошибка (будет обработана позже)")
    object TEXT_HEADER_EMPTY: MistakeReason("Пустой заголовок раздела")
    object TEXT_HEADER_ALIGNMENT: MistakeReason("Некорректное выравнивание заголовка раздела")
    object TEXT_HEADER_BODY_ALIGNMENT: MistakeReason("Некорректное выравнивание заголовка/подзаголовка основной части")
    object TEXT_REGULAR_INCORRECT_ALIGNMENT: MistakeReason("Некорректное выравнивание текста")
    object TEXT_WHITESPACE_ALIGNMENT: MistakeReason("Некорректное выравнивание пустой строки")
    object TEXT_WHITESPACE_AFTER_HEADER_ALIGNMENT: MistakeReason("Некорректное выравнивание пустой строки после заголовка")
    object TEXT_HEADER_NOT_UPPERCASE: MistakeReason("Заголовок раздела написан не строчными буквами")
    object TEXT_HEADER_BODY_UPPERCASE: MistakeReason("Заголовок основной части написан строчными буквами")
    object TEXT_REGULAR_UPPERCASE: MistakeReason("Текст написан строчными буквами")
    object TEXT_WHITESPACE_UPPERCASE: MistakeReason("Пустая строка отформатирована в режиме только строчных букв")
    object TEXT_WHITESPACE_AFTER_HEADER_UPPERCASE: MistakeReason("Пустая строка после заголовка отформатирована в режиме только строчных букв")
    object TEXT_HEADER_NOT_BOLD: MistakeReason("Не полужирный заголовок")
    object TEXT_REGULAR_WAS_BOLD: MistakeReason("Полужирный текст")
    object TEXT_WHITESPACE_BOLD: MistakeReason("Полужирная пустая строка")
    object TEXT_WHITESPACE_AFTER_HEADER_BOLD: MistakeReason("Полужирная пустая строка после заголовка")
    object TEXT_COMMON_FONT: MistakeReason("Некорректный шрифт текста")
    object TEXT_WHITESPACE_FONT: MistakeReason("Некорректный шрифт пустой строки")
    object TEXT_COMMON_TEXT_COLOR: MistakeReason("Некорректный цвет текста")
    object TEXT_WHITESPACE_TEXT_COLOR: MistakeReason("Некорректный цвет пустой строки")
    object TEXT_COMMON_UNDERLINED: MistakeReason("Текст подчеркнут")
    object TEXT_WHITESPACE_UNDERLINED: MistakeReason("Пустая строка подчеркнута")
    object TEXT_COMMON_INCORRECT_FONT_SIZE: MistakeReason("Некорректный размер шрифта текста")
    object TEXT_WHITESPACE_INCORRECT_FONT_SIZE: MistakeReason("Некорректный размер шрифта пустой строки")
    object TEXT_COMMON_ITALIC_TEXT: MistakeReason("Найден курсивный текст")
    object TEXT_WHITESPACE_ITALIC: MistakeReason("Найден курсивная пустая строка")
    object TEXT_COMMON_STRIKETHROUGH: MistakeReason("Найден перечеркнутый текст")
    object TEXT_WHITESPACE_STRIKETHROUGH: MistakeReason("Найдена перечеркнутая пустая строка")
    object TEXT_COMMON_HIGHLIGHT: MistakeReason("Найден текст с выделением")
    object TEXT_WHITESPACE_HIGHLIGHT: MistakeReason("Найдена пустая строка с выделением")
    object TEXT_COMMON_BORDER: MistakeReason("Найдена рамка у параграфа")
    object TEXT_WHITESPACE_BORDER: MistakeReason("Найдена рамка у пустого параграфа")
    object TEXT_COMMON_BACKGROUND_FILL: MistakeReason("Найдена заливка фона у текста")
    object TEXT_WHITESPACE_BACKGROUND_FILL: MistakeReason("Найдена заливка фона у пустой строки")
    object TEXT_HEADER_LINE_SPACING: MistakeReason("Некорректный межстрочный интервал заголовка")
    object TEXT_REGULAR_LINE_SPACING: MistakeReason("Некорректный межстрочный интервал текста")
    object TEXT_WHITESPACE_LINE_SPACING: MistakeReason("Некорректный межстрочный интервал пустой строки")
    object TEXT_REGULAR_INDENT_FIRST_LINES: MistakeReason("Некорректный отступ первой строки параграфа")
    object TEXT_HEADER_INDENT_FIRST_LINES: MistakeReason("Некорректный отступ первой строки заголовка параграфа")
    object TEXT_WHITESPACE_INDENT_FIRST_LINES: MistakeReason("Некорректный отступ первой строки пустого параграфа")
    object TEXT_COMMON_INDENT_LEFT: MistakeReason("Некорректный левый отступ параграфа")
    object TEXT_WHITESPACE_INDENT_LEFT: MistakeReason("Некорректный левый отступ пустого параграфа")
    object TEXT_COMMON_INDENT_RIGHT: MistakeReason("Некорректный правый отступ параграфа")
    object TEXT_WHITESPACE_INDENT_RIGHT: MistakeReason("Некорректный правый отступ пустого параграфа")
    object TEXT_COMMON_RUN_SPACING: MistakeReason("Некорректный межсимвольный интервал текста")
    object TEXT_WHITESPACE_RUN_SPACING: MistakeReason("Некорректный межсимвольный интервал пустой строки")
    object TEXT_HEADER_REDUNDANT_DOT: MistakeReason("Точка на конце заголовка")
    object TEXT_COMMON_USE_FIRST_LINE_INDENT_INSTEAD_OF_TAB: MistakeReason("Используйте отступ первой строки вместо табуляции")
    object TEXT_HEADER_AUTO_HYPHEN: MistakeReason("Не отключен автоматический перенос слов в заголовке")
    object TEXT_HYPERLINK_WARNING: MistakeReason("Найдена гиперссылка. Убедитесь, что есть острая необходимость в ее наличии.")
    object TEXT_BODY_SUBHEADER_NUMBER_ORDER_MISMATCH: MistakeReason("Неверный порядок нумерации подразделов")
    object TEXT_BODY_SUBHEADER_LEVEL_WAS_MORE_THAN_3: MistakeReason("Уровень вложенности подразделов больше 3")
    object TEXT_BODY_SUBHEADER_WAS_EMPTY: MistakeReason("Подзаголовок был пустым")
    object TEXT_HEADER_EMPTY_LINE_AFTER_HEADER_REQUIRED: MistakeReason("Не найдена пустая строка после заголовка")
    object TEXT_HYPERLINKS_NOT_ALLOWED_HERE: MistakeReason("Ссылки запрещены в данном разделе")
    object PICTURE_IS_NOT_INLINED: MistakeReason("Изображение не встроено в текст")
    object PICTURE_REQUIRED_BLANK_LINE_BEFORE_PICTURE: MistakeReason("Необходима пустая строка перед изображением")
    object PICTURE_REQUIRED_BLANK_LINE_AFTER_PICTURE_TITLE: MistakeReason("Необходима пустая строка после подписи изображения")
    object PICTURE_TITLE_NUMBER_DISORDER: MistakeReason("Неверный порядок нумерации изображений")
    object PICTURE_TITLE_WRONG_FORMAT: MistakeReason("Неверный формат подписи изображений")
    object PICTURE_TITLE_REQUIRED_LINE_BREAK_BETWEEN_PICTURE_AND_TITLE: MistakeReason("Необходим перенос строки между изображением и подписью к нему")
    object PICTURE_TITLE_NOT_CENTERED: MistakeReason("Некорректное выравнивание подписи к изображению")
    object PICTURE_TITLE_ENDS_WITH_DOT: MistakeReason("Точка в конце подписи к изображению")
    object LIST_LEVEL_MORE_THAN_2: MistakeReason("Уровень вложенности списка больше 2")
    object ORDERED_LIST_INCORRECT_MARKER_FORMAT_AT_LEVEL_1: MistakeReason("Некорректный формат маркера первого уровня нумерованного списка")
    object ORDERED_LIST_INCORRECT_MARKER_FORMAT_AT_LEVEL_2: MistakeReason("Некорректный формат маркера второго уровня нумерованного списка")
    object ORDERED_LIST_WRONG_LETTER: MistakeReason("Данная буква не должна использоваться как маркер элемента нумерованного списка")
    object ORDERED_LIST_INCORRECT_MARKER_FORMAT: MistakeReason("Некорректный формат маркера ненумерованного списка")
    object TEXT_ABANDONED_ABBREVIATION_FOUND: MistakeReason("Сокращения \"к-рый\", \"ур-ие\", \"вм.\", \"напр.\", \"м.б.\" запрещены")
    object TabInList: MistakeReason("Запрещено использование табуляции в качестве разделителя после маркера списка. Методические указания, п. 6.3")
    object ForbiddenMarkerTypeLevel1 : MistakeReason(
        "Данный вид маркера списка запрещен. Используйте ненумерованный список либо русские строчные буквы. Методические указания, п. 6.3"
    )
}