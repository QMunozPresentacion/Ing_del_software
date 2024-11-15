package unavarra.is.practica7.ejercicios;

public final class Ejercicio4 {

    private Ejercicio4() {}


    public static String obtenerDia(int dia) {

        String resultado;
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo","día incorrecto"};
        switch (dia) {
            case 1:
                resul = dias[0];
                break;
            case 2:
                resul = dias[1];
                break;
            case 3:
                resul = dias[2];
                break;
            case 4:
                resul = dias[3];
                break;
            case 5:
                resul = dias[4];
                break;
            case 6:
                resul = dias[5];
                break;
            case 7:
                resul = dias[6];
                break;
            default:
                resul = dias[7];
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(dia(3));
    }
}

