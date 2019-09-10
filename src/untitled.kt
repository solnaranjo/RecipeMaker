import recipes.Category
import recipes.Recipe

val categories = arrayOf<String?>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

var leche = Category(3)

var carne = Category(3)

var verduras: Category = Category(6)

var frutas = Category(7)

var cereal = Category(4)

var huevos = Category(3)

var aceite = Category(3)

var recetasAmount = 0


val receta1 = Recipe("Mi Receta")
val receta2 = Recipe("Mi Receta 2")
val receta3 = Recipe("Mi Receta 3")
val receta4 = Recipe("Mi Receta 4")
val receta5 = Recipe("Mi Receta 5")

fun main() {


    values()

    val makeRecipe = { if (recetasAmount != 5)

    { println( """:: Crea una receta hoy! ::
                                    |
                                    |Escoge un ingrediente.
                                    """.trimMargin("|")
    )

        var recipe = true

        do {
                var it = 0
                for (ing in categories) {

                    it++
                    println("$it. $ing")

                }

                var option: String? = readLine()
                /*when (option) {

                    "1" -> option = "Agua"
                    "2" -> option = "Leche"
                    "3" -> option = "Carne"
                    "4" -> option = "Verduras"
                    "5" -> option = "Frutas"
                    "6" -> option = "Cereal"
                    "7" -> option = "Huevos"
                    "8" -> option = "Aceite"
                    else -> println("Por favor escoja un ingrediente valido")

                }*/

                it = 0

                if (option.equals("1")) {

                    when (recetasAmount) {

                        0 -> receta1.addElement("Agua", receta1.getIngredients())
                        1 -> receta2.addElement("Agua", receta2.getIngredients())
                        2 -> receta3.addElement("Agua", receta3.getIngredients())
                        3 -> receta4.addElement("Agua", receta4.getIngredients())
                        4 -> receta5.addElement("Agua", receta5.getIngredients())

                    }

                } else if (option.equals("2")) {

                    val receta = leche.getElement(leche.items)
                    println("Escoge uno:")
                    println("""
                            1. Leche normal
                            2. Lecha deslactosada
                            3. Leche de almendras                      
                    """.trimIndent())

                    var choice: String? = readLine()
                    when (choice) {

                        "1" -> choice = "Leche normal"
                        "2" -> choice = "Leche deslactosada"
                        "3" -> choice = "Leche de almendras"

                    }

                    when (recetasAmount) {

                        0 -> receta1.addElement(choice, receta1.getIngredients())
                        1 -> receta2.addElement(choice, receta2.getIngredients())
                        2 -> receta3.addElement(choice, receta3.getIngredients())
                        3 -> receta4.addElement(choice, receta4.getIngredients())
                        4 -> receta5.addElement(choice, receta5.getIngredients())

                    }


                } else if (option.equals("3")) {

                    val receta = carne.getElement(carne.items)

                    println("Escoge uno:")
                    println("""
                            1. Carne de res
                            2. Pechuga
                            3. Pollo                        
                    """.trimIndent())

                    var choice: String? = readLine()
                    when (choice) {

                        "1" -> choice = "Carne de res"
                        "2" -> choice = "Pechuga"
                        "3" -> choice = "Pollo"

                    }

                    when (recetasAmount) {

                        0 -> receta1.addElement(choice, receta1.getIngredients())
                        1 -> receta2.addElement(choice, receta2.getIngredients())
                        2 -> receta3.addElement(choice, receta3.getIngredients())
                        3 -> receta4.addElement(choice, receta4.getIngredients())
                        4 -> receta5.addElement(choice, receta5.getIngredients())

                    }

                } else if (option.equals("4")) {

                    val receta = verduras.getElement(verduras.items)

                    println("Escoge uno:")

                    println("""
                            1. Lechuga
                            2. Zanahoria
                            3. Coliflor
                            4. Pimenton
                            5. Cebolla
                            6. Rabano
                    """.trimIndent())

                    var choice: String? = readLine()
                    when (choice) {

                        "1" -> choice = "Lechuga"
                        "2" -> choice = "Zanahoria"
                        "3" -> choice = "Coliflor"
                        "4" -> choice = "Pimenton"
                        "5" -> choice = "Cebolla"
                        "6" -> choice = "Rabano"

                    }

                    when (recetasAmount) {

                        0 -> receta1.addElement(choice, receta1.getIngredients())
                        1 -> receta2.addElement(choice, receta2.getIngredients())
                        2 -> receta3.addElement(choice, receta3.getIngredients())
                        3 -> receta4.addElement(choice, receta4.getIngredients())
                        4 -> receta5.addElement(choice, receta5.getIngredients())

                    }

                } else if (option.equals("5")) {

                    val receta = frutas.getElement(frutas.items)

                    println("Escoge uno:")
                    println("""
                            1. Fresa
                            2. Banano
                            3. Uvas
                            4. Manzana
                            5. Naranja
                            6. Pera
                            7. Cereza
                    """.trimIndent())
                    var choice: String? = readLine()
                    when (choice) {

                        "1" -> choice = "Fresa"
                        "2" -> choice = "Banano"
                        "3" -> choice = "Uvas"
                        "4" -> choice = "Manzana"
                        "5" -> choice = "Naranja"
                        "6" -> choice = "Pera"
                        "7" -> choice = "Cereza"

                    }

                    when (recetasAmount) {

                        0 -> receta1.addElement(choice, receta1.getIngredients())
                        1 -> receta2.addElement(choice, receta2.getIngredients())
                        2 -> receta3.addElement(choice, receta3.getIngredients())
                        3 -> receta4.addElement(choice, receta4.getIngredients())
                        4 -> receta5.addElement(choice, receta5.getIngredients())

                    }


                } else if (option.equals("6")) {

                    val receta = cereal.getElement(cereal.items)

                    println("Escoge uno:")
                    println("""
                            1. Avena
                            2. Trigo
                            3. Arroz
                            4. Maiz
                    """.trimIndent())

                    var choice: String? = readLine()
                    when (choice) {

                        "1" -> choice = "Avena"
                        "2" -> choice = "Trigo"
                        "3" -> choice = "Arroz"
                        "4" -> choice = "Maiz"

                    }

                    when (recetasAmount) {

                        0 -> receta1.addElement(choice, receta1.getIngredients())
                        1 -> receta2.addElement(choice, receta2.getIngredients())
                        2 -> receta3.addElement(choice, receta3.getIngredients())
                        3 -> receta4.addElement(choice, receta4.getIngredients())
                        4 -> receta5.addElement(choice, receta5.getIngredients())

                    }


                } else if (option.equals("7")) {

                    val receta = huevos.getElement(huevos.items)

                    println("Escoge uno:")
                    println("""
                            1. Huevos A
                            2. Huevos AA
                            3. Huevos AAA                    
                    """.trimIndent())

                    var choice: String? = readLine()
                    when (choice) {

                        "1" -> choice = "Huevos A"
                        "2" -> choice = "Huevos AA"
                        "3" -> choice = "Huevos AAA"

                    }

                    when (recetasAmount) {

                        0 -> receta1.addElement(choice, receta1.getIngredients())
                        1 -> receta2.addElement(choice, receta2.getIngredients())
                        2 -> receta3.addElement(choice, receta3.getIngredients())
                        3 -> receta4.addElement(choice, receta4.getIngredients())
                        4 -> receta5.addElement(choice, receta5.getIngredients())

                    }

                } else if (option.equals("8")) {

                    val receta = aceite.getElement(aceite.items)

                    println("Escoge uno:")
                    println("""
                            1. Aceite de oliva
                            2. Aceite de algodon
                            3. Aceite de maiz                       
                    """.trimIndent())

                    var choice: String? = readLine()
                    when (choice) {

                        "1" -> choice = "Aceite de oliva"
                        "2" -> choice = "Aceite de algodon"
                        "3" -> choice = "Aceite de maiz"

                    }

                    when (recetasAmount) {

                        0 -> receta1.addElement(choice, receta1.getIngredients())
                        1 -> receta2.addElement(choice, receta2.getIngredients())
                        2 -> receta3.addElement(choice, receta3.getIngredients())
                        3 -> receta4.addElement(choice, receta4.getIngredients())
                        4 -> receta5.addElement(choice, receta5.getIngredients())

                    }

                }

                println("Necesitas otro ingrediente?")
                val another: String? = readLine()

                if (another == "no") {

                    println("Antes de terminar, escribe el nombre de tu receta.")
                    val title = readLine()

                    when (recetasAmount) {

                        0 -> receta1.setTitle("$title")
                        1 -> receta2.setTitle("$title")
                        2 -> receta3.setTitle("$title")
                        3 -> receta4.setTitle("$title")
                        4 -> receta5.setTitle("$title")

                    }
                    println("Listo!")
                    recetasAmount++
                    recipe = false

                }

        } while (recipe.equals(true))

    } else {

        println("El maximo numero de recetas es 5")

    }


    }

    var contadora: Int? = 1
    val showRecipe = {    println("Cual es la receta que quieres ver? (1 a 5)")
                    val opcion:String? = readLine()
                    //var titleToShow: String? = ""

                    when(opcion) {

                        "1" -> {

                            println(receta1.getTitle())
                            val receta = receta1.getIngredients()
                            for (ingrediente in receta) {
                                println(ingrediente)
                            }

                        }

                        "2" -> {

                            println(receta2.getTitle())
                            val receta = receta2.getIngredients()
                            for (ingrediente in receta) {
                                println(ingrediente)
                            }
                        }
                        "3" -> {

                            println(receta3.getTitle())
                            val receta = receta3.getIngredients()
                            for (ingrediente in receta) {
                                println(ingrediente)
                            }
                        }
                        "4" -> {

                            println(receta4.getTitle())
                            val receta = receta4.getIngredients()
                            for (ingrediente in receta) {

                                println(ingrediente)

                            }
                        }
                        "5" -> {

                            println(receta5.getTitle())
                            val receta = receta5.getIngredients()
                            for (ingrediente in receta) {

                                println(ingrediente)

                            }

                        }
                        else -> println("No es una receta valida")


                    }}

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

        makeRecipe()

    } else if (response == "2") {

        showRecipe()

    } else if (response == "3") {

        println("Saliendo..")
        break@menu

    }

} while (response != "3")

}

