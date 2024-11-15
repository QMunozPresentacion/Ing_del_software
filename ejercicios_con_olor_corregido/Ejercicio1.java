package unavarra.is.practica7.ejercicios;
public final class Ejercicio1 {
    private Ejercicio(){}
    public static Boolean linea(String s){
        return s.startsWith("A") && s.endsWith("S");
    }

    public static void saludo(String[] mensajes) {
        System.out.println(linea("HOLA"));
        System.out.println(linea("ADIOS"));
    }
    
}
