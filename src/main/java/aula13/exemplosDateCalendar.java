package aula13;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class exemplosDateCalendar {

    public static void main(String[] args) throws ParseException {

        System.out.println("======== DATE =======");
        var date = new Date();
        var date2  = new Date(System.currentTimeMillis() - 999999999L); //data gerada por padrão milesegundos

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss"); //descreve o formato dia - hora
            // em hora ~ hh (formato 12h) e HH (formato 24h)
        System.out.println(date);
        System.out.println(formatter.format(date));

        System.out.println("======== CALENDAR =======");
        var calendar = Calendar.getInstance(); //valor atual da data
        var calendar2 = Calendar.getInstance();
        DateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss Z"); //Z == timezone
        System.out.println(formatter2.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH)); //exemplo de inf que podemos pegar
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        calendar2.set(Calendar.YEAR, 1993); //alterar valor do calendário
        System.out.println(formatter2.format(calendar2.getTime()));

        //comparar hora
        var calendar3 = Calendar.getInstance();
        var newCalendar = Calendar.getInstance();
        newCalendar.set(Calendar.HOUR, calendar3.get(Calendar.HOUR + 1));
        System.out.println(calendar3.before(newCalendar));

        var stringDate = formatter2.format(calendar.getTime()); //converter data em string
        var newCalendar2 = formatter2.parse(stringDate); //converter string em data
    }
}
