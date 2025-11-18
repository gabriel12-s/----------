import java.util.ArrayList;

public class Linea {
    private String color;
    private ArrayList<Persona> filaPersonas;
    private ArrayList<Cabina> cabinas;
    private int cantidadCabinas;
    
    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new ArrayList<>();
        this.cabinas = new ArrayList<>();
        this.cantidadCabinas = 0;
    }
    
    public void agregarPersona(Persona p) {
        filaPersonas.add(p);
    }
    
    public void agregarCabina() {
        cabinas.add(new Cabina(cabinas.size() + 1));
        cantidadCabinas++;
    }
    
  
    public boolean agregarpercab(int nroCabina, Persona p) {
        if (nroCabina < 1 || nroCabina > cabinas.size()) {
            return false;
        }
        
        Cabina cabina = cabinas.get(nroCabina - 1);
        
      
        if (cabina.getPersonasAbordo().isEmpty()) {
            return cabina.agregarPersona(p);
        }
        
        return false;
    }
    
    
    public boolean verificar() {
        for (Cabina cabina : cabinas) {
            if (!cabina.cumpleReglas()) {
                return false;
            }
        }
        return true;
    }
    
    public String getColor() {
        return color;
    }
}



















