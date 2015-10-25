package is.rufan.player.process;

import is.rufan.player.domain.FantasyPoint;
import is.rufan.player.domain.Player;
import is.ruframework.reader.RuAbstractReader;
import is.ruframework.reader.RuJsonUtil;
import is.ruframework.reader.RuReaderException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arnarkari on 25/10/15.
 *
 * @author arnarkari
 */
public class FantasyPointReader extends RuAbstractReader {

    public Object parse(String content) throws RuReaderException {

        // Root array
        JSONArray jsonArray = (JSONArray) JSONValue.parse(content);
        JSONObject fantacyData;

        List<FantasyPoint> fantasyPoints = new ArrayList<FantasyPoint>();
        for (int i = 0; i < jsonArray.size(); i++) {
            FantasyPoint fantasyPoint = new FantasyPoint();
            fantacyData = (JSONObject) jsonArray.get(i);

            int playerid = RuJsonUtil.getInt(fantacyData, "PlayerId"));
            JSONObject json_points = (JSONObject) fantacyData.get("FantasyPoints");
            double points = Double.parseDouble(json_points.toString());

            fantasyPoint.setPlayerId(playerid);
            fantasyPoint.setFantasyPoints(points);
            fantasyPoints.add(fantasyPoint);
        }
        return fantasyPoints;
    }
}



