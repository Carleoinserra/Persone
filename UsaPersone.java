import java.util.ArrayList;

public class UsaPersone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studente s1 = new Studente("Rossi", "economia", "1234");
		Insegnante p1 = new Insegnante("Rodico", "economia", 2000);
		s1.info();
		p1.info();
		
		ArrayList<persone> lista = new ArrayList<persone>();
		lista.add(p1);
		lista.add(s1);
		
		lista.get(0).info();

	}

}
