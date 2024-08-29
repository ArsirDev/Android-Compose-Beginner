package com.arsir.androidcomposebeginner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.arsir.androidcomposebeginner.ui.theme.AndroidComposeBeginnerTheme

class RowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidComposeBeginnerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RowComponent(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun RowComponent(modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Text(text = "No")
        Text(text = "Name")
        Text(text = "Age")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowPreview() {
    AndroidComposeBeginnerTheme {
        RowComponent(modifier = Modifier.fillMaxSize())
    }
}