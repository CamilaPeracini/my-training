package Escola;

public class Aluno {
	
	private String nomeAluno;
	private int matriculaAluno;
	private String cursoAluno;
	private String diciplina1; 
	private String diciplina2;
	private String diciplina3;
	private float nota1;
	private float nota2;
	private float nota3;
	private int media = 7;


	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}


	public int getMatriculaAluno() {
		return matriculaAluno;
	}
	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}


	public String getCursoAluno() {
		return cursoAluno;
	}
	public void setCursoAluno(String cursoAluno) {
		this.cursoAluno = cursoAluno;
	}

	public String getDiciplina1() {
		return diciplina1;
	}
	public void setDiciplina1(String diciplina1) {
		this.diciplina1 = diciplina1;
	}

	public String getDiciplina2() {
		return diciplina2;
	}
	public void setDiciplina2(String diciplina2) {
		this.diciplina2 = diciplina2;
	}

	public String getDiciplina3() {
		return diciplina3;
	}
	public void setDiciplina3(String diciplina3) {
		this.diciplina3 = diciplina3;
	}

	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}
	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public int getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}


	void verificar(){
		if(nota1 < media || nota2 < media || nota3 < media){
			System.out.println("Aluno Reprovado");
		} else {
			System.out.println("Aluno Aprovado");
		}
	}
}
