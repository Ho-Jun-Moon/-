package uk.epl.player;

public class Midfielder extends Player {
    private int STRENGTH_POINT = 10;

    @Override
    protected float getPassing() {
        return super.getPassing() + STRENGTH_POINT;
    }
    @Override
    public String toString(){
            return String.format("Player Name='%s, JerseyNumber=%d, Position (%d , %d) Defender SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f\n", name, jerseyNumber, position.x, position.y, getSpeed(), getStamina(), getPassing());
        }

}
