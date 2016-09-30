package demo;

public class Empleado {
	private String nombre;
	private int edad;
	private float salario;
	private int horasTra;
	private String apellidoMaterno;
	private String apellidoPaterno;

    public Empleado() {

    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0 && edad <= 100) {
            this.edad = edad;
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
    	this.salario = salario;
    }
    
    public int getHorasTra() {
        return horasTra;
    }

    public void setHorasTra(int horasTra) {
    	this.horasTra = horasTra;
    }
    
    public float calcularSalario() {
    	float total=getSalario()*getHorasTra();
    	return total;
    }
}
