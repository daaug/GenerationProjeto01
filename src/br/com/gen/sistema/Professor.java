package br.com.gen.sistema;

public class Professor extends Pessoa {

	private int registro;
	private String turma;
	private String matéria;

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getMatéria() {
		return matéria;
	}

	public void setMatéria(String matéria) {
		this.matéria = matéria;
	}

	public static void main(String[] args) {

		Professor prof1 = new Professor();
		Professor prof2 = new Professor();
		Professor prof3 = new Professor();
		Professor prof4 = new Professor();

		// Professor 1:
		prof1.setNome("Carlos");
		prof1.setRegistro(11111);
		prof1.setTurma("Turma 1-A");
		prof1.setMatéria("Matemática e Física");

		// Professor 2:
		prof2.setNome("Ana");
		prof2.setRegistro(22222);
		prof2.setTurma("Turma 3-B");
		prof2.setMatéria("Química");

		// Professor 3:
		prof3.setNome("Breno");
		prof3.setRegistro(33333);
		prof3.setTurma("Turma 4-C");
		prof3.setMatéria("História e Inglês");

		// Professor 4:
		prof4.setNome("Marcos");
		prof4.setRegistro(444444);
		prof4.setTurma("Turma 3-D");
		prof4.setMatéria("Astronomia e Ocultismo");

		System.out.println("---------------------------------------------");
		System.out.println("          | Registro de Professores |          ");
		System.out.println("---------------------------------------------");
		System.out.println("Nome do professor: " + prof1.getNome());
		System.out.println("Registro do professor: " + prof1.getRegistro());
		System.out.println("Turmas: " + prof1.getTurma());
		System.out.println("Matérias lecionadas: " + prof1.getMatéria());

		System.out.println("---------------------------------------------");
		System.out.println("Nome do professor: " + prof2.getNome());
		System.out.println("Registro do professor: " + prof2.getRegistro());
		System.out.println("Turmas: " + prof2.getTurma());
		System.out.println("Matérias lecionadas: " + prof2.getMatéria());

		System.out.println("---------------------------------------------");
		System.out.println("Nome do professor: " + prof3.getNome());
		System.out.println("Registro do professor: " + prof3.getRegistro());
		System.out.println("Turmas: " + prof3.getTurma());
		System.out.println("Matérias lecionadas: " + prof3.getMatéria());

		System.out.println("---------------------------------------------");
		System.out.println("Nome do professor: " + prof4.getNome());
		System.out.println("Registro do professor: " + prof4.getRegistro());
		System.out.println("Turmas: " + prof4.getTurma());
		System.out.println("Matérias lecionadas: " + prof4.getMatéria());
		System.out.println("---------------------------------------------");
	}
}
