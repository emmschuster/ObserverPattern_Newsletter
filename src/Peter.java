public class Peter implements Subscriber{

	@Override
	public void benachrichtigung(Ausgabe a) {
		System.out.println("Peter hat "+a.getTitel()+" erhalten");
	}
}
