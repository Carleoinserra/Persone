
// ho dichiarato che studente è una sottoclasse di persone
public class Studente extends persone {
	
	
	
	String matricola;
	String dipartimento;
	String nome;
	
	
	public Studente(String nome, String dipartimento, String matricola) {
		
		super(nome, dipartimento);
		this.matricola = matricola;
	}
	
	public void info() {
		
		System.out.println("Sono uno studente");
	}
	
	

}
