package cn.crj.java.reflect;

public class Person {
	private String name;
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(){
		System.out.println("public Person()");
		
	}
	
	public void show(){
		System.out.println("public Person()");
	}
	
	public void show(String[]hobbies,double d){
		for(String str:hobbies){
			System.out.println(str);
		}
		System.out.println(d);
	}
	
	@SuppressWarnings("unused")
	private void haha(){
		System.out.println("haha");
	}
	
	@SuppressWarnings("unused")
	private String godbye(){
		return "2222";
	}
	
	public static void main1(String[]args){
		System.out.println("	public static void main(String[]args)");
	}
	
	public static void main(String[]args){
		System.out.println("	public static void main(String[]args)");
	}
}
