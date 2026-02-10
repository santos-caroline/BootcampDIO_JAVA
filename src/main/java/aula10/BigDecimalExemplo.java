package aula10;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalExemplo {

    public static void main(String[] args){

        var value1 = new BigDecimal("0.1"); //para trabalhar com precisão
        var value2 = new BigDecimal("0.1985322"); //para trabalhar com precisão
        System.out.println(value1.add(value2));
        System.out.println("--------------");

        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.1"))); //valor com ponto sempre!!
        System.out.println(new BigDecimal(String.valueOf(value2.divide(value1 ,3, RoundingMode.HALF_UP))));
        System.out.println(value2.sqrt(new MathContext(8)));
        System.out.println(value2.abs(new MathContext(8)));

        var value3 = new BigDecimal("27");
        var x = 3; // Raiz cúbica
        var mc = new MathContext(8);

// A forma moderna: converte, calcula com 64 bits de precisão e volta para BigDecimal
        BigDecimal result = BigDecimal.valueOf(Math.pow(value3.doubleValue(), 1.0 / x))
                .round(mc);

        System.out.println(result); // Saída: 3.0000000
    }
}
