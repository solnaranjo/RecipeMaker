package recipes

class Recipe (title: String?): Base() {

    private var title1: String? = title
    private var ingredients = mutableListOf<String?>()

    fun getTitle(): String? {

        return title1

    }

    fun setTitle(title: String) {

        this.title1 = title

    }

    fun getIngredients(): MutableList<String?> {

        return ingredients

    }

    fun getElement() {


    }

    fun addElement(value: String?, list:MutableList<String?>) {

        list.add(value)

    }

}