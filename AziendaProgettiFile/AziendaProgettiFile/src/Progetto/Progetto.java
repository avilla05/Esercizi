package Progetto;

public class Progetto {
	private int anno;
	private String nome;
	private String cliente;
	private Attivita listaAttivita[];
	private int idProgetto;
	private int i=0;

public Progetto(int anno, String nome, String cliente, int idProgetto) {
	setAnno(anno);
	setNome(nome);
	setCliente(cliente);
	setIdProgetto(idProgetto);
	setListaAttivita(new Attivita[10]);
}

public void addAttivita(Attivita a) {
	listaAttivita[i]=a;
	i++;
}


public int getAnno() {
	return anno;
}

public void setAnno(int anno) {
	this.anno = anno;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCliente() {
	return cliente;
}

public void setCliente(String cliente) {
	this.cliente = cliente;
}

public Attivita[] getListaAttivita() {
	return listaAttivita;
}

public void setListaAttivita(Attivita listaAttivita[]) {
	this.listaAttivita = listaAttivita;
}

public int getIdProgetto() {
	return idProgetto;
}

public void setIdProgetto(int idProgetto) {
	this.idProgetto = idProgetto;
}

public void stampaProgetto() {
	System.out.println("PROGETTO: "+ nome +", ANNO: "+ anno +", CLIENTE: "+ cliente);
	for(int j=0; j<i/*listaAttivita.length*/; j++) {	//con length--->null pointer exception
		listaAttivita[j].stampaAttivita();
	}
}

}
