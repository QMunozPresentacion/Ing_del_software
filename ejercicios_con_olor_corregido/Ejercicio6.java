package unavarra.is.practica7.ejercicios;

public final class Ejercicio6 {

    private Ejercicio6() {} 

    
    final class Dni {
        private final static String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        private Dni() {}

        public static char devolverLetra(int dni) {
            int r = dni % 23;
            return LETRAS_DNI[r];
        }
    }

    
    public static char dni(int dni) {
        return Dni.devolverLetra(dni);
    }

    public static void main(String[] args) {
        System.out.println(dni(72700123));
    }
}
