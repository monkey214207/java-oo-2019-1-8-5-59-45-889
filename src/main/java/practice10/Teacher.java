package practice10;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person{

    private Klass klass;
    private LinkedList<Klass> classes;

    public Teacher(int id,String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Klass getKlass() {
        return klass;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if(classes == null || classes.size() == 0){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        else{
            String classesString = "";
            for (int i = 0; i < classes.size()-1; i++) {
                classesString += classes.get(i).getNumber();
                classesString += ", ";
            }
            classesString += classes.get(classes.size()-1).getNumber();
            return super.introduce()+" I am a Teacher. I teach Class "+classesString+".";
        }
    }

    public String introduceWith(Student student) {
        if(klass.getNumber() == student.getKlass().getNumber()){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        else{
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
    }

    public boolean isTeaching(Student student) {
        return false;
    }
}
