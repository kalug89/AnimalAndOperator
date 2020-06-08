class Fish : Animal() {

    override fun move() {
        println("${javaClass.name}: swim")
    }
}
