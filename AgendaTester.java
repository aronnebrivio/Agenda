public class AgendaTester {

	private static boolean debug = true;	

	public static void main (String[] args) {
		Persona p1 = new Persona ("Mario", "Rossi");
		Agenda agenda = new Agenda(p1);
		Persona p2 = new Persona("Paolo", "Bianchi");
		Persona p3 = new Persona("Laura", "Ferrari");

		if (debug) {
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
		}

		Appuntamento a1 = new AppuntamentoLavoro("riunione", "03-12", 13, "sala 1");
		Appuntamento a2 = new AppuntamentoLavoro("seminario", "03-10", 10, "aula magna");
		Appuntamento a3 = new AppuntamentoLavoro("riunione", "03-12", 11, "sala 2");
		Appuntamento a4 = new AppuntamentoPersonale("cena", "02-05", 20, p2);
		Appuntamento a5 = new AppuntamentoPersonale("visita", "02-04", 9, p3);
		Appuntamento a6 = new AppuntamentoLavoro("colloquio", "03-04", 10, "ufficio 10");
		Appuntamento a7 = new AppuntamentoPersonale("TEST", "03-04", 10, p3);

		if (debug) {
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
			System.out.println(a5);
			System.out.println(a6);
		}

		agenda.aggiungiAppuntamento(a1);
		//for(Appuntamento x : agenda.getVettore()) {
		//	if (x.inConflitto(a2) == false)
				agenda.aggiungiAppuntamento(a2);
		//}
		agenda.aggiungiAppuntamento(a3);
		agenda.aggiungiAppuntamento(a4);
		agenda.aggiungiAppuntamento(a5);
		agenda.aggiungiAppuntamento(a6);
		agenda.aggiungiAppuntamento(a7);

		

		agenda.ordina();

		System. out.println();

		//Stampo l'agenda
		System.out.println(agenda);
		for(Appuntamento x : agenda)
			System.out.println(x);

		System.out.println();
		System.out.println("Percentuale appuntamenti di lavoro: " + agenda.statistiche("lavoro") + "%");
		System.out.println("Percentuale appuntamenti personali: " + agenda.statistiche("personale") + "%");

	}
}//non mi fa il commit non sao perchè, questo commento spero gli permetterà di farlo
