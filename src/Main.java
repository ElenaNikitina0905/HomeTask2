public class Main {
    public static void main(String[] args)
    {
        //1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        //5
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        //6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);

        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differenceWeight);

        //7
        var diffWeight1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println(diffWeight1);

        var diffWeight2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println(diffWeight2);

        //8.1
        var totalHours = 640;
        var workHours = 8;
        var stuff = totalHours / workHours;

        System.out.println("Всего работников в компании " + stuff + " человек");

        //8.2
        stuff = stuff + 94;
        var newTotalHours = stuff * 8;

        System.out.println("Если в компании работает " + stuff + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");

    }
}