fun values() {


    verduras.addElement("Lechuga", verduras.getCantidadItem(), verduras.getElement(verduras.items))
    verduras.addElement("Zanahoria", verduras.getCantidadItem(), verduras.getElement(verduras.items))
    verduras.addElement("Coliflor", verduras.getCantidadItem(), verduras.getElement(verduras.items))
    verduras.addElement("Pimenton", verduras.getCantidadItem(), verduras.getElement(verduras.items))
    verduras.addElement("Cebolla", verduras.getCantidadItem(), verduras.getElement(verduras.items))
    verduras.addElement("Rabano", verduras.getCantidadItem(), verduras.getElement(verduras.items))

    leche.addElement("Leche normal", leche.getCantidadItem(), leche.getElement(leche.items))
    leche.addElement("Leche deslactosada", leche.getCantidadItem(), leche.getElement(leche.items))
    leche.addElement("Leche de almendras", leche.getCantidadItem(), leche.getElement(leche.items))

    frutas.addElement("Fresa", frutas.getCantidadItem(), frutas.getElement(frutas.items))
    frutas.addElement("Banano", frutas.getCantidadItem(), frutas.getElement(frutas.items))
    frutas.addElement("Uvas", frutas.getCantidadItem(), frutas.getElement(frutas.items))
    frutas.addElement("Manzana", frutas.getCantidadItem(), frutas.getElement(frutas.items))
    frutas.addElement("Naranja",frutas.getCantidadItem(),  frutas.getElement(frutas.items))
    frutas.addElement("Peras", frutas.getCantidadItem(), frutas.getElement(frutas.items))
    frutas.addElement("Cerezas", frutas.getCantidadItem(), frutas.getElement(frutas.items))

    carne.addElement("Carne de res", carne.getCantidadItem(), carne.getElement(carne.items))
    carne.addElement("Pechuga", carne.getCantidadItem(), carne.getElement(carne.items))
    carne.addElement("Pollo", carne.getCantidadItem(), carne.getElement(carne.items))

    huevos.addElement("Huevos A", huevos.getCantidadItem(), huevos.getElement(huevos.items))
    huevos.addElement("Huevos AA", huevos.getCantidadItem(), huevos.getElement(huevos.items))
    huevos.addElement("Huevos AAA", huevos.getCantidadItem(), huevos.getElement(huevos.items))

    cereal.addElement("Avena", cereal.getCantidadItem(), cereal.getElement(cereal.items))
    cereal.addElement("Trigo", cereal.getCantidadItem(), cereal.getElement(cereal.items))
    cereal.addElement("Arroz", cereal.getCantidadItem(), cereal.getElement(cereal.items))
    cereal.addElement("Maiz", cereal.getCantidadItem(), cereal.getElement(cereal.items))

    aceite.addElement("Aceite de oliva", aceite.getCantidadItem(), aceite.getElement(aceite.items))
    aceite.addElement("Aceite de algodon", aceite.getCantidadItem(), aceite.getElement(aceite.items))
    aceite.addElement("Aceite de maiz", aceite.getCantidadItem(), aceite.getElement(aceite.items))

}
