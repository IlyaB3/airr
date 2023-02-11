public class Main {
    public static void main(String[] args) {

        /*   Стоимость билета */
        int amount = 42560;
        /* Стоимость 1 мили */
        int mile = 20;
        int bonus = (amount / mile);

        System.out.println("Количество бонусных милей: " + bonus);
    }
}