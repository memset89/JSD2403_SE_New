package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegaAgeException {
        if (age < 0 || age > 200) {
            throw new IllegaAgeException("年龄超出了范围");
        }
        this.age = age;
    }

}
