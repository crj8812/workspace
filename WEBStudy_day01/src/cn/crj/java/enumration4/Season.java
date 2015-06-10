package cn.crj.java.enumration4;

//季节枚举类
public enum Season {
	//匿名内部类
	SPRINT("春天") {
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("春天");
		}
	},
	SUMMER("夏天") {
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("夏天");
		}
	},
	AUTOMN("秋天") {
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("秋天");
		}
	},
	WINNTER("冬天") {
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("冬天");
		}
	};
	
	private String tip;
	private Season(String tip){
		this.tip=tip;
	}
	
	public String getTip(){
		return tip;
	}
	
	//抽象方法
	public abstract void show();
}
