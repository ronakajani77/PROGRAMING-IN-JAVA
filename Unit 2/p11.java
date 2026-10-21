class Student 
{
    	private String name;
    	private int age;
    	private double gpa;

    	public Student(String name, int age, double gpa)
	{
        	this.name = name;
        	setAge(age);
        	setGpa(gpa);
    	}

    	public String getName()
	{
        	return name;
    	}

    	public void setName(String name)
	{
        	this.name = name;
    	}

    	public int getAge()
	{
        	return age;
    	}

    	public void setAge(int age)
	{
        	if (age > 0){
            		this.age = age;
        	} else {
            		System.out.println("Invalid age provided.");
        	}
    	}

    	public double getGpa() 
	{
        	return gpa;
    	}

    	public void setGpa(double gpa)
	{
        	if (gpa >= 0.0 && gpa <= 4.0){
            		this.gpa = gpa;
        	} else {
            		System.out.println("Invalid GPA provided. Must be between 0.0 and 4.0.");
        	}
    	}
}

public class Main 
{
    	public static void main(String args[])
	{
        	Student student = new Student("Alex", 20, 3.8);

        	System.out.println("Student Name: " + student.getName());
        	System.out.println("Student Age: " + student.getAge());
        	System.out.println("Student GPA: " + student.getGpa());

        	System.out.println("\nUpdating student details with valid values.");
        	student.setAge(21);
        	student.setGpa(3.9);
        	System.out.println("New Age: " + student.getAge());
        	System.out.println("New GPA: " + student.getGpa());

        	System.out.println("\nAttempting to set invalid values.");
        	student.setAge(-5);
        	student.setGpa(4.5);
    	}
}