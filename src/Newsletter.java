import java.util.ArrayList;

public abstract class Newsletter {
	private ArrayList<Subscriber> subsriberList = new ArrayList<Subscriber>(); 

    public void addSub(Subscriber sub) { 
    	subsriberList.add(sub); 
    } 

    public void deleteSub(Subscriber sub) { 
    	subsriberList.remove(sub); 
    } 

    protected void verteileZeitung(Ausgabe a) { 	//hier werden alle informiert
        for (Subscriber sub : subsriberList) { 
            sub.benachrichtigung(a); 
        } 
    }
}
