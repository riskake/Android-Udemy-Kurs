import android.os.Build
import androidx.annotation.RequiresApi

class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {

    var weapon: Weapon = Weapon("Fist","Unarmed",1)
    private val inventory = ArrayList<Loot>()


    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
        name: $name
        lives: $lives
        level: $level
        score: $score
        weapon: $weapon
        """
    }

    fun getLoot (item: Loot){
        inventory.add(item)
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
        }

    @RequiresApi(Build.VERSION_CODES.N)
    fun dropLoot(name: String): Boolean {
        for (item in inventory) {
            if (item.name == name) {
                inventory.remove(item)
                return true
            }
        }
        return false
    }

    fun showInventory() {
        var total = 0.0
        println("$name's Inventory")
        for(item in inventory){
            println(item)
            total += item.value
        }
        println("Total score is: $total")
    }
}