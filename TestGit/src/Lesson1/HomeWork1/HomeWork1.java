package Lesson1.HomeWork1;

import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Начальный этап");
       Competition competition = creatAndPrepeareCompetition();

        System.out.println("Начинаем соревнования");


        System.out.println("Соревнование окончено");
    }

    private static Competition creatAndPrepeareCompetition(){
        Participant person = new Person("Иван Васильевич", 50, 500);
        Participant cat = new Cat("Барсик", 200, 1500);
        Participant robot = new Robot("Вертер", 150, 5000);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(200));
        Track track = new Track(random.nextInt(150));

        Competition competition = new Competition("Infinity War");
        competition.setParticipants(person, cat, robot);
        competition.setObstacles(wall, track);
        return competition;

    }
}


