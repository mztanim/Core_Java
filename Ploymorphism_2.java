package Java_Lesson;

class parentmarriage{
    public void bride(){
        String name = "Simran";
        System.out.println("Bride name is "+name);

    }
    public void property(){
        System.out.println("Gold in Kgs - 100");
    }
}

class childmarriage extends parentmarriage{
    public void bride(){
        String name = "Sohana";
        System.out.println("Bride name is "+name);

    }
}

public class Ploymorphism_2 {

    public static void main(String[] args) {

        childmarriage c = new childmarriage();
        c.bride();
        c.property();
    }
}
