package practice11;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;

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
        if (teacher != null){
            System.out.print("I am "+teacher.getName()+". I know "+leader.getName()+" become Leader of Class "+number+".\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(number);
        if (teacher != null){
            System.out.print("I am "+teacher.getName()+". I know "+student.getName()+" has joined Class "+number+".\n");
        }
    }

    public boolean isIn(Student student) {
        return number == student.getKlass().getNumber();
    }
    public void assignTeacher(Teacher teacher){
        this.teacher = teacher;
    }
}
