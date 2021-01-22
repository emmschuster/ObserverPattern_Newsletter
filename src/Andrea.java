public class Andrea implements Subscriber{

	@Override
	public void benachrichtigung(Ausgabe a) {
		System.out.println("Andrea hat "+a.getTitel()+" erhalten");
	}

}