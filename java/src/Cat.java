public class Cat
{
	// 实例变量
	private String name;
	private int age;
	static String cname;

	// 入口函数
	public static void main(String[] args)
	{
		Cat c1 = new Cat();
		c1.name = "小黑";
		c1.age = 1;
		System.out.println(c1.name + "的年龄为" + c1.age);
	}

}
