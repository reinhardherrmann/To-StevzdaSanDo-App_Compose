package de.orome.to_do_appcompose.data.models

import androidx.compose.ui.graphics.Color
import de.orome.to_do_appcompose.ui.theme.HighPriorityColor
import de.orome.to_do_appcompose.ui.theme.LowPriorityColor
import de.orome.to_do_appcompose.ui.theme.MediumPriorityColor
import de.orome.to_do_appcompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}