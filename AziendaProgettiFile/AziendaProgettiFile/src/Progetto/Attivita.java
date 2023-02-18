package Progetto;

public class Attivita {
	private String nome;
	private int tempo;
	private Dipendente listaDipendenti[];
	private int idAttivita;
	private int i=0;
	

public Attivita(String nome, int tempo, int idAttivita) {
	setNome(nome);
	setTempo(tempo);
	setIdAttivita(idAttivita);
	setListaDipendenti(new Dipendente[10]);
}

public void addDipendente(Dipendente d) {
	listaDipendenti[i]=d;
	i++;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getTempo() {
	return tempo;
}

public void setTempo(int tempo) {
	this.tempo = tempo;
}

public int getIdAttivita() {
	return idAttivita;
}

public void setIdAttivita(int idAttivita) {
	this.idAttivita = idAttivita;
}

public Dipendente[] getListaDipendenti() {
	return listaDipendenti;
}

public void setListaDipendenti(Dipendente listaDipendenti[]) {
	this.listaDipendenti = listaDipendenti;
}

public void stampaAttivita() {
	System.out.println("ATTIVITA': "+nome+", TEMPISTICA: "+tempo);
	for(int k=0; k<i; k++) {
		listaDipendenti[k].stampaDipendente();
	}
}
}
