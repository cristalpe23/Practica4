package demo;

// Cada archivo .java contiene una clase p�blica, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un m�todo 'main' como punto de entrada
    public static void main (String[] args) {
        Empleado emp = new Empleado();
        emp.setHorasTra(40);
        emp.setSalario(100);
        System.out.println("Sueldo Empleado " + emp.calcularSalario());
        
        
        Empleado emp2 = new Gerente();
        emp2.setHorasTra(40);
        emp2.setSalario(100);
        System.out.println("Sueldo Gerente " + emp2.calcularSalario());
        
        Empleado emp3 = new Contador();
        emp3.setHorasTra(40);
        emp3.setSalario(100);
        System.out.println("Sueldo Contador " + emp3.calcularSalario());
        
    }
}