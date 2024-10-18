package com.ejemplo.composecalculadora.ui.calculadora

import androidx.lifecycle.MutableLiveData
import net.objecthunter.exp4j.ExpressionBuilder

class CalculadoraViewModel {

    val texto = MutableLiveData("")

    //esta funcion hace que la pantalla refresque y cambie el texto del boton pulsado
    //lo llamo en la funcion de los botones con un lambda en el scrren
    fun onTextoChange(newTexto: String) {
        when(newTexto){
            "c"->texto.value="0"
            "="-> texto.value= ExpressionBuilder(texto.value).build().evaluate().toString()
            else ->texto.value += newTexto
        }


    }
}