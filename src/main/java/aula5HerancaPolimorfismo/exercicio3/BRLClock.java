package aula5HerancaPolimorfismo.exercicio3;

public non-sealed class BRLClock extends Clock{

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock -> this.hour = usClock.getPeriod().equals("PM") ?
                        usClock.getHour() + 12 :
                        usClock.getHour();

            case BRLClock brClock -> this.hour = brClock.getHour();
        }
        return this;
    }
}
