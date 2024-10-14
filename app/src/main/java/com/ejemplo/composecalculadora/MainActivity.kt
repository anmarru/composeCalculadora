package com.ejemplo.compose_calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ejemplo.compose_calculadora.pruebas.PantallaPrincipal
import com.ejemplo.compose_calculadora.pruebas.TextViewModel
import com.ejemplo.compose_calculadora.ui.theme.Compose_calculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            //se pone aqui
            PantallaPrincipal(TextViewModel())
        }
    }
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
    Compose_calculadoraTheme {
        Greeting("Android")
    }
}