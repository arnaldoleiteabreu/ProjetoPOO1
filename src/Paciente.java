
public class Paciente {
	double peso;
	double altura;

	public Paciente(double quilos, double metros) {
		this.peso=quilos;
		this.altura=metros;	
	}
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



	double calcularIMC() {
		return this.peso/(this.altura*this.altura);
		 
	}
	
	String diagnostico() {
		
		if(this.calcularIMC()>16) {
			return "Baixo peso muito grave";	
		}
		else if(this.calcularIMC()<=16 && this.calcularIMC()>16.99) {
			return "Baixo peso grave";
			
		}
		else if(this.calcularIMC()<=17 && this.calcularIMC()>18.49) {
			return "Baixo peso";
			
		}
		
		else if(this.calcularIMC()<=18.50 && this.calcularIMC()>24.99) {
			return "Peso normal";
			
		}
		else if(this.calcularIMC()<=25 && this.calcularIMC()>29.99) {
			System.out.println("Sobrepeso");
			
		}
		
		else if(this.calcularIMC()<=30 && this.calcularIMC()>34.99) {
			return "peso baixo";
			
		}
		else if(this.calcularIMC()<=35 && this.calcularIMC()>39.99) {
			return "Obesidade grau II";
			
		}
		else if(this.calcularIMC()>40) {
			return "Obesidade grau III (obesidade mórbida)";
			
		}
		else {
			return "Opção inválida";
		}
		
		return "Opção inválida";
		
		
	}
	
	void Imprimir() {
		System.out.println();
	}
		
		

	
}
