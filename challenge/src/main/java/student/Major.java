package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    // no arg constructor:
    public Major(){
        this("23","Computer Science");
    }

    // init constructor:
    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        this.id = nextId;
        this.studentCount = 0;
        nextId++;
        this.students = new Student[50];
    }

    // Method to add a student
    public void addStudent(Student s) {
            if (this.studentCount < 50){
                students[this.studentCount] = s;
                this.studentCount++;
            }
            else{System.out.println("Major is saturated, no more new enrollees");}


    }

    // Getters
    public int getId(){
        return this.id;
    }

    public static int getNextId(){
        return nextId;
    }

    public int getStudentCount(){
        int count = 0;
        for (Student s : students){
            if (s!=null){
                count++;
            }
        }
        return count;
    }

    public String getCode() {
        return code;
    }

    public String getName(){
        return this.name;
    }

    public Student[] getStudents(){
        return this.students;
    }

    // setters
    public void setCode(String code){
        this.code = code;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }



    public String toString(){
        return "The major is " + this.name + " of code " + this.code;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("Students enrolled in " + this.name + " are :");
        for (Student s : students){
            if (s!=null) {
                System.out.println(s.getFullNameFormatted());
            }
        }
    }

    // search by cne:
    public Student findStudentByCNE(String cne){
        for (Student s : this.students){
            if (s!=null && s.getCne().equals(cne)){
                return s;
            }
        }
        return null;
    }

    // removing student by cne:
    public boolean removeStudentByCNE(String cne){
        if (findStudentByCNE(cne) != null){
            // let's delete it:
            for (int i = 0; i < this.studentCount ; i++){
                if (students[i].getCne().equals(cne)){
                    for (int j=i;j<this.studentCount-1;j++){
                        students[j] = students[j+1];
                    }
                    break;
                }

            }
                students[this.studentCount-1] = null;

            this.studentCount--;
            return true;
        }
        return false;
    }

    // display the occupied capacity:
    public void getOccupancyRate(){
        System.out.println("The occupancy rate = " + getStudentCount()*2.0 + "%");
    }

    // getStudentListAsString():
    public String getStudentListAsString(){
        StringBuilder result = new StringBuilder("The students are: \n");
        for (Student s : students){
            if (s!=null){
                result.append(s.getFullNameFormatted()).append("\n");
            }
        }

        return result.toString();
    }

}
