import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //параметры
        TradeLibrary<Warehouse> warehouseLibrary = new TradeLibrary<>();
        TradeLibrary<Product> productLibrary = new TradeLibrary<>();

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить склад");
            System.out.println("2. Добавить товар");
            System.out.println("3. Удалить склад");
            System.out.println("4. Удалить товар");
            System.out.println("5. Показать склады");
            System.out.println("6. Показать товары");
            System.out.println("7. Показать все объекты");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите название склада:");
                    String warehouseName = scanner.next();
                    warehouseLibrary.addEntity(new Warehouse(warehouseName));
                    break;

                case 2:
                    System.out.println("Введите название продукта:");
                    String productName = scanner.next();
                    productLibrary.addEntity(new Product(productName));
                    break;

                case 3:
                    System.out.println("Введите склад для удаления склада:");
                    String removeWarehouseName = scanner.next();
                    warehouseLibrary.removeEntity(new Warehouse(removeWarehouseName));
                    break;

                case 4:
                    System.out.println("Введите продукт для удаления:");
                    String removeProductName = scanner.next();
                    productLibrary.removeEntity(new Product(removeProductName));
                    break;

                case 5:
                    System.out.println("\nWarehouses:");
                    warehouseLibrary.displayEntities();
                    break;

                case 6:
                    System.out.println("\nProducts:");
                    productLibrary.displayEntities();
                    break;

                case 7:
                    System.out.println("\nВсе объекты:");
                    displayAllEntities(warehouseLibrary.getAllEntities(), productLibrary.getAllEntities());
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    System.exit(0);

                default:
                    System.out.println("Неизвестныё символ. Попробуйте снова");
                    break;
            }
        }
    }

    private static void displayAllEntities(List<Warehouse> warehouses, List<Product> products) {
        System.out.println("Warehouses:");
        for (Warehouse warehouse : warehouses) {
            System.out.println(warehouse.getName());
        }

        System.out.println("\nProducts:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}