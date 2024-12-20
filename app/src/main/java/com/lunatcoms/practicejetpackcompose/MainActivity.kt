package com.lunatcoms.practicejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lunatcoms.practicejetpackcompose.ui.theme.PracticeJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            helloApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun helloApp(){
    PracticeJetpackComposeTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Greeting("Android")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun exampleModifier() {
    Text(
        text = "Primer prueba",
        modifier = Modifier.padding(horizontal = 16.dp)
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticeJetpackComposeTheme {
        Greeting("Horoscope")
    }
}

@Preview(showBackground = true, name = "Prueba")
@Composable
fun SecondPreview() {
    PracticeJetpackComposeTheme {
        Greeting("Horoscope")
    }
}