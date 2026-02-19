class cao{

String name;//instance variable
int regdno ;
String dept;

static int mobNo;
static String mailid;

public static void main(String[] args){

//create the object of class

cao s = new cao();
s.name="Abhinav";
s.dept="BCA";
s.regdno = 136;
s.mobNo=1070;
s.mailid="136@cutm.ac.in";

System.out.println("My nam is :" + s.name);
System.out.println("My dept is :" + s.dept);
System.out.println("My reg number is " + s.regdno);
System.out.println("My mob no is " + s.mobNo);
System.out.println("My mail id of clg is " + s.mailid);

}
}


