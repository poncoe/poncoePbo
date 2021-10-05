package tuags2;

public class GameCharacter {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    public GameCharacter(String name, int lifePoint, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.lifePoint = lifePoint;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public static void Hit(){

    }

    public static void Kick(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public int getAttackHitPoint() {
        return attackHitPoint;
    }

    public void setAttackHitPoint(int attackHitPoint) {
        this.attackHitPoint = attackHitPoint;
    }

    public int getAttackKickPoint() {
        return attackKickPoint;
    }

    public void setAttackKickPoint(int attackKickPoint) {
        this.attackKickPoint = attackKickPoint;
    }
}
