package com.ejemplo.composecalculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ejemplo.composecalculadora.pruebas.PantallaPrincipal
import com.ejemplo.composecalculadora.pruebas.TextViewModel
import com.ejemplo.composecalculadora.ui.calculadora.CalculadoraViewModel
import com.ejemplo.composecalculadora.ui.calculadora.PantallaPrincipalCalculadora
import com.ejemplo.composecalculadora.ui.theme.CalculadoraMiTema

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //se pone aqui
            PantallaPrincipal(TextViewModel())
            //CalculadoraMiTema { PantallaPrincipalCalculadora(CalculadoraViewModel()) }

        }
    }
}



