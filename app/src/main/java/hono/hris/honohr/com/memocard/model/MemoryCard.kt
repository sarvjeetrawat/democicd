package hono.hris.honohr.com.memocard.model

data class MemoryCard(
    val id: Int,
    val imageResId: Int,
    var isFaceUp: Boolean = false,
    var isMatched: Boolean = false
)
