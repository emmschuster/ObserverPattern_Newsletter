public class TirolerTageszeitung extends Newsletter{
	private Ausgabe aktuelleZeitung; 

    public void setAktuelleZeitung(Ausgabe aktuelleZeitung) { 
        this.aktuelleZeitung = aktuelleZeitung; 
        verteileZeitung(aktuelleZeitung); 
    } 

    public Ausgabe getAktuelleZeitung() { 
        return aktuelleZeitung; 
    } 
}
