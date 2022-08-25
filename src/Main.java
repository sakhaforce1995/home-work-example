public class Main {
    public static void main(String[] args){
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собака " + dog);
        System.out.println("Кошка " + cat);
        System.out.println("Бумага " + paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // 3адача 3
        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Теперь " + dog1 + " собак!");
        System.out.println("Теперь " + cat + " кошек!");
        System.out.println("Теперь " + paper + " бумагов!");

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend + " друзей");

        friend = friend + 2;
        System.out.println("Теперь на " + friend + " друзей");

        friend = friend / 7;
        System.out.println("Потерял много друзей, теперь на " + friend + " друзья!");

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog + " с половиной лягушек");

        frog = frog * 10;
        System.out.println(frog + " лягушек");

        frog = frog / 3.5;
        System.out.println("Потерял много лягушек, теперь на " + frog + " лягушки");

        frog = frog + 4;
        System.out.println("Родились " + frog + " лягушонок");

        // Задача 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес " + (boxer1Weight + boxer2Weight));
        System.out.println("Разница весов двух бойцов " + (boxer2Weight - boxer1Weight));

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница весов двух бойцов 1 способ " + (boxer2Weight - boxer1Weight));
        System.out.println("Разница весов двух бойцов 2 способ " + (boxer2Weight % boxer1Weight));

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании " + totalWorkingHours / hoursPerDay + " человек");

        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает "+ totalEmployees + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}