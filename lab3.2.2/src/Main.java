import java.util.*;
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Магазин");
        shop.addCustomerToShopList(new Customer(
                "Иван",
                "Дроздов",
                "Михайлович",
                "Россия",
                121212,
                388112
        ));
        shop.addCustomerToShopList(new Customer(
                "Андрей",
                "Иванов",
                "Иванович",
                "США",
                111,
                42145
        ));
        shop.addCustomerToShopList(new Customer(
                "Богдан",
                "Петров",
                "Петрович",
                "Великобритания",
                12345,
                1344
        ));
        shop.addCustomerToShopList(new Customer(
                "Владислав",
                "Бекзодов",
                "Шансонович",
                "москва",
                67890,
                1234443
        ));

        System.out.println("Сортировка по имени:");
        List<Customer> listSortByName = shop.getListByName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("Сортировка по фамилии:");
        List<Customer> listSortByName2 = shop.getListByName2();
        for (Customer c : listSortByName2) {
            System.out.println(c);
        }

        System.out.println("Сортировка по карте:");
        List<Customer> listSortByDiapazonCreditCard = shop.getListByDiapasonCreaditCard(22_33_44_55, 66_77_88_99);
        for (Customer c : listSortByDiapazonCreditCard) {
            System.out.println(c);
        }
    }
}

