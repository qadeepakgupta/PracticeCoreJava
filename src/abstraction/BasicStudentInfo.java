package abstraction;

public abstract class BasicStudentInfo {

	abstract int enterStudentUserID();

	abstract String enterStudentUserName();

	abstract String enterStudentUserClass();

	public void printValues() {
		System.out.println("User ID :> " + enterStudentUserID());
		System.out.println("Name    :> " + enterStudentUserName());
		System.out.println("Class   :> " + enterStudentUserClass());
	}
}
