public class Emp
{
	// 全局实例变量
	String name;
	double money;
	// 全局静态变量
	static double dname;

	// 方法
	void a()
	{
		// 局部变量
		double t = 500;
		money = money + t;
		System.out.println(name + "加薪后工资为" + money);
	}

	public static void main(String[] args)
	{
		// 创建对象 e1
		Emp e1 = new Emp();
		// 赋值
		e1.money = 1000;
		e1.name = "孔虎强";
		System.out.println(e1.name + "原本工资为" + e1.money);
		// 调用方法
		e1.a();
		// 创建对象 e2
		Emp e2 = new Emp();
		// 赋值
		e2.money = 2000;
		e2.name = "王安乐";
		System.out.println(e2.name + "原本工资为" + e2.money);
		// 调用方法
		e2.a();
	}

}
