package aula5HerancaPolimorfismo.exercicio3;

public sealed abstract class Clock permits BRLClock, USClock{

    protected int hour;
    protected int minute;
    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24) {
            this.hour = 24;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if( minute >= 60) {
            this.minute = 60;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60) {
            this.second = 60;
        }
        this.second = second;
    }

    private String format(int value){
        return value < 9 ? "0"+value: String.valueOf(value);
    }

    public String getTime(){
        return format(hour)  + ":" +format(minute)+":"+format(second);
    }

    abstract Clock convert(Clock clock);
    /* Esse método não possui implementação na classe Clock, o que significa que qualquer classe concreta que herde
    de Clock será obrigada a fornecer sua própria implementação do método convert. O objetivo desse método é realizar
    algum tipo de conversão envolvendo um objeto do tipo Clock, retornando um novo objeto (ou o mesmo) do tipo Clock.
    */
}
