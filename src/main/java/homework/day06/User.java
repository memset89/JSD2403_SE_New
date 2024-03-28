package homework.day06;

import java.io.Serializable;

public class User implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private String psd;
    private String nick;
    private int age;
    User(String name, String psd, String nike, int age)
    {
        this.name = name;
        this.psd = psd;
        this.nick = nike;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public String getNike() {
        return nick;
    }

    public void setNike(String nike) {
        this.nick = nike;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", psd='" + psd + '\'' +
                ", nike='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
}
