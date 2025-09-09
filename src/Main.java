import java.sql.SQLOutput;
class Dates {
    String yy;
    String mm;
    String dd;
    Dates() {
        this("2025", "9", "9");
    }
    Dates(String yy, String mm, String dd){
        this.yy = yy;
        this.mm = mm;
        this.dd = dd;
    }
    Dates(int x){
        this("2025", "7", "19");
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] arg) {
        Dates d = new Dates();
        Dates dd = new Dates(1);

        System.out.println("오늘의 날짜 : "+ d.yy + "년 " + d.mm + "월 " + d.dd + "일");
        System.out.println("강준영 생일 : "+ dd.yy + "년 " + dd.mm + "월 " + dd.dd + "일");
    }
}
