class Xyz{
    public Xyz(boolean y){
        System.out.println("Constructor");
    }
    public Xyz(int x){
        System.out.println("Parameterized Constructor");
    }
}
public class Hello{

    public static void main (String [] args){
        Xyz b=new Xyz(true);
    }
}