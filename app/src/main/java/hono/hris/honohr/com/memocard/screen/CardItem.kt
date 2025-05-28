package hono.hris.honohr.com.memocard.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import hono.hris.honohr.com.memocard.model.MemoryCard
import hono.hris.honohr.com.memocard.R

@Composable
fun CardItem(card: MemoryCard, onClick: @Composable () -> Unit) {
    Card(
        modifier = Modifier
            .size(120.dp)
            .clickable { onClick() }
    ) {
        Box {
            if (card.isFaceUp || card.isMatched) {
                Image(
                    painter = painterResource(id = card.imageResId),
                    contentDescription = "Memory Card"
                )
            } else {
                Image(
                    painter = painterResource(id = R.drawable.card_back), // fallback image
                    contentDescription = "Card Back"
                )
            }
        }
    }
}

