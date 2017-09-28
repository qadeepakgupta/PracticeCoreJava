package controlstatements;

public class PostPreIncrementExample {

	public static void main(String[] args) {
		int a = 0;
		System.out.println(a++); // POST INCREMENT: prints first, then increments
		System.out.println(a);
		System.out.println(++a); // PRE INCREMENT: increments first, then prints
	}

}
