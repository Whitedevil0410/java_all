class Number {
	double a,b;
	Number (double a, double b);
	
	{
		this.a= a;
	this.b= b;
}
}
void showAB () {
	System.out.println(" a is "+ a);
	System.out.println(" b is "+ b);
}
class pro.{ static void main(String[] args) {

	 	Number n1 = new Number (10,20);
	 	Number n2 = new Number (100,200);

	 	n1.showAB();
	 	n2.showAB();
		
	}
}