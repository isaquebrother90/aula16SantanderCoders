package escola;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double somaNotas;
	
	public double notaFinal() {
		double somaNotas = nota1 + nota2 + nota3;
		return somaNotas;
	}
	
	public void status() {
		if (notaFinal() >= 60) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado. \n Faltou " + (60 - notaFinal()));
		}
	}
	
}
