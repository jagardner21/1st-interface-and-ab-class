public class Main {
    public static void main(String[] args) {
        SportsCar fastCar = new SportsCar();
        fastCar.setColor("blue");
        String carColor = fastCar.getColor();
        System.out.println(carColor);
        fastCar.honk();
        fastCar.specialMove();
        System.out.println(fastCar.getSpeed());
        fastCar.accelerate(100);
        System.out.println(fastCar.getSpeed());
        fastCar.decelerate(25);
        System.out.println(fastCar.getSpeed());
    }
}
