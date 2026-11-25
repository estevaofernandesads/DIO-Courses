import java.util.Scanner;

public class Class001 {

    private final static String WELCOME_MESSAGE = "Olá seja bem vindo!";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meu comentario.

        /*
         Meu comentario de varias linhas
        */

        System.out.println(WELCOME_MESSAGE);

        System.out.println("Olá, informe seu nome:");
        String name = sc.next();

        System.out.println("Informe sua idade:");
        int age = sc.nextInt();

        System.out.printf("Olá %s sua idade é %d anos%n", name, age);

        sc.close();
    }

}
