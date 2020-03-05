class Weapon(val name: String, val type: String, var damageInflicted: Int) {

    override fun toString(): String {

        return """
            Weapon name: $name
            Weapon type: $type
            Damage inflicted: $damageInflicted
            """
    }
}