import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION,4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR,183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING,25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION,2.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR,-8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING,1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR,4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING,12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING,12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING,12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION,3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING,6.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING,6.0))
    conan.showInventory()

    conan.dropLoot("Silver Ring")
    conan.showInventory()

    val dropped = conan.dropLoot("Something not present")
    println(dropped)

}

//    val tim = Player("Tim")
//    val sword = Weapon("Dick slicer", "Sword",3500)
//    val spear = Weapon("Anal Ambush", "Spear",5000)
//    tim.weapon = sword
//    println(tim.toString())
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
//    tim.getLoot(redPotion)
//    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR,80.00)
//    tim.getLoot(chestArmor)
//    tim.showInventory()
//
//    tim.getLoot(Loot("Ring of Protection + 2", LootType.RING,40.25))
//    tim.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
//    tim.showInventory()
//
//    if (tim.dropLoot(redPotion)) {
//        tim.showInventory()
//    }
//    else {
//        println("You don't have a ${redPotion.name}")
//    }
//
//    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
//    if (tim.dropLoot(bluePotion)) {
//        tim.showInventory()
//    }
//    else {
//        println("You don't have a ${bluePotion.name}")
//    }
//
//    if (tim.dropLoot("Invisibility Potion")) {
//        tim.showInventory()
//    }
//    else {
//        println("You don't have an Invisibility Potion")
//    }


/*
    println("Hello World")
    println("My first Kotlin Program")
    val salary = 5
    val salaryTimesTwo = salary * 2
    println()
    println("Min salary er " + salary + ", og min salary * 2 er $salaryTimesTwo")
    println()
    println("How old are you?")
    val age = readLine()!!.toInt()
    val message: String
    message = when {
        age < 18 -> "Du er mindreårig!"
        age >= 18  && age < 30 -> "Du er en ung voksen"
        else -> "Du passer ikke inn i noen av kategoriene mine :("
    }
    println(message)
    */

/*
    println(anneBeate.weapon.name.toUpperCase())
    println(anneBeate.weapon.damageInflicted)

    val axe = Weapon("Axe", 12)
    louise.weapon = axe
    println(louise.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(louise.weapon.damageInflicted)

    tim.weapon = Weapon("Sword",10)
    println(tim.weapon.name)

    tim.weapon = Weapon("Spear",14)
    println(tim.weapon.name)
    */

/*
val louise = Player("Louise", 8,4)
    val anneBeate = Player("AnneBeate",5,2,1000)

    louise.weapon = sword
    louise.show()
    tim.weapon = spear
    tim.show()
 */

//    for(i in 1..100) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            println(i)
//        }
//    }

/*
val styggePer = Enemy("StyggePer", 100, 5)
    println(styggePer)
    styggePer.takeDamage(20)
    println(styggePer)
 */

/*
val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    println()

    val vlad = Vampire("vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    println()

    val dracula = VampireKing("Dracula")
    println(dracula)
    dracula.takeDamage(12)
    print(dracula)

    while (dracula.lives > 0) {

        if (dracula.dodges()) {
            continue
        }

        if (dracula.runAway()) {
            println("Dracula ran away")
            break
        } else {
            dracula.takeDamage(12)
        }
    }
 */

/*
val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION,4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR,183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING,25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION,2.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR,-8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING,1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR,4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING,12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION,3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING,6.0))
    conan.showInventory()
 */


//  for (i in 1..10) {
/*
val dracula = VampireKing("Dracula")
println(dracula)

dracula.lives = 0

do {
    if (dracula.dodges()) {
        dracula.lives += 1
        continue
    }
    if (dracula.runAway()) {
        println("Dracula ran away")
        break
    } else {
        dracula.takeDamage(80)
    }
} while (dracula.lives > 0)
println("---------------------------")
}
*/
//}