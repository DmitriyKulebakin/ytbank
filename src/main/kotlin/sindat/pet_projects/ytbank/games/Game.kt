package sindat.pet_projects.ytbank.games

interface Game {
    fun startGame()
    fun interruptGame()
    fun collectChips()
    fun distributeWonChips()
    fun addPlayer(player: Player)
    fun addPlayers(players: List<Player>)
}