package UROK1;

public class MainClass {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name ="Шарик";
        labrador.beast ="Лабрадор";
        labrador.color ="бежевый";
        labrador.age = 7;
        System.out.println(labrador.beast+ " " + labrador.name + " цвет " + labrador.color + " " + labrador.age +" лет ");
    }
}
