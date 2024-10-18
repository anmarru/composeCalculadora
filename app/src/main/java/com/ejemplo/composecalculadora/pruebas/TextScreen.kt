package com.ejemplo.composecalculadora.pruebas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ejerciciostema1.composecalculadora.R

@Composable
fun PantallaPrincipal(viewModel: TextViewModel= TextViewModel()){
    val texto: String by viewModel.texto.observeAsState("")

    Column (
        modifier = Modifier.fillMaxSize()){
        //asi se pone la imagen que yo quiero
        Image(
            modifier = Modifier.size(50.dp),
            painter= painterResource(R.drawable.fresass),
            contentDescription = "fresas"
        )
        //aqui la coloco como un icono
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription= ""
        )
       TextField(
        value = texto,
        onValueChange = {viewModel.onTextoChange(it)}
       )

        //Text (text= texto)
        Button(onClick = {}) {Text(texto) }}



}

//para previsualizar
@Preview(showBackground = true)
@Composable
fun PantallaPreview(){
    PantallaPrincipal(TextViewModel())
}
