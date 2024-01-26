import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String[] args)//Создаём мейн
    {
        Scanner scanner = new Scanner (System.in);
    try {
        FileWriter fileWriter = new FileWriter("C:\\Users\\Admin\\Desktop\\Students.txt");//Создаём путь куда программе надо записывать наших студентов
        int numberOStudents;
        System.out.print("Введите количество студентов");//Вывод слов
        numberOStudents = scanner.nextInt();
        scanner.nextLine();// Сбросить символ новой строки после ввода числа
        for (int i = 0; i<numberOStudents; i++) {
            System.out.println("Введите информацию  студенте" + (i + 1) + ":");//Число что ввёл пользователь было записано в переменную и сейчас будет крититься в for, это было сделано для того чтобы ввести множество студентов.
            System.out.print("Имя:");//Далее идёт ввод данных о студенте с разделением для новой строчки, после эти данные запонимаются и сохраняются в txt файле
            String name = scanner.nextLine();
            System.out.print("Возраст:");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Средний балл:");
            double averageDouble = scanner.nextDouble();
            scanner.nextLine();
            fileWriter.write("Имя:" + name + "Возраст:" + age + "Средний балл" + averageDouble); // Записать информацию о студенте в файл
        }
        fileWriter.close();
        System.out.println("Данные сохраненны");}//Сообщение о том что данные успешно сохранены
    catch (IOException e){System.out.println ("Ошибка");
    }//Выводится если в ходе работы возникла ошибка
    }
}
























