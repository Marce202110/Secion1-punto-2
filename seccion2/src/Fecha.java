
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Fecha {
    public static void main(String[] args) throws Exception {
        System.out.println("Seccion1-punto2");
        System.out.println("**********************************");
        /*se establece el dia de la semana teniendo en cuenta que se enumera del 1 al 7 segun el dia 
        de la semana en este caso es el 2 representa el martes */
        int diaSema = 2;
        /*se establece  */
        System.out.println("dia registrado:" +diaSema);
        /*Se le asigna una fecha para que haga el proceso de calculo con una fecha de partida */
        LocalDate fechaAsignada = LocalDate.parse("2021-10-06");
        System.out.println("Fecha registrada: " +fechaAsignada);
        System.out.println("-----------------------------------");

        List<LocalDate> sigFecha = obtenersigFecha(diaSema, fechaAsignada, 8);
        
        sigFecha.forEach(System.out::println);
    }
    
    public static List<LocalDate> obtenersigFecha(int diaSemana, LocalDate fechaAsignada, int cantidad) {
        List<LocalDate> Fecha = new ArrayList<>();
        DayOfWeek diaSemanaObjetivo = DayOfWeek.of(diaSemana);
        
        for (int i = 0; i < cantidad; i++) {
            fechaAsignada = fechaAsignada.with(TemporalAdjusters.next(diaSemanaObjetivo));
            Fecha.add(fechaAsignada);
        }
        
        return Fecha;
    }
}




