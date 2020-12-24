package Java_Lesson;

public class Polymorphism_1 {

    //methods overloading
    // method overriding

    // METHOD OVERLOADING EXAMPLE
    //early binding or compile time binding

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
    //float 2 variables
    public float add(float a, int b){
        return a+b;
    }
    // float 3 variables
    public float add(float a, float b, float c){
        return a+b+c;
    }
    // mixed data types
    public float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Polymorphism_1 overloading = new Polymorphism_1();
        System.out.println(overloading.add(10,10));
        System.out.println(overloading.add(23,34,45));
        System.out.println(overloading.add(19.90f,35.78f,89.99f));
    }
}
