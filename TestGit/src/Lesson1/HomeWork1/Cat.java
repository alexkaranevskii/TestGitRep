package Lesson1.HomeWork1;

public class Cat implements Participant {
    private final String name;
    private final int jumpHeight;
    private final int maxRunLenght;

    public Cat(String name, int jumpHeight, int maxRunLenght){
        this.name = name;
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
        return "Cat {" +
                "name='" + name + '\'' +
                ", jumpHeight" + jumpHeight +
                ", maxRunLenght=" + maxRunLenght +
                '}';
    }
}
