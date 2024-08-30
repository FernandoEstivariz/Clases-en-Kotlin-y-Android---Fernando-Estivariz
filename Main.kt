package com.example.miprimerscript

fun main() {
    // Conexión a la base de datos
    BaseDatos.open(usuario = "admin", password = "admin123", baseDatos = "MiBase", link = "localhost:5432")
    BaseDatos.mostrarConexion()

    // Crear instancias de Persona
    val persona1 = Persona("Fernando", "Estivariz", "Buendia", "Calle 123", "Fernando@gmail.com", "555-1234")
    val persona2 = Persona("Raul", "Chavez", "Paz", "Avenida 456", "raul.chavez@mail.com", "555-5678")

    // Crear Logs
    val logger = Logger.getInstance()
    logger.log("${persona1.nombre} ${persona1.paterno} ${persona1.materno}")
    logger.log("${persona2.nombre} ${persona2.paterno} ${persona2.materno}")

    // Mostrar información
    println("Personas creadas:")
    println(persona1)
    println(persona2)
}