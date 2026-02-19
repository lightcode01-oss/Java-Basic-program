class CUTM{

static int a = 10;
int b = 15;
void local(){
int c = 20;
System.out.println(c);
}

public static void main(String [] args){
CUTM C = new CUTM();

System.out.println(C.a); //object
System.out.println(C.b);

C.local(); //local variable

System.out.println(CUTM.a); // class
System.out.println(a); // normal 
}
}
