package model;

/** Перевірка доступу до полів із того самого пакета model. */
public class ModelTester {
    private ModelTester() {
    }

    public static void checkFieldAccess(Sensor sensor) {
        // sensor.identifier; // недоступне: private, навіть у цьому пакеті
        System.out.println("model: identifier через getter = " + sensor.getIdentifier());
        System.out.println("model: package-private value = " + sensor.value);
        System.out.println("model: protected unit = " + sensor.unit);
        System.out.println("model: public label = " + sensor.label);
    }
}
