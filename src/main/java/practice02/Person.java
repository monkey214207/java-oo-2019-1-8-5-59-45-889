package practice02;

public class Person {
    private  String name;
    private  int age;

    public Person(String tom, int i) {
        this.name = tom;
        this.age = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String introduce() {
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
}
