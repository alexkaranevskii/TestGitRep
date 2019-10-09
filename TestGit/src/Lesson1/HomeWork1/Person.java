package Lesson1.HomeWork1;

public class Person implements Participant {

    private final String name;
    private final int jumpHeight;
    private final int maxRunLenght;

    public Person(String name, int jumpHeight, int maxRunLenght){
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
        return "Person {" +
                "name='" + name + '\'' +
                ", jumpHeight" + jumpHeight +
                ", maxRunLenght=" + maxRunLenght +
                '}';
    }
}
