package recipes

import recipes.Base as Base

class Category (cantidad: Int): Base() {

    private var cantidadItem = cantidad
    var items = mutableListOf<String?>()


    fun getCantidadItem(): Int {

        return cantidadItem

    }

    fun setCantidadItem(cantidadItem: Int) {

        this.cantidadItem = cantidadItem

    }

}