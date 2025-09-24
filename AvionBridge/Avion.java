// Implementación de Prototype, Abstract Factory y Builder

// Interfaz Prototype
interface Prototype<T> {
    T clonar();
}

// Clase base Avion que implementa Prototype
public class Avion implements Prototype<Avion> {
    // Atributos
    private String modelo;
    private String fabricante;
    private int capacidadPasajeros;
    private double autonomia; // kilómetros

    // Constructor privado para uso de Builder
    private Avion(Builder builder) {
        this.modelo = builder.modelo;
        this.fabricante = builder.fabricante;
        this.capacidadPasajeros = builder.capacidadPasajeros;
        this.autonomia = builder.autonomia;
    }

    // Método Prototype
    @Override
    public Avion clonar() {
        return new Avion.Builder()
                .setModelo(this.modelo)
                .setFabricante(this.fabricante)
                .setCapacidadPasajeros(this.capacidadPasajeros)
                .setAutonomia(this.autonomia)
                .build();
    }

    // Builder interno
    public static class Builder {
        private String modelo;
        private String fabricante;
        private int capacidadPasajeros;
        private double autonomia;

        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder setFabricante(String fabricante) {
            this.fabricante = fabricante;
            return this;
        }

        public Builder setCapacidadPasajeros(int capacidadPasajeros) {
            this.capacidadPasajeros = capacidadPasajeros;
            return this;
        }

        public Builder setAutonomia(double autonomia) {
            this.autonomia = autonomia;
            return this;
        }

        public Avion build() {
            return new Avion(this);
        }
    }

    // Getters
    public String getModelo() { return modelo; }
    public String getFabricante() { return fabricante; }
    public int getCapacidadPasajeros() { return capacidadPasajeros; }
    public double getAutonomia() { return autonomia; }

    // Método para mostrar información del avión usando Abstract Factory + Builder
    public void mostrarInformacion() {
        FabricaAvion fabrica;
        if ("Boeing".equalsIgnoreCase(fabricante)) {
            fabrica = new FabricaBoeing();
        } else {
            fabrica = new FabricaAirbus();
        }

        Avion avionConstruido = fabrica.crearAvion()
                .setModelo(this.modelo)
                .setCapacidadPasajeros(this.capacidadPasajeros)
                .setAutonomia(this.autonomia)
                .build();

        System.out.println("Información del avión construido con Abstract Factory + Builder:");
        System.out.println("Modelo: " + avionConstruido.getModelo());
        System.out.println("Fabricante: " + avionConstruido.getFabricante());
        System.out.println("Capacidad de Pasajeros: " + avionConstruido.getCapacidadPasajeros());
        System.out.println("Autonomía: " + avionConstruido.getAutonomia() + " km");
    }

    // Método main de ejemplo
    public static void main(String[] args) {
        // Abstract Factory en acción
        FabricaAvion fabrica = new FabricaBoeing();
        Avion avion = fabrica.crearAvion()
                .setModelo("737 MAX")
                .setCapacidadPasajeros(210)
                .setAutonomia(6570)
                .build();

        avion.mostrarInformacion();

        // Prototype en acción
        Avion copia = avion.clonar();
        System.out.println("\nCopia clonada:");
        copia.mostrarInformacion();
    }
}

// Interfaz Abstract Factory
interface FabricaAvion {
    Avion.Builder crearAvion();
}

// Fábrica concreta Boeing
class FabricaBoeing implements FabricaAvion {
    @Override
    public Avion.Builder crearAvion() {
        return new Avion.Builder().setFabricante("Boeing");
    }
}

// Fábrica concreta Airbus
class FabricaAirbus implements FabricaAvion {
    @Override
    public Avion.Builder crearAvion() {
        return new Avion.Builder().setFabricante("Airbus");
    }
}
