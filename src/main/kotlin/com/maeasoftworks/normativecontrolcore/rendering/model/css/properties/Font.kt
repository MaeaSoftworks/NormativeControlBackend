package com.maeasoftworks.normativecontrolcore.rendering.model.css.properties

import com.maeasoftworks.normativecontrolcore.rendering.utils.FONT_SCALING
import org.docx4j.w14.STLigatures

class FontFamily(value: String?) : Property<String>("font-family", value)

class FontSize(value: Int?) : IntProperty("font-size", value, FONT_SCALING, "px")

class FontStyle(value: Boolean?) : Property<Boolean?>(
    "font-style",
    value,
    { if (it == null) null else { if (it) "italic" else null } }
)

class FontWeight(value: Boolean?) : Property<Boolean?>(
    "font-weight",
    value,
    { if (it == null) null else { if (it) "bold" else null } }
)

class FontVariantCaps(value: Boolean?) : Property<Boolean?>(
    "font-variant-caps",
    value,
    { if (it == null) null else { if (it) "small-caps" else null } }
)

class FontVariantLigatures(value: STLigatures?) : Property<STLigatures>(
    "font-variant-ligatures",
    value,
    {
        when (it) {
            STLigatures.NONE -> "none"
            STLigatures.STANDARD -> "common-ligatures"
            STLigatures.CONTEXTUAL -> "contextual"
            STLigatures.HISTORICAL -> "historical-ligatures"
            STLigatures.DISCRETIONAL -> "discretionary-ligatures"
            STLigatures.STANDARD_CONTEXTUAL -> "common-ligatures contextual"
            STLigatures.STANDARD_HISTORICAL -> "common-ligatures historical-ligatures"
            STLigatures.CONTEXTUAL_HISTORICAL -> "contextual historical-ligatures"
            STLigatures.STANDARD_DISCRETIONAL -> "common-ligatures discretionary-ligatures"
            STLigatures.CONTEXTUAL_DISCRETIONAL -> "contextual discretionary-ligatures"
            STLigatures.HISTORICAL_DISCRETIONAL -> "historical-ligatures discretionary-ligatures"
            STLigatures.STANDARD_CONTEXTUAL_HISTORICAL -> "no-discretionary-ligatures"
            STLigatures.STANDARD_CONTEXTUAL_DISCRETIONAL -> "no-historical-ligatures"
            STLigatures.STANDARD_HISTORICAL_DISCRETIONAL -> "no-contextual"
            STLigatures.CONTEXTUAL_HISTORICAL_DISCRETIONAL -> "no-common-ligatures"
            STLigatures.ALL -> null
            null -> null
        }
    }
)
