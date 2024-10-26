import kotlinx.serialization.Serializable

@Serializable
data class Stories(
        val id: Double,
        val title: String,
        val summary: String,
        val published_at: String,
        val content: List<ContentItem>
)

@Serializable
data class ContentItem(
        val id: Double,
        val sub_title: String,
        val text: String
)