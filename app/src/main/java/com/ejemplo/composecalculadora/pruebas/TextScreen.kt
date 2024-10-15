package com.ejemplo.composecalculadora.pruebas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PantallaPrincipal(viewModel: TextViewModel){
    val texto: String by viewModel.texto.observeAsState("")

    Column (
        modifier = Modifier.fillMaxSize()
    ){
        TextField(
        value = texto,
        onValueChange = {viewModel.onTextoChange(it)}

    )
        Text (text= texto)
        Button(onClick = {}) {Text(texto) }}

}

//para previsualizar
@Preview(showBackground = true)
@Composable
fun PantallaPreview(){
    PantallaPrincipal(TextViewModel())
}
