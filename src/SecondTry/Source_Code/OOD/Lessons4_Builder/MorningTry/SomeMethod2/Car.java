package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod2;

public class Car extends Choice {
    @Override
    public void dyeCar(String color) {
        this.getQuery().setColorCar(color);
    }

    @Override
    public void nameCar(String name) {
        this.getQuery().setName(name);
    }

    @Override
    public void typeCar(String type) {
        this.getQuery().setType(type);
    }

    @Override
    public void maxSpeedCar(int maxSpeed) {
        this.getQuery().SetMaxSpeed(maxSpeed);
    }

    @Override
    public String getInfo() {
        return this.getQuery().getInfo();
    }
}
