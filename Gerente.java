package demo;

public class Gerente extends Empleado {
	
    public float calcularSalario() {
    	float totalEmp=getSalario()*getHorasTra();
    	float total=totalEmp*50/100;
        float totalG=totalEmp+total;
        
    	return totalG; 
    }

}