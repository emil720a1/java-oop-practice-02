package model;

/**
 * Сутність датчика.
 *
 * Поля навмисно мають різні рівні доступу, щоб продемонструвати правила
 * видимості в Java.
 */
public class Sensor {
    private int identifier;
    String value;
    protected String unit;
    public String label;

    private final int sensorNumber;
    private static int sensorCount;

    /** Створює датчик із початковими значеннями за замовчуванням. */
    public Sensor() {
        this(0, "0", "unknown", "Unnamed sensor");
    }

    /** Створює датчик із трьома основними параметрами. */
    public Sensor(int identifier, String value, String unit) {
        this(identifier, value, unit, "Sensor");
    }

    /** Основний конструктор, який ініціалізує всі поля об'єкта. */
    public Sensor(int identifier, String value, String unit, String label) {
        this.identifier = identifier;
        this.value = value;
        this.unit = unit;
        this.label = label;
        this.sensorNumber = ++sensorCount;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getSensorNumber() {
        return sensorNumber;
    }

    public static int getSensorCount() {
        return sensorCount;
    }

    public static void printSensorCount() {
        System.out.println("Кількість створених Sensor: " + sensorCount);
    }

    /**
     * Демонструє локальну final-змінну.
     * Повторне присвоєння наведено в коментарі, бо воно навмисно ламає збірку.
     */
    public void demonstrateFinalVariable() {
        final String message = "Це значення final-змінної";
        System.out.println(message);
        // message = "Нове значення"; // помилка компіляції: final не можна змінити
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "identifier=" + identifier +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                ", label='" + label + '\'' +
                ", sensorNumber=" + sensorNumber +
                '}';
    }
}
