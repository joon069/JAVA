public class  Main {
    public static void main(String args[]) {
        Pizza p = new Pizza("페퍼로니 피자", 17000, "L");
        Food f = new Food();

        f.getInfo();
        p.getInfo();
        p.yokmang();
    }
}

class Food{
    String name;
    int price;
    Food(){
        this("hamburger", 6500);
    }
    Food(String name, int price){
        this.name = name;
        this.price = price;
    }
    void getInfo(){
        System.out.println("name : " + name);
        System.out.println("price : " + price);
    }
}

class Pizza extends Food{
    String size;
    Pizza(String name, int price, String size){
        super();
        this.name = name;
        this.price = price;
        this.size = size;
    }
    void getInfo(){
        System.out.println("name : " + name);
        System.out.println("price : " + price);
        System.out.println("size : " + size);
    }
    void yokmang(){
        System.out.println("사실 진짜로 먹고 싶은 음식 " + super.name);
    }
}