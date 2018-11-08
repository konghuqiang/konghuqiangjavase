public class Studen
{
	// 全局实例变量
	String name;
	double money;
	byte age;
	// 全局静态变量
	static String sname;

	public static void main(String[] args)
	{
		Studen s1 = new Studen();
		s1.name = "孔虎强";
		s1.money = 2000.000;
		s1.sname = "南京科技职业学院";
		System.out.println(s1.name + "," + s1.money + "," + s1.sname);
		Studen s2 = new Studen();
		s2.name = "王安乐";
		s2.money = 1999.9;
		System.out.println(s2.name + "," + s2.money + "," + s2.sname);
	}
}
