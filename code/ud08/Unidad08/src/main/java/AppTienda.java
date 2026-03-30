public class AppTienda {
    public static void main(String[] args) {

        ArticuloDAO dao = new ArticuloDAO();

        Articulo nuevo = new Articulo(12, "Webcam HD", 45, 3);
        if(dao.insertar(nuevo)) {
            System.out.println("Artículo guardado con éxito.");
        }

        System.out.println("--- LISTA DE ARTÍCULOS ---");
        for (Articulo a : dao.obtenerTodos()) {
            System.out.println(a.getNombre() + " - " + a.getPrecio() + "€");
        }
    }
}