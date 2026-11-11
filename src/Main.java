public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();
        System.out.println("catalogo");

        Libro l1 = new Libro("D785", "Vuela Abuela Golondrina", 2001,
                "Jose Martinez Sanchez", "123456789");
        Libro l2 = new Libro("F796", "Una Escalera Al cielo", 2000,
                "Mario Mendoza", "987456321");
        Revista r1 = new Revista("F745", "ESIKA", 2014,
                150, "Moda");
        Revista r2 = new Revista("G639", "Estilo", 2026,
                745, "Chismes");

        sistema.registrarMaterial(l1);
        sistema.registrarMaterial(l2);
        sistema.registrarMaterial(r1);
        sistema.registrarMaterial(r2);

        System.out.println("Catálogo completo:");
        sistema.mostrarCatalogo();

        System.out.println("Búsqueda por código F796:");
        Material encontrado = sistema.buscarMaterial("F796");
        if (encontrado != null) encontrado.mostrarInfo();

        System.out.println("Búsqueda por código inexistente 'z789':");
        Material noExiste = sistema.buscarMaterial("z789");
        System.out.println("  Resultado: " + noExiste);

        System.out.println("lista de espera ");


        l1.setDisponible(false);
        System.out.println("D785 marcado como prestado:");
        l1.mostrarInfo();

        // los 3 usuarios
        sistema.agregarEspera("D785", "Mauricio");
        sistema.agregarEspera("D785", "Pepe");
        sistema.agregarEspera("D785", "Michel");

        System.out.println("Fila de espera de D785:");
        sistema.mostrarEspera("D785");

        System.out.println("Se devuelve el material a:");
        System.out.println("1er turno: " + sistema.siguienteEnEspera("D785"));
        System.out.println("2do turno: " + sistema.siguienteEnEspera("D785"));

        System.out.println("Fila restante de D785:");
        sistema.mostrarEspera("D785");


        System.out.println("Membresias");

        System.out.println("Registrar Mauricio:   " + sistema.registrarMiembro("Mauricio"));
        System.out.println("Registrar Pepe:  " + sistema.registrarMiembro("Pepe"));
        System.out.println("Registrar Michel: " + sistema.registrarMiembro("Michel"));
        System.out.println("Registrar Mauricio de nuevo: "
                + sistema.registrarMiembro("Mauricio"));

        System.out.println("¿Mauricio tiene membresía?   " + sistema.tieneMembresía("Mauricio"));
        System.out.println("¿Pedro tiene membresía? " + sistema.tieneMembresía("Pedro"));

        System.out.println("Miembros activos:");
        sistema.mostrarMiembros();

        System.out.println("Este es el catalogo disponible:");
        sistema.mostrarCatalogo();

    }
}
