package MVCPatternExample;

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model,
                             StudentView view) {

        this.model = model;
        this.view = view;
    }

    public void updateName(String name) {
        model.setName(name);
    }

    public void display() {
        view.displayStudentDetails(model);
    }
}
