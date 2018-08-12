package arrayList.agenda;

public class Test {

	public static void main(String[] args) {
		Contato c1 = new Contato("Jock", "88127694");
		Contato c2 = new Contato("Lucas", "8812946");
		
		Agenda ag = new Agenda();
		
		ag.addContato(c1);
		ag.addContato(c2);
		ag.listaContatos();
		
		
		try {
			for (Contato ct : ag.buscaContato("Joc")) 
			System.out.println(ct);
		} catch (NullPointerException e) {
			System.out.println("Error: " + e);
		}
		
       
		
		
		

		

	}

}
