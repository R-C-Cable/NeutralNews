package com.neutraltimes.today.domain

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class FormatDataUseCase {
    fun formatDate(dateString: String): String {
        val zonedDateTime = Instant.parse(dateString).toLocalDateTime(TimeZone.currentSystemDefault())
        val month = zonedDateTime.month.name.lowercase().replaceFirstChar { it.uppercase() }
        val day = zonedDateTime.dayOfMonth
        val year = zonedDateTime.year
        return "$month $day, $year"
    }
}