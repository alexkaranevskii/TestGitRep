package Lesson1.HomeWork1;

public class Track implements Obstacle {

    private  final int lenght;

    public Track(int lenght){
        this.lenght = lenght;
    }

    @Override
    public boolean passObstacleBy(Participant participant){
        if (participant.run() > lenght){
            System.out.println("Участник " + participant + " Успешно пробежал дистанцию");
            return true;
        }
        else {
            System.out.println("Участник " + participant + " не смог пробежать дистанцию" + lenght);
            return true;
        }
    }
}
