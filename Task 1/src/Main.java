import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("Сколько у вас жабьих глаз?");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Сколько у вас слез вурдалака?");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Сколько у вас костей ворона?");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Сколько у вас пельменей?");
        dumplingsCount = new Scanner(System.in).nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        boolean isThereAnything = false;
        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить Элексир зоркости");
            isThereAnything = true;
        }
        if (dumplingsCount >= 4 && ravenBonesCount >= 2) {
            System.out.println("Вы можете приготовить Эликсир стойкости");
            isThereAnything = true;
        }
        if (dumplingsCount >= 1 && toadEyesCount >= 2 && ghoulTearsCount >= 7) {
            System.out.println("Вы можете приготовить Эликсир скрытности");
            isThereAnything = true;
        }
        if (dumplingsCount >= 10 && toadEyesCount >= 4 && ghoulTearsCount >= 5 && ravenBonesCount >= 3) {
            System.out.println("Вы можете приготовить Запретный эликсир");
            isThereAnything = true;
        }
        if (isThereAnything == false) {
            System.out.println("У вас недостаточно ингредиентов для зельев");
        }
    }
}
