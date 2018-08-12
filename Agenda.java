package arrayList.agenda;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
	//Atributos
	private ArrayList<Contato> agenda;
	
	//Metodos Especiais
	public Agenda() {
		this.agenda = new ArrayList<>();
	}
	
	public void addContato(Contato ct) {
		this.agenda.add(ct);
	}
	
	public void removeContato(Contato ct) {
		this.agenda.remove(ct);
	}
	
	public ArrayList<Contato> buscaContato(String nome) {
		ArrayList<Contato> listaNomes = new ArrayList<>();
		
		for (Contato ct : this.agenda) 
			if (ct.getNome().equalsIgnoreCase(nome))
				listaNomes.add(ct);
		
		return (listaNomes.size() > 0 ? listaNomes : null);
	}
	
	public void listaContatos() {
		Iterator<Contato> it = this.agenda.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "\n");
		}
	}
	

}
