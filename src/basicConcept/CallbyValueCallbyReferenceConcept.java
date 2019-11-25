package basicConcept;

public class CallbyValueCallbyReferenceConcept {
	int p;
	int q;

	public static void main(String[] args) {
		CallbyValueCallbyReferenceConcept obj = new CallbyValueCallbyReferenceConcept();

		int x = 10;
		int y = 20;
		int i = obj.testSum(x, y);// call by value or Pass by value
		System.out.println(i);

		obj.p = 50;
		obj.q = 60;

		obj.swap(obj);// call by reference
		// after swapping
		System.out.println("after swapping");
		System.out.println(obj.p);
		System.out.println(obj.q);

	}

	public int testSum(int a, int b) {
		a = 30;
		b = 40;

		int c = a + b;
		return c;
	}

	// call by reference
	// CallbyValueCallbyReferenceConcept t=new
	// CallbyValueCallbyReferenceConcept();
	public void swap(CallbyValueCallbyReferenceConcept t) {

		int temp;
		temp = t.p;// 50
		t.p = t.q;// 60
		t.q = temp;// 50

	}

}
