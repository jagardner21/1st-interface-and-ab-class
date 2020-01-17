public abstract class Car implements IVehicle {
    private String color;
    private int speed = 0;

    public Car() {
        this.color = color;
        this.speed = speed;
    }

    @Override
    public void accelerate(int additionalMPH) {
        this.speed = this.speed + additionalMPH;
    }

    @Override
    public void decelerate(int lessMPH) {
        this.speed = this.speed - lessMPH;
    }
    public abstract void honk();

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getSpeed(){
        return this.speed + " MPH";
    }
}
