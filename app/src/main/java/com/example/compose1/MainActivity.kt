package com.example.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose1.ui.theme.Compose1Theme

@Composable
fun IssueItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(9.dp)

            .background(Color.White),
        verticalAlignment = Alignment.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Issue Image",
            modifier = Modifier
                .size(50.dp)
                .padding(end = 8.dp)
                .align(Alignment.Top),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(8.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Bump pyarrow from 7...", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text(text = "Status: NONE", fontSize = 14.sp)
            Text(text = "Created At: 2023-11-9, 2:30 PM", fontSize = 14.sp)
        }

        Spacer(modifier = Modifier.width(16.dp))

        // Align the button to the top within the row
        Button(
            onClick = { /* Handle open action */ },
            modifier = Modifier.align(Alignment.Top) // Ensure button aligns to the top
        ) {
            Text(text = "Open")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewIssueItem() {
    Compose1Theme {
        IssueItem()
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose1Theme {
                IssueItem()
            }
        }
    }
}
