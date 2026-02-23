package ejercicio01_pcgamer;

public class Main {
    public static void main(String[] args) {
        Procesador cpu = new Procesador("Intel i9-13900K", 600.0);
        MemoriaRAM ram = new MemoriaRAM("32GB DDR5", 150.0);
        TarjetaGrafica gpu = new TarjetaGrafica("NVIDIA RTX 4090", 1800.0);

        Ordenador miPC = new Ordenador(cpu, ram, gpu);

        System.out.println(miPC);
    }
}
