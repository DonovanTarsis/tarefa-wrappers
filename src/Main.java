import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numPrimitivo = teclado.nextInt();
        Integer numInteger = numPrimitivo;
        System.out.println(numInteger);
        teclado.close();
    }
}