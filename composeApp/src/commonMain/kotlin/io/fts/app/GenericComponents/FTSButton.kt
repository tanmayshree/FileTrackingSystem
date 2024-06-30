package io.fts.app.GenericComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.ktor.client.HttpClient
import kotlinx.coroutines.launch

@Composable
fun FTSButton(
    modifier: Modifier = Modifier,
    borderColor: Color = Color.Transparent,
    borderWidth: Dp = 0.dp,
    backgroundColor: Color,
    borderShapeSize: Dp = 5.dp,
    text: String,
    textStyle: TextStyle = TextStyle.Default,
    imageResource: Painter,
    imageModifier: Modifier
) {
    Surface(
        border = BorderStroke(borderWidth, borderColor),
        shape = RoundedCornerShape(borderShapeSize),
        elevation = 2.dp,
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .background(backgroundColor)
                .padding(horizontal = 8.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                style = textStyle,
                modifier = Modifier.padding(end = 5.dp),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Image(
                painter = imageResource,
                contentDescription = "",
                modifier = imageModifier
            )
        }
    }
}