package game

import boardgame.entitybase.BinaryId
import boardgame.game.Game
import boardgame.player.Player
import java.time.LocalDateTime

class GameTestFixturesUtils {
    fun createGame(player: Player) =
        Game(
            id = BinaryId.new(),
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now(),
            title = Game.Title("제목"),
            gameCreator = player,
        )
}
