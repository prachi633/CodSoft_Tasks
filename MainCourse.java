import java.util.HashMap;
import java.util.Scanner;

public class MainCourse {

    public static HashMap<String, Course> courses = new HashMap<>();
    public static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Adding courses
        courses.put("C111", new Course("C111", "Full stack Java developer", "Basic and Advance java concept", 50, "Thu & Sat 12-1:30"));
        courses.put("C112", new Course("C112", "Computer Network", "Introduction to computer network", 30, "Tue & Thu 1-2:30"));
        courses.put("C113", new Course("C113", "Flutter developer", "Introduction to flutter", 20, "Mon & Wed 11-12:30"));

        // Adding students
        students.put("S121", new Student("S121", "Prachi"));
        students.put("S122", new Student("S122", "Riya"));
        students.put("S123", new Student("S123", "Ishita"));

        while (true) {
            System.out.println("Welcome");
            System.out.println("1. List courses");
            System.out.println("2. Register for a course");
            System.out.println("3. Drop a course");
            System.out.println("4. List registered courses");
            System.out.println("5. Exit");

            System.out.println("Choose an option");
            int option = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.println("Course list");
                    listCourses();
                    break;

                case 2:
                    System.out.println("Enter student ID");
                    String studentId = sc.nextLine();
                    System.out.println("Enter course code");
                    String courseCode = sc.nextLine();
                    registerForCourse(studentId, courseCode);
                    break;

                case 3:
                    System.out.println("Enter student ID");
                    studentId = sc.nextLine();
                    System.out.println("Enter course code");
                    courseCode = sc.nextLine();
                    dropCourse(studentId, courseCode);
                    break;

                case 4:
                    System.out.println("Enter student ID");
                    studentId = sc.nextLine();
                    listRegisteredCourses(studentId);
                    break;

                case 5:
                	System.out.println("Thank you");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void listCourses() {
        System.out.println("Available courses:");
        for (Course course : courses.values()) {
            System.out.println(course);
        }
    }

    private static void registerForCourse(String studentId, String courseCode) {
        Student student = students.get(studentId);
        Course course = courses.get(courseCode);

        if (student != null && course != null) {
            student.registerCourse(course);
        } else {
            System.out.println("Invalid student ID or course code.");
        }
    }

    private static void dropCourse(String studentId, String courseCode) {
        Student student = students.get(studentId);
        Course course = courses.get(courseCode);

        if (student != null && course != null) {
            student.dropCourse(course);
        } else {
            System.out.println("Invalid student ID or course code.");
        }
    }

    private static void listRegisteredCourses(String studentId) {
        Student student = students.get(studentId);

        if (student != null) {
            System.out.println("\nRegistered courses for " + student.getName() + ":");
            for (Course course : student.getRegisteredCourses()) {
                System.out.println(course);
            }
        } else {
            System.out.println("Invalid student ID.");
        }
    }
}
