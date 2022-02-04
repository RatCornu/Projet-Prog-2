package monster

import attack._
import fighter._

abstract class Monster extends Fighter {
    
}

class Slime extends Monster {
    override val id = 1
    override val name = "Slime"

    override var lifePoints = 10
    val meleeCapacity = 1
    val rangeCapacity = 1
    val strength = 1
    val toughness = 1

    val attacks = new Array[Attack](4)
    for (i <- 0 to 3) {
        attacks(i) = new Punch
    }
}