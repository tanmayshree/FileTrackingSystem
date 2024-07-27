package com.filetrackingsystem.fts

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
private fun test() {
    Box(modifier = Modifier.padding()) {
        FTSButton(
            text = "Hellvskuvbskrubv  cvkjbnedhehehehhhhhehehhhnfco",
            textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        )
    }

}


@Composable
fun FTSButton(
    text: String,
    textStyle: TextStyle = TextStyle.Default,
    imageResource: Painter = painterResource(id = R.drawable.ic_launcher_foreground),
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = Color.LightGray,
                modifier = Modifier
                    .height(2.dp)
                    .width(50.dp)
            ) {}
            Text(
                text = text,
                style = textStyle,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(vertical = 10.dp)
            )
            Divider()
        }
        repeat(5) {
            Surface(
                modifier = Modifier.clickable {
                    println("Item Clicked")
                },
                shape = RoundedCornerShape(5.dp),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = text,
                        style = textStyle,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .padding(vertical = 5.dp)
                            .weight(1f)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Image(
                        painter = imageResource,
                        contentDescription = "",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
            Divider(modifier = Modifier.padding(horizontal = 10.dp))
        }
    }
}