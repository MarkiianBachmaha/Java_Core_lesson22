package task01;

public class Application {

	public static void main(String[] args) {

		Pet cat = () -> System.out.println("� �� - �����-�����");
		Pet cow = () -> System.out.println("� ������ - ����-����");
		Pet dog = () -> System.out.println("� ��� - �����-�����");

		cat.makeSound();
		cow.makeSound();
		dog.makeSound();

	}

}