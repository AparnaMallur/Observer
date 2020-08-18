package pkg1;

import java.util.ArrayList;
import java.util.List;

public class News  {

	private List<Observer1> observers =new ArrayList<Observer1>();
	private String message;
	public void setMessage(String message) {
		this.message = message;
		notifyObservers();
	}

	
	
	
	
	
	public void register(Observer1 obj) {
		observers.add(obj);
	}

	
	public void unregister(Observer1 obj) {
		// TODO Auto-generated method stub
		observers.remove(obj);
	}

	
	 private void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer1 o:observers){
			System.out.println("Test 1S");
			o.update();
		}
		
	}


	public Object getmessage() {
		//Testing
		// TODO Auto-generated method stub
		return message;
	}






	





	


	

}
