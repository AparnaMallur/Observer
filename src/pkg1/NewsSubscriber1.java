package pkg1;

public class NewsSubscriber1 extends Observer1{

	private News subject;
	NewsSubscriber1(News sub){
		this.subject=sub;
		subject.register(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("New message "+subject.getmessage());
	}

	

}
