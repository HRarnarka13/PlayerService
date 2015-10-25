package is.rufan.player.data;

import is.rufan.player.domain.FantasyPoint;
import is.rufan.player.domain.Player;

import java.util.List;

/**
 * Created by eysteinn on 25/10/15.
 */
public interface FantasyPointDataGateway {
    public void addFantasyPoint(FantasyPoint fantasyPoint);
    public List<FantasyPoint> getFantasyPoints();
    public FantasyPoint getFantasyPointById(int fantasyPointId);
    public FantasyPoint getFantasyPointByPlayerId(int playerId);
}
