
public class Teacher {
	
	// Nitelikler
	String name;	
	String branch;
	String mpno;
	
	Teacher(String name, String branch, String mpno){ //Constructor method
		this.name = name; // Constructor dan gelen name i, class i�indeki name'e at�yorum.
		this.branch = branch;
		this.mpno = mpno;
	}
	
	void print() {
		System.out.println("Name : " +this.name);
		System.out.println("Branch : " +this.branch);
		System.out.println("mpno : " +this.mpno);
	}

}
