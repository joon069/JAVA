import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] arg) {

        Put p = new Put();
        p.put("강준영");
        p.put(17);
        System.out.println(User.name);
        System.out.println(User.age);
    }
    static class User{
        static String name = "Unknown";
        static int age = 0;
    }
}

class Put {
    void put(String n){
        Main.User.name = n;
    }
    void put(int n){
        Main.User.age = n;
    }
}
