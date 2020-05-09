fun main() {
    val player = Player()
    player.castFireball()

    // Аура
    val auraColor = player.auraColor()
//        isBlessed, healthPoints, isImmortal)
    // Состояине игрока
    printPlayerStatus(player)
    // Аура
    player.auraColor(isBlessed, healthPoints, isImmortal)
}

private fun printPlayerStatus(player: Player) {
    println("(Aura: ${player.auraColor()}) " +
                "(Blessed: ${if (player.isBlessed) "YES" else "NO"})")
    println("${player.name} ${player.formatHelthStatus()}")
}



