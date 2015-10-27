package is.rufan.player.data;

import is.rufan.player.domain.Player;

import java.util.List;

public interface PlayerDataGateway {
    public void addPlayer(Player player);
    public Player getPlayer(int playerid);
    List<Player> getPlayersByTeamAbbreviation(int leagueId, String teamAbbreviation);
    List<Player> getPlayersByTeamId(int leagueId, int teamid);
}
