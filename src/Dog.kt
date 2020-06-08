class Dog() : Animal(), AbleToAttack {
    private lateinit var name: String

    constructor(name: String): this(){
        this.name = name
    }

    override val damage = 15

    override fun move() {
        println("${javaClass.name}: walk")
    }

    override fun attack() {
        println("${javaClass.name} attack: -$damage HP")
    }

    fun track() {
        println("Sniff...")
    }
}
