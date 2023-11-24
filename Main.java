public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        Triangolo triangolo = new Triangolo(3, 4);
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());
    }
}
