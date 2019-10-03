package UROK1;

public class MainClass {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name ="Шарик";
        labrador.beast ="Лабрадор";
        labrador.color ="бежевый";
        labrador.age = 7;
        System.out.println(labrador.beast+ " " + labrador.name + " цвет " + labrador.color + " " + labrador.age +" лет ");

        Dog bolonka = new Dog();
        bolonka.name ="Тиша";
        bolonka.beast ="Болонка";
        bolonka.color ="белый";
        bolonka.age = 5;
        System.out.println(bolonka.beast+ " " + bolonka.name + " цвет " + bolonka.color + " " + bolonka.age +" лет ");
    }
}
