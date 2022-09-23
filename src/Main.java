public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задание 2
        System.out.println("Задача №2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);

        // Задание 3
        System.out.println("Задача №3");
        fullName = "Иванов Семён Семёнович";
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}