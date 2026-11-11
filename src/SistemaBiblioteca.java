import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class SistemaBiblioteca {

    private Map<String, Material> catalogo = new HashMap<>();

    private Map<String, List<String>> listaEspera = new HashMap<>();

    private Set<String> miembros = new HashSet<>();

    public void registrarMaterial(Material m) {
        if (catalogo.containsKey(m.getCodigo())) {
            System.out.println("codigo duplicado: " + m.getCodigo()
                    + " se remplazara");
        }
        catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catalogo de libros esta vacío.");
            return;
        }
        for (Map.Entry<String, Material> e : catalogo.entrySet()) {
            System.out.print("  " + e.getKey());
            e.getValue().mostrarInfo();
        }
    }

    public void agregarEspera(String codigoMaterial, String usuario) {
        listaEspera.putIfAbsent(codigoMaterial, new ArrayList<>());
        listaEspera.get(codigoMaterial).add(usuario);
    }

    public String siguienteEnEspera(String codigoMaterial) {
        List<String> fila = listaEspera.get(codigoMaterial);
        if (fila == null || fila.isEmpty()) return null;
        return fila.remove(0);
    }

    public void mostrarEspera(String codigoMaterial) {
        List<String> fila = listaEspera.get(codigoMaterial);
        if (fila == null || fila.isEmpty()) {
            System.out.println("  (sin espera)");
            return;
        }
        for (int i = 0; i < fila.size(); i++) {
            System.out.println(fila.get(i));
        }
    }

    public boolean registrarMiembro(String usuario) {
        return miembros.add(usuario);
    }

    public boolean tieneMembresía(String usuario) {
        return miembros.contains(usuario);
    }

    public void mostrarMiembros() {
        if (miembros.isEmpty()) {
            System.out.println("  (sin miembros para la mamebresia)");
            return;
        }
        for (String m : miembros) {
            System.out.println( m);
        }
    }
}