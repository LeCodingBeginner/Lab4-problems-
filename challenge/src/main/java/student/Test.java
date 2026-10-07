package student;

public class Test {
    public static void main(String[] args) {


        // Display computer science students:
        Major m1 = new Major();
        Major m2 = new Major("23","Computer Science");
        Major m3 = new Major();

        // create the students:
        Student s1 = new Student("Amal","Safi","999-999-999","email@example.com","22885676");
        Student s2 = new Student("Sami","Alami","999-999-998","email@example.com","23885776");

        m2.addStudent(s1);
        m2.addStudent(s2);

        System.out.println("--------  Testing display -------");
        System.out.println(m2.toString());
        m2.displayStudents();

        System.out.println("--------  Testing rate+count -------");

        System.out.println("Current enrollment: " + m2.getStudentCount() + " students");
        m2.getOccupancyRate();

        System.out.println("--------  Testing getStudentListAsString -------");
        System.out.println(m2.getStudentListAsString());


    }
}

