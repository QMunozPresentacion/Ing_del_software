package unavarra.is.practica7.ejercicios;

public final class Ejercicio3 {

    private Ejercicio3() {}

    public enum ResultadoValidacion {
        CORRECTO,
        HORA_INCORRECTA,
        MINUTOS_INCORRECTOS,
        SEGUNDOS_INCORRECTOS
    }

    public static ResultadoValidacion validarHoraMinutoSegundo(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24) {
            return ResultadoValidacion.HORA_INCORRECTA;
        }
        if (minuto < 0 || minuto >= 60) {
            return ResultadoValidacion.MINUTOS_INCORRECTOS;
        }
        if (segundo < 0 || segundo >= 60) {
            return ResultadoValidacion.SEGUNDOS_INCORRECTOS;
        }
        return ResultadoValidacion.CORRECTO;
    }

    public static void main(String[] args) {
        System.out.println(validarHoraMinutoSegundo(9, 34, 23));
        System.out.println(validarHoraMinutoSegundo(25, 34, 23));
    }
}
