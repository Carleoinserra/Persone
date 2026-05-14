
public class Insegnante extends persone {
	
	String nome;
	String dipartimento;
	double stipendio;
	public Insegnante(String nome, String dipartimento, double stipendio) {
		super(nome, dipartimento);
		
		this.stipendio = stipendio;
	}
	
	public void info() {
		
		System.out.println("Sono un insegnante");
	}
	
	

}
