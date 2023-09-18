public class Teacher {
    // Fields
    String name;
    String subject;
    Student student;

    void greetStudents() {
        System.out.println("Hi students, it's " + name);
    }

    void giveLesson() {
        System.out.println("Alright everyone, let's talk about...");
    }

    void assignHW() {
        System.out.println("Tonight I need you to...");
    }
}
