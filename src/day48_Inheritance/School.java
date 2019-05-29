package day48_Inheritance;

public class School {

	public static void main(String[] args) {
		Person person = new Person();
	    Student student = new Student();
			
			person.name = "Obama";
			person.age = 57;
			person.gender ='m';
			
			student.name = "Roman";
			student.age = 30;
			student.gender = 'm';
			student.clazz = "pingpong";
			
			person.eat("steak", "water");
			person.eat("grechka","tea");
			person.walk();
			
			person.sleep(8);
			student.sleep(7);
			
			
			Student student2 = new Student();
			student2.name = "Orhan";
			student2.age = 40;
			student2.age = 'm';
			student2.studentId = 4040;
			student2.clazz = "Agile scrum";
			
			student2.code("Java");
			student2.attendClass();
			student2.eat("kebab", "soda");
			student2.walk();
			
			
			student.code("python");
			student.attendClass();
			
			Student student3 = new Student();
			student3.name = "Maria";
			student3.age = 28;
			student3.clazz = "Automation";
			
			student3.code("java");
			student3.attendClass();
			student3.walk();
			student3.eat("pupusas", "coffee");
			

	}

}
