package repasoPrueba3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class aprenderLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime time = LocalTime.now();

        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(time);

//      MM mes, dd dia del mes, DD dia del anio, yy anio con 2 digitos, yyyy anio con 4 digitos
//      HH hora en formato 24, hh hora en formato 12, mm minutos, ss segundos
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String nuevaFecha = dateTime.format(formato);

        System.out.println(nuevaFecha);


//      Fecha Personalizada:
        LocalDate fecha = LocalDate.of(2025, 5, 23);
        System.out.println(fecha);

        LocalTime tiempo = LocalTime.of(14, 30);
        System.out.println(tiempo);

        LocalDateTime fechaTiempo1 = LocalDateTime.of(fecha, tiempo);
        System.out.println(fechaTiempo1);

        LocalDateTime fechaTiempo2 = LocalDateTime.of(2025, 5, 23, 14, 30);
        System.out.println(fechaTiempo2);


//      Comparar fechas
        LocalDateTime dT1 = LocalDateTime.of(2025, 5, 23, 14, 30);
        LocalDateTime dT2 = LocalDateTime.of(2023, 3, 20, 14, 30);

        System.out.println(dT2.isBefore(dT1));
        System.out.println(dT2.isAfter(dT1));
        System.out.println(dT2.isEqual(dT1));

        Period lapseTime = Period.between(dT2.toLocalDate(), dT1.toLocalDate());
        LocalDate avg = LocalDate.of(lapseTime.getYears()/2,  lapseTime.getMonths()/2, lapseTime.getDays()/2);
        System.out.println(avg);
    }
}
