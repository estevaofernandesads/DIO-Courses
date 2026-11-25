import java.util.Scanner;

public class Class002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?");
        var result = sc.nextInt();
        var isRight = result == 4;
        System.out.printf("O resultado é 4, você acerto? (%s)%n", isRight);

        /*
            Operadores:

            == igual
            != diferente de
            <= menor que
            >= maior que
            || ou
            && e
         */

        sc.close();
    }
}
