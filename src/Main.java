public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog += 4;
        var cat = 3.6;
        cat += 4;
        var paper = 763789;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog -= 3.5;
        var cat = 3.6;
        cat -= 1.6;
        var paper = 763789;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Friend = " + friend);
        friend += 2;
        System.out.println("Addition by 2 = " + friend);
        friend /= 7;
        System.out.println("Division by 7 = " + friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("Frog = " + frog);
        frog *= 10;
        System.out.println("Multiplication by 10 = " + frog);
        frog /= 3.5;
        System.out.println("Division by 3.5 = " + frog);
        frog += 4;
        System.out.println("Addition by 4 = " + frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = (firstBoxerWeight + secondBoxerWeight) / 2;
        System.out.println("Total weight = " + totalWeight);
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Weight difference = " + weightDifference);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightDifferenceSubtraction = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Subtraction method = " + weightDifferenceSubtraction);
        var weightDifferenceRemainder = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Remainder method = " + weightDifferenceRemainder);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var workingHours = 640;
        var workingHoursPerEmployee = 8;
        var numberOfEmployees = workingHours / workingHoursPerEmployee;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        numberOfEmployees += 94;
        var newWorkingHoursPerEmployee = workingHours / numberOfEmployees;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + newWorkingHoursPerEmployee + " часов работы может быть поделено между сотрудниками");
    }
}