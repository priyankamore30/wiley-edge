package lambada;

public class lambadaClass {
       static void printThing(Printable thing) {
		thing.print();
	}
       public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product myProd = new Product();
		//myProd.print();
		
		printThing(myProd);
	}
       public String name;
	   public int pid;
	   @Override
       public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is a product class implementing printable");
	}
	

}
public String name;
public int pid;
@Override
public void print() {
	// TODO Auto-generated method stub
	System.out.println("This is a product class implementing printable");
}