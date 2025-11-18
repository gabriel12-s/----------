public class Main {
    public static void main(String[] args) {
        MiTeleferico teleferico = new MiTeleferico();
        
        teleferico.agregarCabina("Amarillo");
        teleferico.agregarCabina("Rojo");
        
        Persona juan = new Persona("Juan", 20, 70);
        Persona maria = new Persona("Maria", 30, 60);
        

        boolean resultado1 = teleferico.agregarpercab(1, juan, "Amarillo");
        System.out.println("Agregar Juan a cabina 1: " + resultado1);
        
        boolean resultado2 = teleferico.agregarpercab(1, maria, "Rojo");
        System.out.println("Agregar Maria a cabina 1: " + resultado2);
        

        boolean reglas = teleferico.verificarReg();
        System.out.println("¿Todas cumplen reglas? " + reglas);
    }
}













