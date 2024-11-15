package unavarra.is.practica7.ejercicios;

public final class Ejercicio5 {

    private Ejercicio5() {}

    public static String obtenerMes(int mes) {
        // Cláusula de guardia para valores incorrectos
        if (mes < 1 || mes > 12) {
            return "es un mes incorrecto";
        }

        String resultado;
        switch (mes) {
            case 1: case 4: case 6: case 9: case 11:
                resultado = "es un mes de 30 días";
                break;
            case 2:
                resultado = "es un mes de 29 o 30 días";
                break;
            case 3: case 5: case 7: case 8: case 10: case 12:
                resultado = "es un mes de 31 días";
                break;
            default:
                resultado = "mes incorrecto"; // Aunque no debería ocurrir por la cláusula de guardia
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(obtenerMes(11));
    }
}
