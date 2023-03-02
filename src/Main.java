public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }
    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        String name = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + name + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        String name = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + name + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        String name = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + ' ' + name + ' ' + middleName;
        fullName = fullName.replace('ё', 'е');
        System.out.println("ФИО сотрудника - " + fullName);

    }


}
