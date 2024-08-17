import java.io.SequenceInputStream;
import java.util.Scanner;

public class calculoloouco {
    public static void main(String[] args) {
        Scanner pq = new Scanner(System.in);
        System.out.print("Informe segundos: ");
        int segundos = pq.nextInt();
        int horas = (segundos/60/60);
        segundos = segundos-(horas*60*60);
        int minutos = segundos/60;
        segundos = segundos-(minutos*60);

        System.out.println("essas sao as horas " + horas+ " esse sao os minutos "+ minutos + " esses sao os segundos "+ segundos);

    }
}
