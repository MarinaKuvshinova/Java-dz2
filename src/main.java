import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������� 1: "+new StringBuffer(args.toString()).reverse());
		
		Scanner in = new Scanner(System.in);
		System.out.println("������� 2");
        String input;
        String input_control = "12345";
        boolean flag = false; 
        while(flag!=true) {
    		System.out.println("������� ������ ");
            input = in.nextLine();
            if((input_control).equals(input)) {
        		System.out.println("������ ������");
        		flag = true;
            } else {
        		System.out.println("������ �� ������. ���������� ��� ���");
            }
        }
		System.out.println("������� 3");
		System.out.println("������� ����� � ");
        int a = in.nextInt();
		System.out.println("������� ����� b ");
        int b = in.nextInt();
		System.out.println("������������ ����� (a + b): "+a+ " + "+b + " = "+(a+b));
		
		

	}

}
