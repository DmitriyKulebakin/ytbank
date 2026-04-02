package sindat.pets.ytbank.games

import org.springframework.stereotype.Service

@Service
class GameService {


    fun startGame(game: Game, players: List<Player>) {
        game.addPlayers(players)
    }
}