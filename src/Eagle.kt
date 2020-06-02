class Eagle : AnimalAttacks() {

    private val animalName = "Eagle"
    private val damage = "20"

    override fun move() {
        println("$animalName: fly")
    }

    override fun attack() {
        println("$animalName attack: -$damage HP")
    }

}
