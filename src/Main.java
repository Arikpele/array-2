public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
//Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
// «Сумма трат за месяц составила … рублей».
    public static void task1() {
        System.out.println("задача 1");
        {
            int[] arr = generateRandomArray();
            int total = 0;
            for (int element : arr) {
                total += element;
            }
            System.out.println("Сумма трат за месяц составила " + total + " рублей");
        }
    }

    //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
    //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
    // «Минимальная сумма трат за день составила … рублей.
    // Максимальная сумма трат за день составила … рублей».
    public static void task2() {
        System.out.println("задача 2");
        {
            int[] arr = generateRandomArray();
            int maxPayment = 0;
            for (final int current : arr) {
                if (current > maxPayment) {
                    maxPayment = current;


                }
            }
            System.out.println("Максимальная сумма трат за день составила " + maxPayment);

            int maxPayment1 = 200001;
            for (final int current : arr) {
                if (current < maxPayment1) {
                    maxPayment1 = current;
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + maxPayment1);
        }
    }

    //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
//Напишите программу, которая посчитает среднее значение трат за месяц
// (то есть сумму всех трат за месяц поделить на количество дней),
// и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
    public static void task3() {
        System.out.println("задача 3");
        {
            int[] arr = generateRandomArray();
            int total = 0;
            for (int element : arr) {
                total += element;
            }
            double x = (total * 1.) / arr.length;
            System.out.println("Сумма трат за месяц составила " + x + " рублей");

        }
    }


    //В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников
    // начали отображаться в обратную сторону.
// Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ».
// Данные с именами сотрудников хранятся в виде массива символов — char[ ].
    public static void task4() {

        System.out.println("задача 4");




        char[] name = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print(name[i]);
        }
    }

    }




