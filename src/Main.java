public class Main {

	public static void main(String[] args) {
		TirolerTageszeitung tt = new TirolerTageszeitung();
		//es gibt verschiedene Arten Leute hinzuzufuegen
		tt.addSub(new Andrea());	
		tt.setAktuelleZeitung(new Ausgabe("Waldbrand in den USA"));
		
		Peter p = new Peter();
		tt.addSub(p);
		
		tt.setAktuelleZeitung(new Ausgabe("Sturm des Capitols"));

		tt.deleteSub(p);
		
		tt.setAktuelleZeitung(new Ausgabe("Beste Haarprodukte 2020"));

	}

}
