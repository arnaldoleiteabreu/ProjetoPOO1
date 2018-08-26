
public class Principal {

	public static void main(String[] args) {
		Paciente p1= new Paciente(0, 0);
		p1.altura=1.69;
		p1.peso=75.5;
		p1.calcularIMC();
		p1.diagnostico();
	}

}
