class automobile{
    void factory(){
        System.out.println("I am factory");
        
    }
}

class bmw extends automobile{
    void bike(){
        System.out.println("bmw manufactured");
    }
}

class tata extends bmw{
    void car(){
        System.out.println("tata manufactured");
    }
}

public class vechile extends tata{
    public static void main(String[] args) {
        tata m1 = new tata();
        m1.factory();
        m1.bike();
        m1.car();
    }
}
