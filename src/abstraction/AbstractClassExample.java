package abstraction;

public class AbstractClassExample extends BasicStudentInfo {

	@Override
	int enterStudentUserID() {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	String enterStudentUserName() {
		// TODO Auto-generated method stub
		return "Deepak Gupta";
	}

	@Override
	String enterStudentUserClass() {
		// TODO Auto-generated method stub
		return "MCA";
	}

	public static void main(String[] args) {
		AbstractClassExample abClass = new AbstractClassExample();
		abClass.printValues();
	}

}
