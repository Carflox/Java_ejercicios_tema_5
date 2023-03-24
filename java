// Interfaz CocheCRUD
public interface CocheCRUD {
    void save();
    void findAll();
    void delete();
}

// Implementación CocheCRUDImpl
public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Método save() llamado");
    }

    @Override
    public void findAll() {
        System.out.println("Método findAll() llamado");
    }

    @Override
    public void delete() {
        System.out.println("Método delete() llamado");
    }
}

// Clase Main
public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
