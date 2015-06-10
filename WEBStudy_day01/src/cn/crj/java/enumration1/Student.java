package cn.crj.java.enumration1;

/**
 * @author ivan
 *
 */
public class Student {
	private String name;
	private Grade grade;
	public Student(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade getGrade() {
		
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
		
	}
	
	public static void main(String[]args){
		Student student=new Student();
		student.setName("jack");
		student.setGrade(Grade.A);
		System.out.println("xingming:"+student.getName());
		System.out.println("fenshu:"+student.getGrade().getRemark());
	}
}
