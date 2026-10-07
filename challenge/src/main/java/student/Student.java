package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(prenom,nom,telephone,email);
        this.cne = cne;
        this.major = new Major("22885676","computer science");
        major.addStudent(this);
    }
    // Getters
    public String getCne(){
        return this.cne;
    }

    public Major getMajor(){
        return this.major;
    }

    // Setters
    public void setCne(String cne){
        this.cne = cne;
    }

    public void getMajor(Major major){
        this.major = major;
    }

    // fullname:
    public String getFullNameFormatted(){
        return String.format("%s %s",this.getSecondName().toUpperCase(),this.getFirstName());
    }

}
