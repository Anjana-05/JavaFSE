package MVCPatternExample;

public class MVCTest {

    public static void main(String[] args) {

        Student student =
                new Student("Anjana",101,"A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.display();

        controller.updateName("Anjana K");

        controller.display();
    }
}

