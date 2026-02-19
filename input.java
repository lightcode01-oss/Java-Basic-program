import java.util.Scanner;
class Input{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();
int roll_no = sc.nextInt();
String Dept = sc.nextLine();
String section = sc.nextLine();
System.out.println("Name of student is :"+ name);
System.out.println("Roll no is :"+ roll_no);
System.out.println("Student department  :"+ Dept);
System.out.println("Student section  :"+section);
}
}