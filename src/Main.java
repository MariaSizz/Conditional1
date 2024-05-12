public class Main {
    public static void main(String[] args) {
        byte age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");

        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        float temp = -1;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градус(a/ов), нужно надеть шапку.");

        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }

        float speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");

        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
        //Option1
        byte agePlace = 100;
        if (agePlace >= 2 && agePlace <= 6) {
            System.out.println("Если возраст человека равен " + agePlace + ", то ему нужно ходить в детский сад.");
        }
        if (agePlace >= 7 && agePlace <= 17) {
            System.out.println("Если возраст человека равен " + agePlace + ", то ему нужно ходить в школу.");
        }
        if (agePlace >= 18 && agePlace <= 24) {
            System.out.println("Если возраст человека равен " + agePlace + ", то ему можно ходить в университет.");
        }
        if (agePlace > 24 && agePlace < 65) {
            System.out.println("Если возраст человека равен " + agePlace + ", то ему нужно ходить на работу.");
        }
        if (agePlace < 2) {
            System.out.println("Если возраст человека равен " + agePlace + ", он еще маленький.");
        } else {
            System.out.println("Если возраст человека равен " + agePlace + ", ему нужно отдыхать.");
        }
        //Option2
        byte agePlace1 = 30;
        if (agePlace1 >= 2 && agePlace1 <= 6) {
            System.out.println("Если возраст человека равен " + agePlace1 + ", то ему нужно ходить в детский сад.");
        } else if (agePlace1 > 2 && agePlace1 <= 17) {
            System.out.println("Если возраст человека равен " + agePlace1 + ", то ему нужно ходить в школу.");
        } else if (agePlace1 > 2 && agePlace1 <= 24) {
            System.out.println("Если возраст человека равен " + agePlace1 + ", то ему можно ходить в университет.");
        } else if (agePlace1 > 2 && agePlace1 <= 65) {
            System.out.println("Если возраст человека равен " + agePlace1 + ", то ему нужно ходить на работу.");
        } else if (agePlace1 < 2) {
            System.out.println("Если возраст человека равен " + agePlace1 + ", он еще маленький.");
        } else {
            System.out.println("Если возраст человека равен " + agePlace1 + ", ему нужно отдыхать.");
        }

        byte ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст человека равен " + ageChild + ", то он может кататься без сопровождения взрослого.");
        }

        byte numOfPers = 103;
        if (numOfPers <= 60) {
            System.out.println("Если количество человек в вагоне " + numOfPers + ", то есть сидячие и стоячие места.");
        } else if (numOfPers <= 102) {
            System.out.println("Если количество человек в вагоне " + numOfPers + ", то есть только стоячие места.");
        } else {
            System.out.println("Если количество человек в вагоне " + numOfPers + ", то мест нет.");
        }

        int number = 3;
        boolean numberFromOneToThree = number == 3;
        if (numberFromOneToThree) {
            System.out.println("Если число равно " + number + ", то оно большее.");
        } else {
            System.out.println("Если число равно " + number + ", то оно меньшее.");
        }
    }
}
