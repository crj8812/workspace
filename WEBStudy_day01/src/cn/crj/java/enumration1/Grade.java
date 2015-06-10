package cn.crj.java.enumration1;

public enum Grade {
	//相当玉Grade的实例
	A("A","90-100"),
	B("B","80-89"),
	C("C","70-79"),
	D("D","60-69"),
	E("E","<60");
	
	private String tip;
	private String remark;
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	private Grade(String tip,String remark){
		this.tip=tip;
		this.remark=remark;
	}
	
}

/*//单例
public class Grade{
	protected static Grade grade;
	private Grade(){}
	public static Grade instance(){
		if(grade==null){
			grade=new Grade();
		}
		return grade;
	}
}
//测试proteceted类型，在包外，如果想要访问proteceted类型，需要继承，且只能在子类中
 public class Grade{
	protected int i;
}
*/