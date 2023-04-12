class Callbyvalue {
	int marks=100;
	void subject(int marks) {
		marks=marks-16;
		System.out.println(marks);
	}

	public static void main(String[] args) {
		Callbyvalue s1= new Callbyvalue();
			System.out.println("before any change in marks"+s1.marks);
			s1.subject(88);

			System.out.println("after passing the value"+s1.marks);


		
	}
}