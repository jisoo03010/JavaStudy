package test01_01;

public class quize1 {

	public static void main(String[] args) {

		int pencils = 543;
		int students = 30;
		
		//�л� 1���� ������ ������ ���� 
		int pencilsPerStudents = pencils / students;
		System.out.println("�л� 1���� ������ ���ʰ��� : " + pencilsPerStudents);
		
		//���� ������ ���� 
		int pencilsLeft = pencils % students;
		System.out.println("���� ������ ���� : " +pencilsLeft);
	}

}
 