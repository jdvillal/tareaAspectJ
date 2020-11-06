package application;

import java.util.ArrayList;

aspect PublisherAspect {
    private interface Publisher_Interface {

		void notifyObservers();}
    declare parents: (Publisher) implements Publisher_Interface;

    private ArrayList<Observer> Publisher_Interface.observers = new ArrayList<>();
    public  ArrayList<Observer> Publisher_Interface.getObservers()  { return observers; }
    public void Publisher_Interface.notifyObservers() {
    	for(Observer ob : observers) {
    		 if(!ob.isEnable()) {
    			 ob.setEstado(true);
    		 }
    	}
	}
  }