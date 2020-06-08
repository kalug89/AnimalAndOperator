import kotlin.random.Random

abstract class Animal {

    val age = Random.nextInt(1, 10)

    open fun printAge(){
        println(age)
    }

    abstract fun move()
}
