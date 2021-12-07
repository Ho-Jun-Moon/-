package uk.epl.player;

public class Forward extends Player {
    private int ACCELERATION_POINT = 10;

    @Override
    protected float getSpeed() {
        return super.getSpeed() + ACCELERATION_POINT;
    }
    @Override
    public String toString(){
            return String.format("Player Name='%s, JerseyNumber=%d, Position (%d , %d) Forward SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f\n", name, jerseyNumber, position.x, position.y, getSpeed(), getStamina(), getPassing());
        }

}
