import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadaRio = LocalDate.of(2016, Month.JUNE, 5);

        int anos = olimpiadaRio.getYear() - hoje.getYear();

        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadaRio);


        LocalDate proximaOlimpiada = olimpiadaRio.plusYears(4);

        System.out.println(proximaOlimpiada);


        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = proximaOlimpiada.format(formatador);

        System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(12,30);

        System.out.println(intervalo);


    }
}
