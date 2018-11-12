//封装
public class Stu
{
	private String name;
	private int age;
	static String sname;

	public void setAge(int age)
	{
		if (age > 0 && age < 400)
		{
			this.age = age;

		}
		else
		{
			System.out.println("输入的年龄不对");

		}

	}

	public int getAge()
	{
		if (this.age > 0 && this.age < 400)
		{
			return this.age;
		}
		else
		{
			return 0;
		}

	}

	public void setName(String name)
	{
		this.name = name;

	}

	public String getName()
	{
		return this.name;
	}

}
