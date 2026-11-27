public class Class005 {

    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)%n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s)%n", value2, binary2);
        var result1 = value1 | value2;
        var binaryResult1 = Integer.toBinaryString(result1);
        System.out.printf("%d | %d = %d (representação binária %s)%n", value1, value2, result1, binaryResult1);

        var value3 = 6;
        var binary3 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)%n", value3, binary3);
        var value4 = 5;
        var binary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número da operação %s (representação binária %s)%n", value4, binary4);
        var result2 = value3 & value4;
        var binaryResult2 = Integer.toBinaryString(result2);
        System.out.printf("%d & %d = %d (representação binária %s)%n", value3, value3, result2, binaryResult2);

        /*
            0 = false
            1 = true

            Operator Chore:
            ^ se os números são iguais ele retorna 0 e se forem diferentes retorna 1

            Operator Complement:
            ~ todos os valores que são 0 se torna 1 e os 1 se torna 0
        */
    }
}
