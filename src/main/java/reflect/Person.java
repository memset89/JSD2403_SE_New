package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass

public class Person {
    //@AutoRunClass
    private String name;
    Person(){

    }
    Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println(name+"hello");
    }
    @AutoRunMethod
    public void sayHi(){
        System.out.println(name+"Hi");
    }
    public void sayBye(){
        System.out.println(name+"Bye");
    }
    public void doSome(){
        System.out.println(name+"doSome");
    }
    @AutoRunMethod(3)
    public void sleep(){
        System.out.println(name+"sleep");
    }
    public void watchtv(){
        System.out.println(name+"watchtv");
    }
    public void study(){
        System.out.println(name+"study");
    }
    public void playGame(){
        System.out.println(name+"playGame");
    }
    @AutoRunMethod(2)
    public void sing(){
        System.out.println(name+"sing");
    }
    public void say(String str){
        System.out.println(name+str);
    }
    public void say(String str,int num){
        for (int i = 0; i < num; i++) {
            System.out.println(name+":"+str);
        }
    }
    private void hehe(){
        System.out.println("我是Person的私有方法！");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
