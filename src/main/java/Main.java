public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 50000;
        boolean registered = false;
        long bonus = service.calculate(amount, registered);
        System.out.println("Бонус: " + bonus);
    }
}