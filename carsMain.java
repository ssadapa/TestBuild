import Models.Sedan;

public class carsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sedan se = new Sedan();
		se.printModel();
		
		 int ModelNumber = se.getModelNumber(2);
		 System.out.println(ModelNumber);
	}

}
