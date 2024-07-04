import java.util.ArrayList;

public class Student {

    String studentId;
    String name;
    ArrayList<Course> registeredCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void registerCourse(Course course) {
        if (course.registerStudent()) {
            registeredCourses.add(course);
            System.out.println("Successfully registered for " + course.getTitle());
        } else {
            System.out.println("Course " + course.getTitle() + " is full.");
        }
    }

    public void dropCourse(Course course) {
        if (registeredCourses.remove(course)) {
            course.dropStudent();
            System.out.println("Successfully dropped " + course.getTitle());
        } else {
            System.out.println("You are not registered for " + course.getTitle());
        }
    }
}
