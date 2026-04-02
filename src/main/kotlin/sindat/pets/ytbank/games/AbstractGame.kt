package sindat.pets.ytbank.games

abstract class AbstractGame(val gameId: Long): Game {
    protected val players = mutableListOf<Player>()
}