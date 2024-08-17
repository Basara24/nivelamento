import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.println("helloWord");
        System.out.println("nao");

        final int caixinha = 12;
        int tang = 23;
        int delValle = 24;
        int mix = tang + delValle;
        int um = 1 , dois = 2 , tres = um + dois;
        System.out.println(2+2*2+2-2/2*2+2);

        System.out.println("essa é variavel: " + caixinha);
        System.out.println("essa é constante: " + delValle);
        System.out.println("esse é o mix do povo " + mix);
        System.out.println("esse é o tres: " + tres);

          Scanner scanner = new Scanner(System.in);

        System.out.print("Informe as horas: ");
        int hora = scanner.nextInt();
        System.out.print("Informe os minutos: ");
          int minuto =scanner.nextInt();
        System.out.print("Informe os segundos: ");
          int segundo = scanner.nextInt();
          int resultado = (hora*60*60) + (minuto*60) + segundo;

        System.out.println("Segundos: " + resultado);


    }
}
