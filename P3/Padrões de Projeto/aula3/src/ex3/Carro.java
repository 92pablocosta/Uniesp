package ex3;

public final class Carro extends Motor {
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void estadoMotor() {
        System.out.println("Motor ligando");
        motor.estadoMotor();
    }
}


