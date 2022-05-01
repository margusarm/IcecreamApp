
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class ConeCalculatorApp {
    public static void main(String[] args) {
        new ConeCalculatorApp();
    }
    public ConeCalculatorApp(){
        NumberFormat formatter = new DecimalFormat("#0.00");
        Scanner input = new Scanner(System.in);
        System.out.println("Selle programmiga saad teada, kui palju mahub sinu vahvlikoonuse sisse jäätist!");
        System.out.print("Sisesta jäätisekoonuse laiema osa diameeter sentimeetrites: ");
        double diameter = input.nextDouble();
        ConeCalculator cone = new ConeCalculator(diameter);
        System.out.print("Kui pikk su jäätisekoonus on? Sisesta sügavus sentimeetrites: ");
        double height = input.nextDouble();
        System.out.print("Sisesta jäätise kogus milliliitrites: ");
        //double icecream = input.nextDouble();
        cone.setIcecream(input.nextDouble());
        cone.setHeight(height);
        System.out.println("Sellesse koonusesse mahub " + formatter.format(cone.getVolume())  + " milliliitrit jäätist");
        System.out.println("Sinu vahvelkoonuse pindala on " + formatter.format(cone.getConeArea())  + " ruutsentimeetrit");
        System.out.println(cone.getIcecream() + " milliliitrise jäätisega saab täita " + formatter.format(cone.getIcecreamCount()) + " vahvlikoonust.");
    }

}
