package is.rufan.player.domain;

/**
 * Created by eysteinn on 25/10/15.
 */
public class FantasyPoint {
    private int fantasyPointId;
    private Player player;
    private double fantasyPoints;

    public FantasyPoint() {
    }

    public FantasyPoint(int fantasyPointId, Player player, double fantasyPoints) {
        this.fantasyPointId = fantasyPointId;
        this.player = player;
        this.fantasyPoints = fantasyPoints;
    }

    public int getFantasyPointId() {
        return fantasyPointId;
    }

    public void setFantasyPointId(int fantasyPointId) {
        this.fantasyPointId = fantasyPointId;
    }

    public FantasyPoint(Player player, double fantasyPoint) {

        this.player = player;
        this.fantasyPoints = fantasyPoint;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getFantasyPoints() {
        return fantasyPoints;
    }

    public void setFantasyPoints(double fantasyPoints) {
        this.fantasyPoints = fantasyPoints;
    }

}
