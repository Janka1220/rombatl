// A program a rombusz területét hivaott kiszámítani, a felhasználó által megadott átlókkal
//Havel Janka
//2024-10-07
//SZOFT II/1/N

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rombusz területe számítás ");
        System.out.println("Havel Janka, SZOFT II/1/N");

        Rombusz rombusz = new Rombusz();
        rombusz.inPut();
        System.out.println("A rombusz területe: " + rombusz.calcArea());
    }
}
