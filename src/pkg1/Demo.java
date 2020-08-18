package pkg1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
News subj=new News();
Observer1 obj1=new NewsSubscriber1(subj);
subj.setMessage("Added ");
	}

}
