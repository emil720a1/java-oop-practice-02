package app;

import model.Sensor;

/** Навмисно некоректний приклад: перевірка доступу з іншого пакета. */
public class MainForbiddenAccess {
    public void compileError() {
        Sensor sensor = new Sensor();
        int identifier = sensor.identifier;
        String value = sensor.value;
        String unit = sensor.unit;
        System.out.println(identifier + value + unit + sensor.label);
    }
}
