package Game;

import java.util.Scanner;

/**
 * 程序实现功能
 * 游戏中不同角色可以使用不同的武器组成团队，计算团队的战斗值
 * 需求分析
 * 1.不同角色应该可以抽象出一个抽象类 包括角色的角色名称、等级等信息2.不同的角色去继承抽象觉得 并实现角色本事特有属性。
 * 3.不同的武器应该有一个公共的武器接口
 * 4.不同的角色应该拥有自己独有的武器类型 应该定义成接口传递给角色5.还应该有一个团队的类存储全部的角色
 * 程序中使用到的技术
 * 封装、继承、多态、抽象、接口
 */

public class main extends Role{
    public static void main(String[] args) {
        while (true) {
            String name="";
            int hp=0;
            int attack=0;
            int defence=0;
            int speed=0;
            int level=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入角色名称");
            String occupationName;
            name=sc.nextLine();
            if (name.equals("exit")){
                sumall();
                break;
            }
            //Role role1=new Role();
            System.out.println("请输入职业:战士/法师");
            occupationName=sc.nextLine();
            while (!occupationName.equals("战士")&&!occupationName.equals("法师")){
                System.out.println("请重新输入合法职业:战士/法师");
                occupationName=sc.nextLine();
            }
            //occupationName=sc.nextLine();

            System.out.println("请输入角色属性(生命，攻击，防御，速度，等级)");
            hp=sc.nextInt();
            attack=sc.nextInt();
            defence=sc.nextInt();
            speed=sc.nextInt();
            level=sc.nextInt();
            if (occupationName.equals("战士")){
                soldier role=new soldier(name,hp,attack,defence,speed,level);
                role.attadd();
                role.Speed_add();
                role.Hp_add();
                role.Attack_add();
                role.Defend_add();
                role.speadd();
                sumadd(role.fighting());
//                role1.attadd();
//                role1.Speed_add();
//                role1.Hp_add();
//                role1.Attack_add();
//                role1.Defend_add();
//                sumadd(role1.fighting());
            }
            else if(occupationName.equals("法师")){
                magician role=new magician(name,hp,attack,defence,speed,level);
                role.attadd();
                role.Speed_add();
                role.Hp_add();
                role.Attack_add();
                role.Defend_add();
                role.detadd();
                sumadd(role.fighting());
//                role1.attadd();
//                role1.Speed_add();
//                role1.Hp_add();
//                role1.Attack_add();
//                role1.Defend_add();
//                sumadd(role1.fighting());
            }
            //Role role=new Role(name,hp,attack,defence,speed,level,occupationName);
//            role.attadd();
//            role.Speed_add();
//            role.Hp_add();
//            role.Attack_add();
//            role.Defend_add();
//            switch (occupationName){
//                case "战士":{role.detadd();
//
//
//                    break;}
//                    //soldier role1=new soldier(name,hp,attack,defence,speed,level);
//
//                case "法师":{//magician role2=new magician();
//                    role.speadd();
////                    role2.attadd();
////
////                    role2.Speed_add();
////                    role2.Hp_add();
////                    role2.Attack_add();
////                    role2.Defend_add();
////                    sumadd(role2.fighting());
//                    break;}
//
//            }
            //sumadd(role.fighting());
//            role1.attadd();
//
//            role1.Speed_add();
//            role1.Hp_add();
//            role1.Attack_add();
//            role1.Defend_add();

        }


    }
    public static int n=0;
    public static void sumadd(int s) {
       n+=s;
    }
    public static void sumall() {
        System.out.println("队伍的总战力是："+n);
    }
}


