package Lesson1.HomeWork1;

public class Robot implements Participant {
    private final String model;
    private final int jumpHeight;
    private final int maxRunLenght;

    public Robot(String model, int jumpHeight, int maxRunLenght){
        this.model = model;
        this.jumpHeight = jumpHeight;
        this.maxRunLenght = maxRunLenght;
    }

    @Override
    public int run(){
        return maxRunLenght;
    }

    @Override
    public int jump(){
        return jumpHeight;
    }

    @Override
    public String toString(){
        return "Robot {" +
                "name='" + model + '\'' +
                ", jumpHeight" + jumpHeight +
                ", maxRunLenght=" + maxRunLenght +
                '}';
    }
}
