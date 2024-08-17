import java.util.Scanner;

public class exmuitofoda {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("infome seu salario: ");
        double salario = a.nextDouble();
        if (salario <= 1412) {
            System.out.println("reajuste de 12%");
            System.out.println("seu salario atual é: " + salario * 1.12);
        } else if (salario <=3000){
            System.out.println("reajuste de 9%");
            System.out.println("seu salario atual é: " + salario * 1.09);
        } else if (salario <= 5000) {
            System.out.println("reajuste de 5%");
            System.out.println("seu salario atual é: " + salario * 1.05);
        }
        else{
            System.out.println("sem reajuste");
        }
    }
}
