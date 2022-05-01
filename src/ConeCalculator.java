import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConeCalculator {
    private double diameter;
    private double height;

    private double icecream;

    public ConeCalculator(double diameter) {
        this.diameter = diameter;
    }

    public void setIcecream(double icecream) {
        this.icecream = icecream;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getIcecream() {
        return icecream;
    }

    public double getRadius() {
        return diameter / 2;
    }

    public double getVolume(){
        return (Math.PI * Math.pow(this.getRadius(), 2) * height)/3;
    }

    public double getArea() {return Math.PI * this.getRadius() *(this.getRadius() +
            Math.sqrt((Math.pow(this.getRadius(), 2) + Math.pow(height, 2))));}

    public double getIcecreamCount () {return icecream / this.getVolume();}

}
