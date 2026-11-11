public class PruebaEspera {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();
        sistema.registrarMaterial(
                new Libro("F796", "Una Escalera Al cielo", 2000,
                        "Mario Mendoza", "987456321"));


        sistema.agregarEspera("F796", "Mauricio");
        sistema.agregarEspera("F796", "Pepe");


        System.out.println("Fila del libro");
        sistema.mostrarEspera("F796");

        System.out.println("Se devuelve el libro a Mauricio");
        String primero = sistema.siguienteEnEspera("F796");
        System.out.println("Recibe: " + primero);

        System.out.println("Fila tras el prestamo");
        sistema.mostrarEspera("F796");


    }
}
