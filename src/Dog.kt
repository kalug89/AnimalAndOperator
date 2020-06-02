class Dog : AnimalAttacks() {
    private val animalName = "Dog"
    private val damage = "15"

    override fun move() {
        println("$animalName: walk")
    }

    override fun move(firstName: String) {
        println("$firstName: walk")
    }

    override fun attack() {
        println("$animalName attack: -$damage HP")
    }

    fun track() {
        println("Sniff...")
    }

}
