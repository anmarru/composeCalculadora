package com.ejemplo.composecalculadora.ui.calculadora

import androidx.lifecycle.MutableLiveData

class CalculadoraViewModel {

    val texto = MutableLiveData("")

    //esta funcion hace que la pantalla refresque y cambie el texto del boton pulsado
    //lo llamo en la funcion de los botones con un lambda en el scrren
    fun onTextoChange(newTexto: String) {
        texto.value += newTexto

    }
}