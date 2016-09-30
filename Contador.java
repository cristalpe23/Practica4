package demo;

public class Contador extends Empleado {
    
        public float calcularSalario() {
    	float totalEmp=getSalario()*getHorasTra();
    	float total=totalEmp*35/100;
        float totalG=totalEmp+total;
        
    	return totalG; 
    }

}