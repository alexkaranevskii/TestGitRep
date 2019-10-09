package Lesson1.HomeWork1;

public class Wall {
    private  final int height;

    public Wall(int height){
        this.height = height;
    }


    //
    @Override
    public boolean passObstacleBy(Participant participant){
        if (participant.run() > height){
            System.out.println("Участник " + participant + " Успешно перепрыгнул стену");
            return true;
        }
        else {
            System.out.println("Участник " + participant + " не смог перепрыгнуть стену" + height);
            return true;
        }
    }
}
