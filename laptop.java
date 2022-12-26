import java.util.ArrayList;

public class laptop {
    int itemID;
    private String brand;
    private String model;
    private String os;
    private int ssd;
    private int ram;
    private int scr;
    private int cost;
    private String colour;

    laptop(int itemID, String brand, String model, String os, int ssd, int ram, int scr, int cost, String colour) {
        this.itemID = itemID;
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ssd = ssd;
        this.ram = ram;
        this.scr = scr;
        this.cost = cost;
        this.colour = colour;
    }

    public void bio() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>================<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.printf("Бренд: %s\n", brand);
        System.out.printf("Модель: %s\n", model);
        System.out.printf("Операционная система: %s\n", os);
        System.out.printf("Объем SSD: %d\n", ssd);
        System.out.printf("Объем RAM: %d\n", ram);
        System.out.printf("Диагональ экрана: %d\n", scr);
        System.out.printf("Цена: %d\n", cost);
        System.out.printf("Цвет: %s\n", colour);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>================<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public static void searchBySSD(ArrayList<laptop> lapList, int param) {
        for (laptop entry : lapList) {
            if (entry.ssd >= param) {
                entry.bio();
            }
        }
    }

    public static void searchByRAM(ArrayList<laptop> lapList, int param) {
        for (laptop entry : lapList) {
            if (entry.ram >= param) {
                entry.bio();
            }
        }
    }

    public static void searchByScreen(ArrayList<laptop> lapList, int param) {
        for (laptop entry : lapList) {
            if (entry.scr >= param) {
                entry.bio();
            }
        }
    }

    public static void searchByCost(ArrayList<laptop> lapList, int param) {
        for (laptop entry : lapList) {
            if (entry.cost <= param) {
                entry.bio();
            }
        }
    }
}
