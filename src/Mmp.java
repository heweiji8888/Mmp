import java.util.Scanner;


public class Mmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new  Scanner(System.in);
	System.out.println("请输入一个数");
	int b=sc.nextInt();
	Lolo(b);
	
	
	}
	public static void Lolo(int c){
		for (int i=1;i<=c; i++){
		System.out.println(i);
	}
}
}