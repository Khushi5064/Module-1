package Module_2;

	class Member{
		String name,address, pnumber;
		int age,salary;
	
		public Member(String name, int age, String pnumber, String address, int salary)
		{
			this.name = name;
			this.age = age;
			this.pnumber = pnumber;
			this.address = address;
			this.salary=salary;
		}
		public void printsalary() {
		System.out.println(salary);
	}
}
	class Employee extends Member
	{
	private String sp;
	public 	Employee(String name,int age,String number,String add,int salary,String sp){
	super(name,age,number,add,salary);
	this.sp=sp;
	System.out.println("Employee Details:-");
	System.out.println("Name:-"+name);
	System.out.println("Age:-"+age);
	System.out.println("Phone number:-"+number);
	System.out.println("Address:-"+add);
	System.out.println("specialization:-"+sp);
	
	}
}
	class Manager extends Member{
		private String dep;
		public Manager(String name,int age, String number,String add,int salary,String dep) {
			super(name,age,number,add,salary);
			this.dep=dep;
			System.out.println("\n\n\n-:Manager Details:-");
			System.out.println("Name:-"+name);
			System.out.println("Age:-"+age);
			System.out.println("Phone number:-"+number);
			System.out.println("Address:-"+add);
			System.out.println("Department:-"+dep);
		}
	}
public class Que_12 {
		public static void main(String[] args) {
			Employee e = new Employee("khushi",20,"9726330406","Ahmedabad",10000,"IT");
			e.printsalary();
			Manager m = new Manager("Vani",22,"9904466765","Maninagar",10000,"Marketing");
			m.printsalary();
		}
	}

