package Game;
//战士类
public class soldier extends Role implements sword{

    private String occupationName;
    soldier(){}
    soldier(String name,int hp,int attack,int defence,int speed,int level)
    {
        super(name,hp,attack,defence,speed,level,"战士");
        //this.occupationName=occupationName;
    }

    public void Attack_add() {
       int x=super.getAttack();
       x*=5;
       super.setAttack(x);
    }
   public void  Defend_add() {
        int x=super.getDefence();
        x*=10;
        super.setDefence(x);
    }
    public void Speed_add() {
        int x=super.getSpeed();
        x*=2;
        super.setSpeed(x);
    }
    public void Hp_add() {
        int x=super.getHp();
        x+=2000;
        super.setHp(x);
    }
    public void attadd()
    {
        int x=super.getAttack();
        x+=1000;
        super.setAttack(x);
    }
    public void detadd()
    {
        int x=super.getDefence();
        x+=2000;
        super.setDefence(x);
    }


}
