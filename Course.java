
public class Course {
	// Nitelikler
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	
	Course(String name, String code, String prefix){ //Constructor method
		
		this.name = name;
		this.code = code;
		this.prefix = prefix;		
		int note = 0;
		
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
			
		}else {
			System.out.println("��retmen ve Ders b�l�mleri uyu�muyor");
		}
		
		
	}
	
	void printTeacher() {
		this.teacher.print();
	}
	

}
