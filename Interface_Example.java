package Java_Lesson;

// all the methods will be abstract

interface calc1{

    public void add();
    public void sub();
    public void mul();
    public void div();

}

class childcalc implements calc1{

    @Override
    public void add() {
        System.out.println("Add Method");

    }

    @Override
    public void sub() {
        System.out.println("Substraction Methods");

    }

    @Override
    public void mul() {
        System.out.println("Mul Methods");

    }

    @Override
    public void div() {
        System.out.println("Div Methods");

    }
}

public class Interface_Example {
    public static void main(String[] args) {
        childcalc c = new childcalc();
        c.add();
        c.div();
        c.mul();
        c.sub();
    }

}
