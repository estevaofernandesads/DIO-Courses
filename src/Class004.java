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
             += , -= , /= , *= .
             ++ , -- .

             valores de incremento a esquerda, executa na hora, a direita, só na proxima linha
        */

        System.out.printf("A raiz quadrada de %d é %.2f %n", value1, Math.sqrt(value1));
        System.out.printf("A potência de %d é %.2f %n", value2, Math.pow(value2, 2));

        sc.close();
    }
}
