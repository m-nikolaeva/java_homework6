import java.util.ArrayList;
import java.util.Scanner;

public class notebookShop {

    public static void shopInterface() {
        ArrayList<laptop> lapList = new ArrayList<>();
        lapList.add(laptopData.firstLap);
        lapList.add(laptopData.secondLap);
        lapList.add(laptopData.thirdLap);
        lapList.add(laptopData.fourthLap);
        lapList.add(laptopData.fifthLap);
        lapList.add(laptopData.sixLap);
        lapList.add(laptopData.sevenLap);
        lapList.add(laptopData.eightLap);
        lapList.add(laptopData.nineLap);
        lapList.add(laptopData.tenLap);
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        while (flag) {
            System.out.println();
            System.out.println("Выберите цифру интересующего Вас пункта меню:");
            System.out.println();
            System.out.println("1. Посмотреть все ноутбуки");
            System.out.println("2. Поиск ноутбука по параметрам");
            System.out.println("3. Завершить работу");
            System.out.println();
            int userClick = scan.nextInt();
            if (userClick == 1) {
                laptopData.firstLap.bio();
                laptopData.secondLap.bio();
                laptopData.thirdLap.bio();
                laptopData.fourthLap.bio();
                laptopData.fifthLap.bio();
                laptopData.sixLap.bio();
                laptopData.sevenLap.bio();
                laptopData.eightLap.bio();
                laptopData.nineLap.bio();
                laptopData.tenLap.bio();
                System.out.println("Для возврата в главное меню введите '0' ");
                userClick = scan.nextInt();
                if (userClick == 1) {
                    shopInterface();
                } else {
                    shopInterface();
                }
            } else if (userClick == 2) {
                System.out.println("Выберите критерий для поиска, используя номер пункта меню:");
                System.out.println("1. Объем жесткого диска");
                System.out.println("2. Объем оперативной памяти");
                System.out.println("3. Диагональ экрана");
                System.out.println("4. Цена");
                userClick = scan.nextInt();
                if (userClick == 1) {
                    System.out.println("Введите минимальный объем жесткого диска: ");
                    int searchValue = scan.nextInt();
                    laptop.searchBySSD(lapList, searchValue);
                } else if (userClick == 2) {
                    System.out.println("Введите минимальный объем оперативной памяти: ");
                    int searchValue = scan.nextInt();
                    laptop.searchByRAM(lapList, searchValue);
                } else if (userClick == 3) {
                    System.out.println("Введите минимальный размер диагонали экрана: ");
                    int searchValue = scan.nextInt();
                    laptop.searchByScreen(lapList, searchValue);
                } else if (userClick == 4) {
                    System.out.println("Введите максимально допустимую цену: ");
                    int searchValue = scan.nextInt();
                    laptop.searchByCost(lapList, searchValue);
                } else {
                    System.out.println("Неккоректный ввод, возврат в главное меню");
                    shopInterface();
                }
            } else if (userClick == 3) {
                flag = false;
            } else {
                System.out.println("Неккоректный ввод возврат в главное меню");
                shopInterface();
            }
        }
        scan.close();
    }
}
