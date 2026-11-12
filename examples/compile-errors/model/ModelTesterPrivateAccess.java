package model;

/** Навмисно некоректний приклад: private не доступний навіть у тому самому пакеті. */
public class ModelTesterPrivateAccess {
    public void compileError() {
        Sensor sensor = new Sensor();
        int identifier = sensor.identifier;
        System.out.println(identifier);
    }
}
