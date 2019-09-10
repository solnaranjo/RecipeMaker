package recipes

abstract class Base {

    var cantidad: Int = 0

    //var elements = mutableListOf<String?>()

    open fun addElement(value: String?, cantidad: Int, list:MutableList<String?>) {

        if (list.size > cantidad) {

            list.add(value)

        }

    }

    open fun getElement(elements: MutableList<String?>): MutableList<String?> {

        return elements

    }

}