public class Emp
{
	// ȫ��ʵ������
	String name;
	double money;
	// ȫ�־�̬����
	static double dname;

	// ����
	void a()
	{
		// �ֲ�����
		double t = 500;
		money = money + t;
		System.out.println(name + "��н����Ϊ" + money);
	}

	public static void main(String[] args)
	{
		// �������� e1
		Emp e1 = new Emp();
		// ��ֵ
		e1.money = 1000;
		e1.name = "�׻�ǿ";
		System.out.println(e1.name + "ԭ������Ϊ" + e1.money);
		// ���÷���
		e1.a();
		// �������� e2
		Emp e2 = new Emp();
		// ��ֵ
		e2.money = 2000;
		e2.name = "������";
		System.out.println(e2.name + "ԭ������Ϊ" + e2.money);
		// ���÷���
		e2.a();
	}

}
