
public class Main {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Mahmut Hoca" , "TRH", "5169915");
		Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
		Teacher t3 = new Teacher("Külyutmaz", "BIO", "111");
		
		
		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(t1);
		
		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t2);
		
		Course biyo = new Course("Biyoloji", "101", "BIO");
		biyo.addTeacher(t3);
		
		
		
		Student s1 = new Student("Ýnek Þaban", "123", "4", tarih, fizik, biyo);
		s1.addBulkExamNote(100, 200, 50);
		s1.isPass();
		
		

	}

}
