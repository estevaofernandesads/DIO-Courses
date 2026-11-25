import java.util.Scanner;

public class Class004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        var value1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        var value2 = sc.nextInt();
        System.out.printf("%s + %s = %s%n", value1, value2, value1 + value2);

        /*
             operadores, + , - , / , * , % . 
        */

        sc.close();
    }
}
