class Cat : AnimalAttacks() {

    private val animalName = "Cat"
    private val damage = "7"

    override fun move() {
        println("$animalName: walk")
    }

    override fun attack() {
        println("$animalName attack: -$damage HP")
    }

}
