fun main() {

//    Dog().move()
//    Dog().move("Azor")
//    Cat().move()
//    Fish().move()
//    Eagle().move()
//
//    Dog().attack()
//    Cat().attack()
//    Eagle().attack()
//
//    Dog().track()
//
//    Dog().age()
    val animalList = listOf(Dog(), Cat(), Cat(), Fish(), Fish(), Fish(), Eagle())

    animalList.forEach { it.move() }
    animalList.filterIsInstance<AnimalAttacks>().forEach { it.attack() }


}