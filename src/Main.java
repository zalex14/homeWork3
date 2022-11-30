public class Main {
    public static void main(String[] args) {

    // Условный оператор. Часть 1
    // Задание 1
    // Поздравление с совершеннолетием
        System.out.println("Условный оператор. Часть 1. Задание 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравлением с совершеннолетием !");
        }
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать!");
        }

    // Задание 2
    // При выполнении иных условий, меньше 7, по заданию, ничего не выводим
        System.out.println("Задание 2");
        age = 10;
        if (age >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (age >= 18 ) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (age >= 24 ) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

    // Задание 3
    // Вместимость вагона поезда
        System.out.println("Задание 3");

        int amountPassengers = 20 ;  // Задаем загрузку вагона поезда

        int carCapacity = 102;  // Вместимость вагона
        int carSeats = 60;      // Сидячих мест

        if ( amountPassengers <= carSeats ) {
            System.out.println("В вагоне есть сидячие места");
        }
        else if ( amountPassengers <= carCapacity ) {
            System.out.println("В вагоне есть стоячие места");
        }
        else {
            System.out.println("Вагон полностью заполнен, мест нет");
        }

    // Домашнее задание - 3. Задание 1
    // В какое учреждение отправить человека в зависимости от его возраста. До 2 лет сообщение не выводится
        System.out.println("Условный оператор. Домашнее задание. Задание 3.1");
        age = 10;
        if (age >= 2 && age < 6 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age < 18 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age >= 18 && age < 24 ) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age >= 24 ) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

    // Домашнее задание - 3. Задание 2
    // На аттракционах действуют ограничения и для детей по возрасту
        System.out.println("Задание 3.2");

        age = 8;
        if (age < 5 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        }
        else if (age >= 5 && age < 14 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else if (age >= 14 ) {
            System.out.println("Если возраст равен " + age + ", то он может кататься без сопровождения взрослого");
        }

    // Домашнее задание - 3. Задание 3
    // Какое из трех чисел большее
        System.out.println("Условный оператор. Домашнее задание. Задание 3.3");
        int one = 1;
        int two = 2 ;
        int three = 3 ;
        if ( one > two && one > three ) {
            System.out.println("one большее");
        }
        else if ( two > one && two > three ) {
            System.out.println("two большее");
        }
        else if ( three > one && three > two ) {
            System.out.println("three большее");
        }
        else if ( one == two  ) {
            System.out.println("one и two большие");
        }
        else if ( one == three  ) {
            System.out.println("one и three большие");
        }
        else {
            System.out.println("two и three большие");
        }

    }
}