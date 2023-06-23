package start;// http://www.kodesource.top/java-exercises/conditional-statement/index.php

import exercises.*;

public class Menu {

    public void chooseMenu(int number) {
        switch (number) {
            case 1:
                Conditions conditions = new Conditions();
                conditions.NegativeNumbers();
                break;
            case 2:
                QuadraticEquations quadratic = new QuadraticEquations();
                quadratic.calculateRoots();
                break;
            case 3:
                BiggestNumber biggestNumber = new BiggestNumber();
                biggestNumber.calculateBiggestNum();
                break;
            case 4:
                AbsoluteNumber absoluteNumber = new AbsoluteNumber();
                absoluteNumber.calculateAbsoluteNumber();
                break;
            case 5:
                DayCalculator dayCalculator = new DayCalculator();
                dayCalculator.calculateDayByNumber();
                break;
            case 6:
                NumbersEquality numbersEquality = new NumbersEquality();
                numbersEquality.defineEquality();
                break;
            case 7:
                NumberOfDays numberOfDays = new NumberOfDays();
                numberOfDays.calculateDaysInMonth();
                break;
            case 8:
                VowelConsonantSound vowelConsonantSound = new VowelConsonantSound();
                vowelConsonantSound.checkSound();
                break;
            case 9:
                LeapYear leapYear = new LeapYear();
                leapYear.checkYear();
                break;
            case 10:
                PositiveInteger positiveInteger = new PositiveInteger();
                positiveInteger.printNumbers();
                break;
            case 11:
                PositiveInteger positiveInteger1 = new PositiveInteger();
                positiveInteger1.printNextIntegerAndSum();
                break;
            case 12:
                Averages averages = new Averages();
                averages.calculateAverage();
                break;
            case 13:
                NumberOperations numberOperations = new NumberOperations();
                numberOperations.calculateCube();
                break;
            case 14:
                MultiplicationTable table = new MultiplicationTable();
                table.printMultiplicationTable();
                break;
            case 15:
                OddNaturalNumber oddNaturalNumber = new OddNaturalNumber();
                oddNaturalNumber.printOddNumbers();
                break;
            case 16:
                Triangle triangle = new Triangle();
                triangle.printRightTriangleNumbersInOrder();
                break;
            case 17:
                Triangle triangle1 = new Triangle();
                triangle1.printRightTriangleNumbersInRow();
                break;
            case 18:
                Triangle triangle2 = new Triangle();
                triangle2.printRightTriangleNumbersInRowPlusOne();
                break;
            case 19:
                Pyramid pyramid = new Pyramid();
                pyramid.printPyramid();
                break;
            case 20:
                TriangleFloyd floyd = new TriangleFloyd();
                floyd.printTriangle();
                break;
            default:
                System.out.println("Такого упражнения нет");
        }
    }

    public void printMenu(int page) {
        switch (page) {
            case 1:
                print_1();
                break;
            case 2:
                print_2();
                break;
            default:
                System.out.println("Такой страницы нет");
                break;
        }

    }

    private void print_1(){
        System.out.println("#1:");
        System.out.println("Напишите программу на Java, чтобы получить число от пользователя, и распечатайте, является ли оно положительным или отрицательным.");
        System.out.println("\n#2:");
        System.out.println("Напишите программу на Java для решения квадратных уравнений");
        System.out.println("\n#3:");
        System.out.println("Возьмите три цифры у пользователя и напечатайте наибольшее число.");
        System.out.println("\n#4:");
        System.out.println("Напишите программу на Java, которая читает число с плавающей запятой и печатает «ноль», если число равно нулю. В противном случае выведите «положительный» или «отрицательный». Добавьте «маленький», если абсолютное значение числа меньше 1, или «большой», если он превышает 1 000 000.");
        System.out.println("\n#5:");
        System.out.println("Напишите программу на Java, которая хранит число от пользователя и генерирует целое число от 1 до 7 и отображает название дня недели.");
        System.out.println("\n#6:");
        System.out.println("Напишите программу на Java, которая считывает два числа с плавающей запятой и проверяет, совпадают ли они с точностью до трех десятичных знаков. ");
        System.out.println("\n#7:");
        System.out.println("Напишите программу на Java, чтобы узнать количество дней в месяце. ");
        System.out.println("\n#8:");
        System.out.println("Напишите программу на Java, в которой пользователю нужно предоставить один символ из алфавита. Печать гласного или согласного, в зависимости от ввода пользователя. Если пользовательский ввод не является буквой (между a и z или A и Z) или является строкой длиной> 1, выведите сообщение об ошибке.");
        System.out.println("\n#9:");
        System.out.println("Напишите программу на Java, от которой у пользователя уходит год, и напечатайте, является ли этот год високосным или нет.");
        System.out.println("\n#10");
        System.out.println("Напишите программу на Java для отображения первых 10 натуральных чисел.");
    }

    private void print_2(){
        System.out.println("#11:");
        System.out.println("Напишите программу на Java для отображения n терминов натуральных чисел и их суммы.");
        System.out.println("\n#12:");
        System.out.println("Напишите программу на Java, чтобы ввести 5 цифр с клавиатуры и найти их сумму и среднее");
        System.out.println("\n13:");
        System.out.println("Напишите программу на Java, чтобы отобразить куб числа до заданного целого числа.");
        System.out.println("\n14:");
        System.out.println("Напишите программу на Java для отображения таблицы умножения заданного целого числа.");
        System.out.println("\n15:");
        System.out.println("Напишите программу на Java для отображения n терминов нечетного натурального числа и их суммы.");
        System.out.println("\n16:");
        System.out.println("Напишите программу на Java для отображения шаблона в виде прямоугольного треугольника с номером.");
        System.out.println("\n17:");
        System.out.println("Напишите программу на Java для создания такого шаблона, как прямоугольный треугольник, с номером, который будет повторять число в ряду.");
        System.out.println("\n18:");
        System.out.println("Напишите программу на Java, чтобы сделать такой шаблон, как прямоугольный треугольник, с числом, увеличенным на 1");
        System.out.println("\n19:");
        System.out.println("Напишите программу на Java, чтобы сделать такой шаблон, как пирамида, с числом, которое будет повторять число в той же строке.");
        System.out.println("\n20:");
        System.out.println(" Напишите программу на Java для печати треугольника Флойд");
    }
}
