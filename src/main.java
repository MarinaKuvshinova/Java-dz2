import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("задание 1: "+new StringBuffer(args.toString()).reverse());
		
		Scanner in = new Scanner(System.in);
		System.out.println("задание 2");
        String input;
        String input_control = "12345";
        boolean flag = false; 
        while(flag!=true) {
    		System.out.println("введите пароль ");
            input = in.nextLine();
            if((input_control).equals(input)) {
        		System.out.println("пароль верный");
        		flag = true;
            } else {
        		System.out.println("Пароль не вырный. Попробуйте еще раз");
            }
        }
		System.out.println("задание 3");
		System.out.println("введите число а ");
        int a = in.nextInt();
		System.out.println("введите число b ");
        int b = in.nextInt();
		System.out.println("Произведение чисел (a + b): "+a+ " + "+b + " = "+(a+b));
		
		

	}

}
