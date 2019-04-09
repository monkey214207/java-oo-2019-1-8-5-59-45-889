package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String baseIntroduce = super.introduce();
        return baseIntroduce+" I am a Student. I am at Class "+klass.getNumber()+".";
    }
}
