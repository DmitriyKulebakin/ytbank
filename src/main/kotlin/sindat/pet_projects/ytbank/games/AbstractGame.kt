package sindat.pet_projects.ytbank.games

abstract class AbstractGame(val gameId: Long): Game {
    protected val players = mutableListOf<Player>()
}