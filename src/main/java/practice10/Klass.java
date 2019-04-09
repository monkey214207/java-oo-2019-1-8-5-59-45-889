package practice10;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }

    public void assignLeader(Student leader) {
        if(leader.getKlass().getNumber() == number){
            this.leader = leader;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(number);
    }

    public boolean isIn(Student student) {
        return number == student.getKlass().getNumber();
    }
}
