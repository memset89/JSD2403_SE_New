package Game;

public class magician extends Role implements wand{
    //private String occupationName;
    magician(){}
    magician(String name,int hp,int attack,int defence,int speed,int level)
    {
        super(name,hp,attack,defence,speed,level,"法师");
        //this.occupationName=occupationName;
    }

    public void Attack_add() {
        int x=super.getAttack();
        x*=10;
        super.setAttack(x);
    }
    public void  Defend_add() {
        int x=super.getDefence();
        x/=10;
        super.setDefence(x);
    }
    public void Speed_add() {
        int x=super.getSpeed();
        x*=10;
        super.setSpeed(x);
    }
    public void Hp_add() {
        int x=super.getHp();
        x/=2;
        super.setHp(x);
    }
    public void attadd()
    {
        int x=super.getAttack();
        x+=3000;
        super.setAttack(x);
    }
    public void speadd()
    {
        int x=super.getSpeed();
        x+=5000;
        super.setSpeed(x);
    }
}
