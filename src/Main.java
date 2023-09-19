public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Andrew Sears";

        Teacher teacher1 = new Teacher();
        teacher1.name = "Mr. Latimer";
        teacher1.greetStudents();
        teacher1.subject = "Algebra 2";
        teacher1.giveLesson();
        teacher1.student = student1;

        Teacher teacher2 = new Teacher();
        teacher2.name = "Mr. Reddy";
        teacher2.greetStudents();
        teacher2.subject = "Pre-Calculus";
        teacher2.giveLesson();

    }
}