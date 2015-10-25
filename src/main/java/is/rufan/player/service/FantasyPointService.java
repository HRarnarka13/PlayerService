package is.rufan.player.service;

import is.rufan.player.domain.FantasyPoint;
import is.rufan.player.domain.Player;

import java.util.List;

/**
 * Created by eysteinn on 25/10/15.
 */
public interface FantasyPointService {
    FantasyPoint getFantasyPointByPlayerId(int playerId);
    FantasyPoint getFantasyPointById(int fantasyPointId);
    List<FantasyPoint> getFantasyPoints();
    void addFantasyPoint(FantasyPoint fantasyPoint) throws FantasyPointException;
}
