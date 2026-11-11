public class PruebaBiblioteca {
    public static void main(String[] args) {
        Material libro = new Libro("D785", "Vuela Abuela Golondrina", 2001,
                "Jose Martinez Sanchez", "123456789");
        Material revista = new Revista("f745", "ESIKA", 2014,
                150, "Belleza");

        libro.mostrarInfo();
        revista.mostrarInfo();
    }
}
