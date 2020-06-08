/*
1) Zamiana Animalattacks na interface + able ( moge dodać pole z damage)
2) Zamiana damage na Int
3) Konstruktor  zopcjonalnym parametrem w klasie dog
4) w fun move w dog nie dajemy parametru z imieniem
5) klasa + fun Animal powinna być abstrakcyjna
6) Jak jest stała uzywamy const
 */


fun main() {

//    Dog().move()
//    Dog("Azor")
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
//    Dog().age
//    Dog().printAge()


    val animalList = listOf(Dog("Azor"), Cat(), Cat(), Fish(), Fish(), Fish(), Eagle())
//
    animalList.forEach { it.move() }
    animalList.filterIsInstance<AbleToAttack>().forEach { it.attack() }
    }