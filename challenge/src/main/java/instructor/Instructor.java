package instructor;
import student.Person;


public class Instructor extends Person{

    // attributes:
    private String employeeNumber;

    // constructor:
    public Instructor(String employeeNumber,String nom, String prenom, String telephone, String email){
        super(prenom,nom,telephone,email);
        this.employeeNumber = employeeNumber;
    }
    // methods:
    public String cleanEmployeeNumber(){
        return this.employeeNumber.replaceAll("\\s+","");
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",this.employeeNumber,this.firstName,this.secondName);
    }

    public String toCard(){
        StringBuilder s = new StringBuilder("Instructor \n ------- \n Employee #: "+employeeNumber+"\nName : " +firstName+", " + secondName + "\n Email: " + email + "\nPhone : " +phone);
        return s.toString();
    }

    public String displayName(){
        StringBuilder s = new StringBuilder();
        if (this.firstName == null){
            if (this.secondName != null){
                s.append(this.secondName);
            }
            return s.toString();
        }
        else{
            s.append(this.firstName);
            if (this.secondName != null){
                s.append(this.secondName);
            }
            return s.toString();
        }
    }
}
