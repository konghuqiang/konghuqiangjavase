public class Studen
{
	// ȫ��ʵ������
	String name;
	double money;
	byte age;
	// ȫ�־�̬����
	static String sname;

	public static void main(String[] args)
	{
		Studen s1 = new Studen();
		s1.name = "�׻�ǿ";
		s1.money = 2000.000;
		s1.sname = "�Ͼ��Ƽ�ְҵѧԺ";
		System.out.println(s1.name + "," + s1.money + "," + s1.sname);
		Studen s2 = new Studen();
		s2.name = "������";
		s2.money = 1999.9;
		System.out.println(s2.name + "," + s2.money + "," + s2.sname);
	}
}
