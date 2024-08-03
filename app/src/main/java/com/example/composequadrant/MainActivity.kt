package com.example.composequadrant

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(

                    modifier = Modifier.fillMaxHeight(),
                    color = MaterialTheme.colorScheme.background,

                    ) {
                    CardText(
                        "Text Composable",
                        paragraph = "Displays text and follows the recommended Material " +
                                "Design guidelines.",
                        nameTwo = "Image composable",
                        paragraphTwo = "Creates a composable that lays out and draws a given Painter class object.")

                }
            }
        }
    }

    @Composable
    fun CardText(name: String,
                 paragraph: String,
                 nameTwo: String,

                 paragraphTwo: String) {
        Row {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEADDFF)
                ),
                modifier = Modifier
                    .size(width = 200.dp, height = 400.dp)
                    .padding(start = 16.dp, top = 16.dp, bottom = 16.dp)

            ) {
                Text(
                    text = "Text Composable",
                    modifier = Modifier
                        .padding(36.dp),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Displays text and follows the recommended Material " +
                            "Design guidelines.",
                    modifier = Modifier
                        .padding(36.dp),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )

            }
            Column {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFD0BCFF)

                    ),
                    modifier = Modifier
                        .size(width = 200.dp, height = 400.dp)
                        .align(alignment = Alignment.End)
                        .padding(top = 16.dp, bottom = 16.dp)

                ) {
                    Text(
                        text = "Image Composable",
                        modifier = Modifier
                            .padding(36.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Creates a composable that lays out and draws a given Painter class object.",
                        modifier = Modifier
                            .padding(36.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeQuadrantTheme {
            CardText(
                name = "Text Composable",
                paragraph = "Displays text and follows the recommended Material Design guidelines.",

                nameTwo = "Image Composable",
                paragraphTwo = "Creates a composable that lays out and draws a given Painter class object."


            )
        }

    }
}




