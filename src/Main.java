public class Main {
    public static void main(String[] args){
        Student PennyLane = new Student();

        PennyLane.studentNumber = 33;
        PennyLane.dateOfBirth = "13/10/2005";
        PennyLane.favSubject = "Computing";

        System.out.println(PennyLane.favSubject);


        Student JudeBrooker = new Student();
        JudeBrooker.studentNumber = 91631;
        JudeBrooker.dateOfBirth = "23/02/2003";
        JudeBrooker.favSubject = "Computer Science";
        System.out.println(JudeBrooker.dateOfBirth);

        
    }
}
