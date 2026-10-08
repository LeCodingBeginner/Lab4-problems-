package problem7;

import java.util.Locale;

public class Person {
    // attributes:
    private String name;
    private String job;

    // constructor:
    public Person(String name,String job){
        this.name = name;
        this.job = job;
    }

    // getter:
    public String getName(){
        return this.name;
    }

    // setter:
    public void setName(String name){
        this.name = name;
    }

    // display:
    public void display(){
        System.out.println("I am " + this.name.substring(0,1).toUpperCase()+this.name.substring(1) + " the " + this.job.substring(0,1).toUpperCase()+this.job.substring(1));
    }
}

class Carpenter extends Person{
    // attributes:
    private String name;

    // constructor:
    public Carpenter(String name){
        super(name,"Carpenter");
    }

}

class Plumber extends Person{
    // attributes:
    private String name;

    // constructor:
    public Plumber(String name){
        super(name,"Plumber");
    }

}

