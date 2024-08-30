package com.example.miprimerscript

object BaseDatos {
    private var usuario: String = ""
    private var password: String = ""
    private var baseDatos: String = ""
    private var link: String = ""

    fun open(usuario: String, password: String, baseDatos: String, link: String) {
        this.usuario = usuario
        this.password = password
        this.baseDatos = baseDatos
        this.link = link
        println("Conexión establecida con la base de datos $baseDatos en $link")
    }

    fun mostrarConexion() {
        println("Conectado a la base de datos '$baseDatos' como usuario '$usuario'")
    }
}