import java.util.ArrayList;

public class UsaPersone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studente s1 = new Studente("Rossi", "economia", "1234");
		Insegnante p1 = new Insegnante("Rodico", "economia", 2000);
		
		
		ArrayList<persone> lista = new ArrayList<persone>();
		lista.add(p1);
		lista.add(s1);
		lista.add(p1);
		lista.add(s1);
		lista.add(p1);
		lista.add(s1);
		lista.add(p1);
		lista.add(s1);
		
		
		for (persone el: lista) {
			
			if (el instanceof Insegnante) {
				
				Insegnante temp = (Insegnante) el;
				temp.info();
			}
		}
		

	}

}
