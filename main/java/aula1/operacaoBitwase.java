package Bootcamp_DIO_Santander.aula1;

public class operacaoBitwase {

    public static void main(String[] args){

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE)); //limite do tipo inteiro em binário
        System.out.println("***************************");

        var value1 =6;
        var binary1 = Integer.toBinaryString(value1); //converte para binário
        System.out.printf("Primeiro número %s (representação binária %s)\n", value1,binary1);

        var value2 =5;
        var binary2 = Integer.toBinaryString(value1);
        System.out.printf("Segundo número %s (representação binária %s)\n", value2,binary2);

        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (representação binária %s)\n", value1,value2, result, binaryResult);

        System.out.println("***************************");

        /*
        0 = false
        1 = true
        110
        110
        111 - já que na operação | (ou) precisa de pelo menos um verdadeiro;
        */

        var value3 =6;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro número %s (representação binária %s)\n", value3,binary3);

        var value4 =5;
        var binary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número %s (representação binária %s)\n", value4,binary4);

        var result2 = value3 & value4;
        var binaryResult2 = Integer.toBinaryString(result2);
        System.out.printf(" %s & %s = %s (representação binária %s)\n", value3,value4, result2, binaryResult2);

        System.out.println("***************************");
         /*
        0 = false
        1 = true
        110
        101
        100 - já que na operação & (e) precisa de duas verdadeiras;
        */

        var value5 =6;
        var binary5 = Integer.toBinaryString(value5);
        System.out.printf("Primeiro número %s (representação binária %s)\n", value5,binary5);

        var value6 =5;
        var binary6 = Integer.toBinaryString(value6);
        System.out.printf("Segundo número %s (representação binária %s)\n", value6,binary6);

        var result3 = value5 ^ value6;
        var binaryResult3 = Integer.toBinaryString(result3);
        System.out.printf(" %s ^ %s = %s (representação binária %s)\n", value5,value6, result3, binaryResult3);

         /*
        0 = false
        1 = true
        110
        101
        011 - já que na operação ^ (xor) é verdadeiro quando os dois são diferentes
        */

        System.out.println("***************************");
        var value7 =6;
        var binary7 = Integer.toBinaryString(value7); //converte para binário
        System.out.printf("Primeiro número %s (representação binária %s)\n", value7,binary7);
        var result4 = ~value7;
        var binaryResult4 = Integer.toBinaryString(result4);
        System.out.printf(" ~%s = %s (representação binária %s)\n", value7,result4,binaryResult4);

        /*
        0 = false
        1 = true
        00000000000000000000000000000110
        11111111111111111111111111111001 - já que na operação ~ (complemente) vai negar o número de deixar o contrário
        */

        System.out.println("***************************");
        var value8 =9;
        var binary8 = Integer.toBinaryString(value8);
        System.out.printf("Primeiro número %s (representação binária %s)\n", value8,binary8);

        var value9 =2; //vai empurrar os bits '2 posições'
        System.out.printf("Segundo número %s \n", value9);

        var result5 = value8 << value9; //descolamento de bits para a esquerda completando com 0
        var binaryResult5 = Integer.toBinaryString(result5);
        System.out.printf(" %s << %s = %s (representação binária %s)\n", value8,value9, result5, binaryResult5);

        /*
        0 = false
        1 = true
        1001
        100100 - vai completar as posições deslocadas com 00 ~2 posições
        */

        System.out.println("***************************");
        var value10 =-9;
        var binary9 = Integer.toBinaryString(value10);
        System.out.printf("Primeiro número %s (representação binária %s)\n", value10,binary9);

        var value11 =2; //vai empurrar os bits '2 posições'
        System.out.printf("Segundo número %s \n", value11);

        var result6 = value10 >> value11; //descolamento de bits para a direita
        var binaryResult6 = Integer.toBinaryString(result6);
        System.out.printf(" %s >> %s = %s (representação binária %s)\n", value10,value11, result6, binaryResult6);

        /*
        0 = false
        1 = true
        11111111111111111111111111110111
        11111111111111111111111111111101 - vai completar as posições deslocadas com 1 ~caso num negativo (bit sinal)
                                           vai completar as posições deslocadas com 0 ~ caso num positivo (bit sinal)
        */

        System.out.println("***************************");
        var value12 =12;
        var binary10 = Integer.toBinaryString(value12);
        System.out.printf("Primeiro número %s (representação binária %s)\n", value12,binary10);

        var value13 =2; //vai empurrar os bits '2 posições'
        System.out.printf("Segundo número %s \n", value13);

        var result7 = value12 >>> value13; //descolamento de bits SEMPRE COM 0 !!
        var binaryResult7 = Integer.toBinaryString(result7);
        System.out.printf(" %s >> %s = %s (representação binária %s)\n", value12,value13, result7, binaryResult7);

        /*
        0 = false
        1 = true
        1100
          11 - vai deslocar duas a direita
        */
    }

}
