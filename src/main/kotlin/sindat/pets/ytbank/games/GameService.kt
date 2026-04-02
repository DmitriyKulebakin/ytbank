package sindat.pets.ytbank.games

import org.springframework.stereotype.Service
import sindat.pets.ytbank.users.obj.User

@Service
class GameService {




    fun startGame(game: Game, players: List<Player>) {
        game.addPlayers(players)
    }

    private fun createPlayer(user: User): Player {

    }
}