package sindat.pets.ytbank.games

import sindat.pets.ytbank.users.obj.User

interface Game {
    fun startGame()
    fun interruptGame()
    fun collectChips()
    fun distributeWonChips()
    fun addPlayer(player: Player)
    fun addPlayers(players: List<Player>)
}