class Animal{

String name;
String breed;
int age;

static String colour;
static int regnumberatzoo;
static String location;

public static void main (String[] args){

Animal k = new Animal();
k.name="Dog";
k.breed="doerman";
k.age= 2;

Animal.colour="Brown";
Animal.regnumberatzoo=211;
Animal.location="zoo";

System.out.println(k.name);
System.out.println(k.breed);
System.out.println(k.age);
System.out.println(Animal.colour);
System.out.println(Animal.regnumberatzoo);
System.out.println(Animal.location);

}
}