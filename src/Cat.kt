class Cat : Animal(), AbleToAttack {

    override val damage = 7

    override fun move() {
        println("${javaClass.name}: walk")
    }

    override fun attack() {
        println("${javaClass.name} attack: -$damage HP")
    }
}
