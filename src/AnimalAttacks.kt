import kotlin.random.Random

open class AnimalAttacks : Animal() {

 open fun attack() {
 }

 open fun age(){
  println(Random.nextInt(1, 10))
 }







}