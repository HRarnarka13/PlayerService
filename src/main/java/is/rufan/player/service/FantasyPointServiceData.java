package is.rufan.player.service;


import is.rufan.player.data.FantasyPointDataGateway;
import is.rufan.player.data.PlayerDataGateway;
import is.rufan.player.domain.FantasyPoint;
import is.rufan.player.domain.Player;
import is.ruframework.data.RuDataAccessFactory;
import is.ruframework.domain.RuException;

import java.util.Collection;
import java.util.List;
/**
 * Created by eysteinn on 25/10/15.
 */
public class FantasyPointServiceData implements FantasyPointService {


    RuDataAccessFactory factory;
    FantasyPointDataGateway fantasyPointDataGateway;

    public FantasyPointServiceData() throws RuException {
        factory = RuDataAccessFactory.getInstance("playerdata.xml");
        fantasyPointDataGateway = (FantasyPointDataGateway) factory.getDataAccess("fantasyPointData");
    }

    public void addFantasyPoint(FantasyPoint fantasyPoint) throws FantasyPointException {
        fantasyPointDataGateway.addFantasyPoint(fantasyPoint);
    }

    public FantasyPoint getFantasyPointByPlayerId(int playerId) {
        return null;
    }

    public FantasyPoint getFantasyPointById(int fantasyPointId) {
        return null;
    }

    public List<FantasyPoint> getFantasyPoints() {
        return null;
    }

    public void addFantasyPoint(Player player, double fantasyPoint) throws FantasyPointException {

    }
}
