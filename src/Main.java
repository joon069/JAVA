//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class a4Paper {
    static int width = 210;
    static int height = 297;

    String write;
    Boolean isOk = true;

    void Ggugigi() {isOk = false;}

}

public class Main {
    public static void main(String[] args) {

        a4Paper p1 = new a4Paper();
        a4Paper p2 = new a4Paper();

        System.out.println("p1's width " + p1.width);
        System.out.println("p1's height " + p1.height);

        System.out.println("p2's width " + p2.width);
        System.out.println("p2's height " + p2.height);

        p1.write = "안녕하세요 저는 1학년 1반 강준영입니다.";
        p2.write = "안녕하세요 저는 1학년 1반 석준영입니다.";

        System.out.println("p1 :" + p1.write);
        System.out.println("p2 :" + p2.write);
    }
}