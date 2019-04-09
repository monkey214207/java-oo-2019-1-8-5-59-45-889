package practice10;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String baseIntroduce = super.introduce();
        if (klass.getLeader() == null || klass.getLeader().getId() != this.getId()){
            return baseIntroduce+" I am a Student. I am at Class "+klass.getNumber()+".";
        }
        return baseIntroduce+" I am a Student. I am Leader of Class "+klass.getNumber()+".";
    }
}
