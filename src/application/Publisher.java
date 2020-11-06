package application;

public class Publisher{
	public Publisher() {
	}
	
	public void addObserver(Observer ob) {
		this.getObservers().add(ob);
	}
	
	public void removeObserver(Observer ob) {
		this.getObservers().remove(ob);
	}
	
	public void notifySubs() {
		this.notifyObservers();
	}
}
