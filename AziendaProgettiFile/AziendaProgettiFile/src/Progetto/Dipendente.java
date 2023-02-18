package Progetto;

public class Dipendente {
		private String ruolo;
		private float costo;
		private int idDipendente;
		
	public Dipendente(String ruolo, float costo, int idDipendente) {
		setRuolo(ruolo);
		setCosto(costo);
		setIdDipendente(idDipendente);
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public int getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(int idDipendente) {
		this.idDipendente = idDipendente;
	}
	
	public void stampaDipendente() {
		System.out.println("DIPENDENTE: n°"+idDipendente+", RUOLO: "+ruolo+", COSTO: "+costo+" Euro");
	}
}


