public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.print("Цена билета: ");
        System.out.println(price + " руб.");
        System.out.print("Начислено: ");
        System.out.println(miles + " миль");
    }
}
