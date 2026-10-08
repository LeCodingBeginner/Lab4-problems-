package problem6;

public class Forme {
    // attributes:
    private String shapeName;

    // constructor:
    public Forme(String shapeName){
        this.shapeName = shapeName;
    }

    // getter:
    public String getShapeName(){
        return this.shapeName;
    }

    public double getSurface(){
        return 0;
    }

}

class Square extends Forme{
    // attributes:
    private double side;

    // constructor:
    public Square(double side){
        super("Square");
        this.side = side;
    }

    // getters:
    public double getSide(){
        return this.side;
    }

    public double  getSurface(){
        return this.side*this.side;
    }

    // setters:
    public void setSide(double side){
        this.side = side;
    }

    // toString() method:
    public String toString(){
        return this.getShapeName()+ "(side : " + this.side + " cm)";
    }
}

class Circle extends Forme{
    // attributes:
    private double radius;

    // constructor:
    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    // getters:
    public double getRadius(){
        return this.radius;
    }

    public double  getSurface(){
        return this.radius*this.radius*Math.PI;
    }

    // setters:
    public void setRadius(double radius){
        this.radius = radius;
    }

    // toString() method:
    public String toString(){
        return this.getShapeName()+ "(side : " + this.radius + " cm)";
    }
}
