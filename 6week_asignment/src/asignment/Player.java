package uk.epl.player;
public class Player {
    private String name;
    private int jerseyNumber;

    private int[] abilities = new int[3];
    final int SPEED = 0; final int STAMINA = 1; final int PASSING = 2;
    Position position;
    public class Position{
        public int x;
        public int y;
    }
    public Player(String name, int jerseyNumber, int speed, int  stamina,int  passing){
        this.name = name; this.jerseyNumber = jerseyNumber; this.abilities[SPEED] = speed; this.abilities[STAMINA] = stamina; this.abilities[PASSING] = passing;
    }
    public Position getPosition(){
        return new Position(position.x, position.t);
    }
    private void moveUp(){
        float move_delta = getMoveDelta();
        position.y = (int)(position.y-move_delta);
        decreaseStamina();
    }

    private void decreaseStamina(){
        abilities[STAMINA] = (int)(abilities[STAMINA]-2);
    }

    private float getMoveDelta(){
        return 1 + getSpeed()/100*getStamina()/100;
    }

    protected float getStamina(){
        return (float)abilities[STAMINA];
    }

    protected float getPassing(){
            return (float)abilities[STAMINA];
        }

    protected float getSpeed(){
        return (float)abilities[SPEED];
    }

    public String toString(){
        return String.format("Player Name='%s, JerseyNumber=%d, Position (%d , %d) null SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f\n", name, jerseyNumber, position.x, position.y, getSpeed(), getStamina(), getPassing());
    }

    public int getNumber(){
            return jerseyNumber;
        }
}
