package app;

import model.ModelTester;
import model.Sensor;

/** Точка входу програми та перевірка доступу з іншого пакета. */
public class Main {
    public static void main(String[] args) {
        Sensor firstSensor = new Sensor(1, "22.4", "°C", "Living room");
        Sensor secondSensor = new Sensor();

        System.out.println("Перший датчик: " + firstSensor);
        System.out.println("Другий датчик: " + secondSensor);

        // У пакеті app прямий доступ до цих полів не компілюється:
        // firstSensor.identifier; // private
        // firstSensor.value;      // package-private
        // firstSensor.unit;       // protected: app не є model і Main не є підкласом
        System.out.println("app: public label = " + firstSensor.label);

        firstSensor.setValue("23.1");
        System.out.println("Власне value першого датчика = " + firstSensor.getValue());
        System.out.println("Власне value другого датчика = " + secondSensor.getValue());

        System.out.println("Статичний лічильник через клас = " + Sensor.getSensorCount());
        Sensor.printSensorCount();

        final String runDescription = "final-змінна методу main";
        System.out.println(runDescription);
        // runDescription = "інше"; // помилка компіляції

        firstSensor.demonstrateFinalVariable();
        ModelTester.checkFieldAccess(firstSensor);
    }
}
