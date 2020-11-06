package application;

import javafx.scene.control.Button;

public class Observer {
	protected Button subsc;

	public Observer(Button subs) {
		this.subsc = subs;
	}
	
	public void update() {
		if(this.subsc.isDisable()) {
			
		}else {
		}
	}

	public void printConsole() {
		// TODO Auto-generated method stub
		
	}
	
	public Boolean isEnable() {
		return !this.subsc.isDisabled();
	}
	
	public void setEstado(Boolean estado) {
		this.subsc.setDisable(!estado);
	}

	

}
