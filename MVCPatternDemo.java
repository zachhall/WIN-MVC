public class MVCPatternDemo {
    public static void main(String[] args) {

        // fetch student record from the database
        Student model = retrieveStudentFromDatabase();

        // Create a view to write students on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);
        controller.updateView();

        // Update model data
        controller.setStudentName("Kaley");
        controller.setStudentRollNo("14");
        controller.updateView();

    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Zach");
        student.setRollNo("31");
        return student;
    }
}