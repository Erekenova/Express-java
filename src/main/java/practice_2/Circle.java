package practice_2;

public class Circle {
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }
    double calculateCircumference(){
        return Math.PI + 2 + radius;
    }

}
