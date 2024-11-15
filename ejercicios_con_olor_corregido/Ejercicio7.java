package unavarra.is.practica7.ejercicios;

import java.time.LocalDate;

public final class Ejercicio7 {

    private Ejercicio7() {}

    static class Paciente {
        private String nombre;
        private int anioNacimiento;
        private float peso;
        private float altura;

        public Paciente(String nombre, int anioNacimiento, float peso, float altura) {
            this.nombre = nombre;
            this.anioNacimiento = anioNacimiento;
            this.peso = peso;
            this.altura = altura;
        }

        private int calcularEdad() {
            return LocalDate.now().getYear() - this.anioNacimiento;
        }

        private float calcularImc() {
            return this.peso / (this.altura * this.altura); 
        }

        public boolean tieneRiesgoCardiovascular() {
            return calcularImc() >= 25.0f && calcularEdad() > 65;
        }

        public String getNombre() {
            return nombre;
        }
    }


    public static void procesarPacientes(Paciente[] pacientes) {
        for (Paciente paciente : pacientes) {
            if (paciente.tieneRiesgoCardiovascular()) {
                System.out.println(paciente.getNombre() + " tiene riesgo cardiovascular");
            }
        }
    }

    public static void main(String[] args) {
        Paciente[] pacientes = {
            new Paciente("paciente1", 2001, 80.2f, 1.84f),
            new Paciente("paciente2", 1940, 90.2f, 1.75f),
            new Paciente("paciente3", 2001, 89.2f, 1.75f)
        };
        
        procesarPacientes(pacientes);
    }
}

