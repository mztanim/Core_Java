package Java_Lesson;

class encap_ex{
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname(String s) {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}


public class encapsulation_ex1 {
    public static void main(String[] args) {

        encap_ex e = new encap_ex();
        // access now Private String Name using setters and getters
        e.setFirstname("Covid");
        e.getLastname("19");
    }
}
