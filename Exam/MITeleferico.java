import java.util.ArrayList;

public class MiTeleferico {
    private ArrayList<Linea> lineas;
    private float cantidadIngresos;
    
    public MiTeleferico() {
        this.lineas = new ArrayList<>();
        lineas.add(new Linea("Amarillo"));
        lineas.add(new Linea("Rojo"));
        lineas.add(new Linea("Verde"));
        this.cantidadIngresos = 0;
    }
    
    public void agregarPersonaFila(Persona p, String lineaColor) {
        for (Linea linea : lineas) {
            if (linea.getColor().equals(lineaColor)) {
                linea.agregarPersona(p);
                break;
            }
        }
    }
    
    public void agregarCabina(String lineaColor) {
        for (Linea linea : lineas) {
            if (linea.getColor().equals(lineaColor)) {
                linea.agregarCabina();
                break;
            }
        }
    }
    
    
    public boolean agregarpercab(int nroCabina, Persona p, String lineaColor) {
        for (Linea linea : lineas) {
            if (linea.getColor().equals(lineaColor)) {
                return linea.agregarpercab(nroCabina, p);
            }
        }
        return false;
    }
    
    
    public boolean verificarReg() {
        for (Linea linea : lineas) {
            if (!linea.verificar()) {
                return false;
            }
        }
        return true;
    }

    public float calcularIngresoTotal() {
        float total = 0;
        for (Linea linea :
    }

















