package practice05;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        String baseIntroduce = super.introduce();
        return baseIntroduce+" I am a Worker. I have a job.";
    }

}
