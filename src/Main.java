public class Main {
    public static void main(String[] args){
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собака " + dog);
        System.out.println("Кошка " + cat);
        System.out.println("Бумага " + paper);

        var box = 5;
        System.out.println(box);

        box = box + 2;
        System.out.println(box);

        box = box - 3;
        System.out.println(box);

        box = box * 3;
        System.out.println(box);

        box = box / 4;
        System.out.println(box);

        box = box + 4;
        System.out.println(box);

        dog = dog - 3;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Теперь " + dog + " собак!");
        System.out.println("Теперь " + cat + " кошек!");
        System.out.println("Теперь " + paper + " бумагов!");

        var friend = 19;
        System.out.println(friend + " друзей");

        friend = friend + 2;
        System.out.println("Теперь на " + friend + " друзей");

        friend = friend / 7;
        System.out.println("Потерял много друзей, теперь на " + friend + " друзья!");

        var frog = 3.5;
        System.out.println(frog + " с половиной лягушек");

        frog = frog * 10 / 3.5 + 4;
        System.out.println(frog + " лягушек");

        frog = frog / 3.5;
        System.out.println("Потерял много лягушек, теперь на " + frog + " лягушки");

        frog = frog + 4;
        System.out.println("Родились " + frog + " лягушонок");

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " +  capacityLeft + " кг!");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight + " кг!");

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight + " кг!");

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продукт в одной машине теперь " + productsInOneCar + " кг!");

        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var boxerTotalWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общий вес " + boxerTotalWeight + " кг!");

        var differenceWeight = boxerOneWeight - boxerTwoWeight;
        System.out.println("Разница веса между первой и второй боксера " + differenceWeight + " кг!");

        var overload2 = (boxerTwoWeight) % boxerOneWeight;
        System.out.println("Второй боксер отличается от первого боксера " + overload2 + " кг!");

        var employee = 640;
        employee = employee / 8;
        System.out.println("Всего работников в компании " + employee + " человек");

        employee = employee + 94;
        System.out.println("Если в компании работает " + employee + " человек");

        employee = employee * 8;
        System.out.println("то всего " + employee + " часов работы может быть поделено между сотрудниками");
    }
}