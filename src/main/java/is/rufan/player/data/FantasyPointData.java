package is.rufan.player.data;

import is.rufan.player.domain.FantasyPoint;
import is.rufan.player.domain.Player;
import is.ruframework.data.RuData;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Created by eysteinn on 25/10/15.
 */
public class FantasyPointData extends RuData implements FantasyPointDataGateway {


    public void addFantasyPoint(FantasyPoint fantasyPoint) {
        SimpleJdbcInsert insertFantasyPoint =
                new SimpleJdbcInsert(getDataSource()).withTableName("fantasypoints");
        Map<String, Object> fantasyPointParameters = new HashMap<String, Object>(3);
        fantasyPointParameters.put("playerId", fantasyPoint.getPlayer().getPlayerId());
        fantasyPointParameters.put("fantasyPoint", fantasyPoint.getFantasyPoints());
        fantasyPointParameters.put("fantasyPointId", fantasyPoint.getFantasyPointId());

        try
        {
            insertFantasyPoint.execute(fantasyPointParameters);
        }
        catch (DataIntegrityViolationException divex)
        {
            log.warning("Duplicate entry");
        }

    }

    public List<FantasyPoint> getFantasyPoints() {
        return null;
    }

    public FantasyPoint getFantasyPointById(int fantasyPointId) {
        return null;
    }

    public FantasyPoint getFantasyPointByPlayerId(int playerId) {
        return null;
    }
}
