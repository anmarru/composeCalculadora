package com.ejemplo.composecalculadora.ui.calculadora

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun PantallaPrincipalCalculadora(viewModel: CalculadoraViewModel){

    val texto: String by viewModel.texto.observeAsState("")//hay q crear la variable

    Column (modifier = Modifier.fillMaxSize().padding(35.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text= texto,
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()

        )
        Column (){
            filaBotones(listOf("1","2","3","+")){viewModel.onTextoChange(it)}// llamo la funcion que me cambia el click del boton en view
            filaBotones(listOf("4","5","6","-")){viewModel.onTextoChange(it)}
            filaBotones(listOf("7","8","9","*")){viewModel.onTextoChange(it)}
            filaBotones(listOf("c","0","=","/")){viewModel.onTextoChange(it)}
        }
    }

}

@Composable
// despues del boton tambien agrego la fincion lambda para cambiar el texto de los botones (fun onTextchange)
fun filaBotones(botones: List<String>,onButtonClick: (String)-> Unit ){
    Row (horizontalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier.fillMaxWidth()
    ){
        botones.forEach{
            Button(onClick = {onButtonClick(it)}, modifier = Modifier.weight(1f)) {
                Text(
                    text=it
                )
            }
        }
    }
}