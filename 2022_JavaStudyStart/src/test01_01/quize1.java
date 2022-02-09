package test01_01;

public class quize1 {

	public static void main(String[] args) {

		int pencils = 543;
		int students = 30;
		
		//학생 1명이 가지는 연필의 개수 
		int pencilsPerStudents = pencils / students;
		System.out.println("학생 1명이 가지는 연필개수 : " + pencilsPerStudents);
		
		//남은 연필의 개수 
		int pencilsLeft = pencils % students;
		System.out.println("남은 연필의 개수 : " +pencilsLeft);
	}

}
 