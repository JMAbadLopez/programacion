package ejercicio01_pcgamer;

public class Ordenador {
    private Procesador cpu;
    private MemoriaRAM ram;
    private TarjetaGrafica gpu;

    public Ordenador(Procesador cpu, MemoriaRAM ram, TarjetaGrafica gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
    }

    public double getPrecioTotal() {
        return cpu.getPrecio() + ram.getPrecio() + gpu.getPrecio();
    }

    @Override
    public String toString() {
        return "Configuración del PC:\n" +
                "- " + cpu + "\n" +
                "- " + ram + "\n" +
                "- " + gpu + "\n" +
                "Precio Total: " + getPrecioTotal() + "€";
    }
}
