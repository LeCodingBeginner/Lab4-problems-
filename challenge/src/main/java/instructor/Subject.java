package instructor;

import java.util.Locale;

public class Subject {
    // attribute:
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    // constructor:
    public Subject(int id, String code, String title,Instructor instructor){
        this.id = id;
        this.title = title;
        this.code = code;
        this.instructor = instructor;
    }

    // methods:
    public String normalizedCode(){
        return this.code.toUpperCase().trim();
    }

    public String properTitle() {
        if (this.title.isEmpty()){
            return "";
        }
        String result = "";
        String[] helper = this.title.trim().split(" ");
        for (int i = 0; i<helper.length;i++){
            if(!helper[i].isEmpty()){
                result = result.concat(helper[i].substring(0,1).toUpperCase().concat(helper[i].substring((1))));
                if (i< helper.length-1){
                    result = result.concat(" ");
                }
            }

        }
        return result;
    }

    public boolean isIntroCourse(){
        if (this.title.substring(0,5).toLowerCase().contains("intro")|| this.code.substring(0,6).toUpperCase().startsWith("INTRO-")){
            return true;
        }
        return false;
    }

    public String syllabusLine(){
        StringBuilder s = new StringBuilder(code+"-");
        s.append(" ").append(title).append(" ").append("(Instructor: ").append(instructor.getSecondName()).append(", ").append(instructor.getFirstName()).append(")") ;
        return s.toString();
    }


}
