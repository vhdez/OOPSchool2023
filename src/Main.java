public class Main {
    public static void main(String[] args) {

        System.out.println("Let's create an OOP model for SLA:");

        Teacher teacher1 = new Teacher();
        teacher1.name = "Mr. Latimer";
        teacher1.subject = "Algebra 2";
        // teacher1.student = ???;
        teacher1.greetStudents();
    }
}