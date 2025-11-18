import java.util.ArrayList;

public class Cabina {
    private int nroCabina;
    private ArrayList<Persona> personasAbordo;
    
    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo = new ArrayList<>();
    }
    
    public boolean agregarPersona(Persona p) {
        if (personasAbordo.size() >= 10) {
            return false;
        }
        
        float pesoTotal = p.getPesoPersona();
        for (Persona persona : personasAbordo) {
            pesoTotal += persona.getPesoPersona();
        }
        
        if (pesoTotal > 850) {
            return false;
        }
        
        personasAbordo.add(p);
        return true;
    }
    
    public boolean cumpleReglas() {
        
        if (personasAbordo.size() > 10) {
            return false;
        }
        
      
        float pesoTotal = 0;
        for (Persona p : personasAbordo) {
            pesoTotal += p.getPesoPersona();
        }
        
        return pesoTotal <= 850;
    }
    
    public ArrayList<Persona> getPersonasAbordo() {
        return personasAbordo;
    }
}