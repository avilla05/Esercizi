package Progetto;

public class Progetti {
	private Progetto lista[];
	private int i=0;
	
public Progetti() {
	setLista(new Progetto[10]);
}

public void addProgetto(Progetto p) {
	lista[i]=p;
	i++;
}

public Progetto[] getLista() {
	return lista;
}

public void setLista(Progetto lista[]) {
	this.lista = lista;
}

public void stampaProgetti() {
	float pr=0;
	  for(int j=0; j<i;j++) {
		int a=0;
		lista[j].stampaProgetto();
		pr=lista[j].getListaAttivita()[a].getListaDipendenti()[a].getCosto()*lista[j].getListaAttivita()[a].getTempo();
		System.out.println("Costo del progetto: "+pr+" Euro");
		System.out.println(" ");
		}
   }
}


