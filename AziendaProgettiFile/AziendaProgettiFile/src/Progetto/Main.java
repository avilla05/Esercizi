package Progetto;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 File file = new File("Progetto.txt");
	     FileReader fr=new FileReader(file);
	     BufferedReader br = new BufferedReader(fr);
	     
	     String line;
	     String line2;
	     String line3;
	     float pr = 0;
	     Progetti listaProgetti=new Progetti();
	     
	     while((line=br.readLine()) !=null) {
	    	 String[] progetto=line.split(";");
	    	 int id=Integer.parseInt(progetto[0]);
	    	 int anno=Integer.parseInt(progetto[1]);
	    	 Progetto p=new Progetto(anno, progetto[2], progetto[3], id);
	    	
	    	 
	    	 File file2 = new File("Attivita.txt");
	         FileReader fr2=new FileReader(file2);
	         BufferedReader br2 = new BufferedReader(fr2);
	         while((line2=br2.readLine()) !=null) {
		    	 String[] attivita=line2.split(";");
		    	 int idProgetto=Integer.parseInt(attivita[0]);
		    	 int idDip=Integer.parseInt(attivita[1]);
		    	 int idAttivita=Integer.parseInt(attivita[2]);
		    	 int tempistica=Integer.parseInt(attivita[4]);
		         
		    	 if(id==idProgetto) {
			    	 Attivita a=new Attivita(attivita[3], tempistica, idAttivita);
			       	 p.addAttivita(a);
		    	 
			    	 File file3 = new File("Dipendente.txt");
			         FileReader fr3=new FileReader(file3);
			         BufferedReader br3 =new BufferedReader(fr3);
			         
			         while((line3=br3.readLine()) !=null) {
				    	 String[] dipendente=line3.split(";");
				    	 int idDipendente=Integer.parseInt(dipendente[0]);
				    	 int costo=Integer.parseInt(dipendente[2]);

			    	 	if(idDip==idDipendente) {
			    	 		Dipendente d=new Dipendente(dipendente[1], costo, idDipendente);
			    	 		a.addDipendente(d);
			    	 		pr=costo*tempistica;
				    	 	}
			        	}		         
			      }
	         }
	         	listaProgetti.addProgetto(p);
	         	
	    }
	         listaProgetti.stampaProgetti();
	 }
}

