package Game;

public class Role {
    private String name;
    private int hp;
    private int attack;
    private int defence;
    private int speed;
    private int level;
    private String occupationName;
    Role(String name,int hp,int attack,int defence,int speed,int level,String occupationName){
        this.name=name;
        this.hp=hp;
        this.attack=attack;
        this.defence=defence;
        this.speed=speed;
        this.level=level;
        this.occupationName=occupationName;
    }
    Role(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defence=" + defence +
                ", speed=" + speed +
                ", level=" + level +
                '}';
    }
    public int fighting(){
        int sum=(hp*5+attack*8+defence*3+speed*6)*level*5;
        System.out.println(occupationName+name+"的战斗力为:"+sum);
        return sum;
    }
    public void Attack_add()
    {
    }
    public void Defend_add()
    {
    }
    public void Speed_add()
    {
    }
    public void Hp_add()
    {
    }
    public void attadd()
    {
    }
    public void detadd()
    {
    }
    public void speadd()
    {
    }
}
