package aula5HerancaPolimorfismo.exercicio3;

public non-sealed class USClock extends Clock{

    private String period;

    public void setHour(int hour) {
        setBeforeMidday(period);
        if((hour > 12) && (hour <= 23)){
            setAfterMidday(period);
            this.hour = hour - 12;
        } else if(hour >= 24){
            this.hour=0;
        } else if (hour ==12) {
            this.period = "PM";
        }  else {
            this.hour = hour;
        }
    }

    public String getPeriod() {
        return period;
    }

    public void setAfterMidday(String period) {
      this.period = "PM";
    }

    public void setBeforeMidday(String period) {
        this.period = "AM";
    }

    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.period = usClock.getPeriod();
            }

            case BRLClock brClock -> this.setHour(brClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime(){
        return super.getTime()+" "+this.period;
    }

}
