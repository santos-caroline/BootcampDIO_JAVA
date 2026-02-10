package desafiosLivresIA;

public class Challenge2 {
    public static Integer calculaTotalLeds(Integer altura,Integer largura) {
        if(altura >= 2 && largura >= 2){
            return (altura +1) *(largura +1);
        } else return 0;

    }

}
