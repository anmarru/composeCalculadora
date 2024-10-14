package com.ejemplo.compose_calculadora.pruebas

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel: ViewModel(){
    val texto =  MutableLiveData(" ")

    fun onTextoChange(newTexto: String) {
        texto.value = newTexto

    }
}