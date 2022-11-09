public class Main {
    public static void main(String[] args) {
 Programmer programmer=new Programmer("Nursultan","Manager","Microsoft");
        System.out.println(programmer.toString());
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        Dancer dancer=new Dancer("Erbolot","Teacher","STARS");
        System.out.println("\n"+dancer.toString());
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        Singer singer=new Singer("Aybek","choreographer","Beatles");
        System.out.println("\n"+singer.toString());
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();



    }
}