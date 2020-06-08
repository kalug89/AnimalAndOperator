class Eagle : Animal(), AbleToAttack {

    override val damage = 20

    override fun move() {
        println("${javaClass.name}: fly")
    }

    override fun attack() {
        println("${javaClass.name} attack: -$damage HP")
    }
}
