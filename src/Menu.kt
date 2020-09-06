open class Menu(private val title: String, private val arrayMenu: List<String>, private val exitTitle: String) :
    MenuInterface {
    override fun printMenu() {
        println("------- $title -------")
        for ((i, el) in arrayMenu.withIndex()) {
            val number = i + 1
            println("$number. $el")
        }
        println("0. $exitTitle")
        print("Choose your challenge:")
    }
}