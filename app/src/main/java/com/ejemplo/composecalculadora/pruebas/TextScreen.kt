package com.ejemplo.compose_calculadora.pruebas

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

import androidx.compose.runtime.livedata.observeAsState

@Composable
fun PantallaPrincipal(viewModel: TextViewModel){
    val texto: String by viewModel.texto.observeAsState(" ")
    TextField(
        modifier= Modifier.fillMaxWidth(),
        value = texto,
        onValueChange = {viewModel.onTextoChange(it)}

    )
    Text (text= texto)
}

