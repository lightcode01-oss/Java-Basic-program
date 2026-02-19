class Constructor{
String name;
int age;


Constructor(String n ,int a){
name = n;
age = a;
}

void display(){
System.out.println("Name");
System.out.println("age");
}

public static void main(String[] args){
Constructor S=new Constructor("Abhinav",18);
S.display();

}
}