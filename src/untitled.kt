
val ingredients = listOf<String?>("Agua", "Leche", "Carne", "Verduras", "Cereal", "Huevos", "Aceite")

val recetasTitulos = mutableListOf<String?>()
var recetasAmount = 0

val receta1 = mutableListOf<String?>()
val receta2 = mutableListOf<String?>()
val receta3 = mutableListOf<String?>()
val receta4 = mutableListOf<String?>()
val receta5 = mutableListOf<String?>()

fun main() {

    var isOver = false;

    menu@ do {

        println(""":: Bienvenido a Recipe Maker ::
            |
            |Seleccione la opcion deseada
            |1. Hacer una receta
            |2. Ver mis recetas
            |3. Salir
        """.trimMargin("|"))
        val response:String? = readLine()

        if (response == "1") {

            crearReceta()

        } else if (response == "2") {

            mostrarRecetas()

        } else if (response == "3") {

            println("Saliendo..")
            break@menu

        }

    } while (response != "3")

}

fun crearReceta() {

    if (recetasAmount != 5) {

        println(
            """:: Crea una receta hoy! ::
                |
                |Escoge un ingrediente.
            """.trimMargin("|")
        )

        var it = 0
        for (ing in ingredients) {

            it++
            println("$it. $ing")

        }

        var option: String? = readLine()
        when (option) {

            "1" -> option = "Agua"
            "2" -> option = "Leche"
            "3" -> option = "Carne"
            "4" -> option = "Verduras"
            "5" -> option = "Cereal"
            "6" -> option = "Huevos"
            "7" -> option = "Aceite"
            else -> println("Por favor escoja un ingrediente valido")

        }


        if (recetasAmount == 0) {

            receta1.add(option)

        } else if (recetasAmount == 1) {

            receta2.add(option)

        } else if (recetasAmount == 2) {

            receta3.add(option)

        } else if (recetasAmount == 3) {

            receta4.add(option)

        } else if (recetasAmount == 4) {

            receta5.add(option)

        }

        println("Necesitas otro ingrediente?")
        val another: String? = readLine()

        if (another == "no") {

            println("Listo!")
            recetasAmount++

        } else {

            crearReceta()

        }

    } else {

        println("El maximo numero de recetas es 5")

    }


}

fun mostrarRecetas() {

    println("Cual es la receta que quieres ver? (1 a 5)")
    val receta:String? = readLine()

    when(receta) {

        "1" -> for (ingrediente in receta1) { println(ingrediente) }
        "2" -> for (ingrediente in receta2) { println(ingrediente) }
        "3" -> for (ingrediente in receta3) { println(ingrediente) }
        "4" -> for (ingrediente in receta4) { println(ingrediente) }
        "5" -> for (ingrediente in receta5) { println(ingrediente) }
        else -> println("No es una receta valida")

    }


}