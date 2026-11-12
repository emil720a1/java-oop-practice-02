# Практична робота №2 — ООП у Java

Варіант 4: клас-сутність `Sensor`.

Проєкт використовує Java 21 і Maven. Сторонні бібліотеки не використовуються.

## Структура

```text
src/main/java/
├── app/Main.java
└── model/
    ├── ModelTester.java
    └── Sensor.java

examples/compile-errors/
├── FinalVariableError.java
├── app/MainForbiddenAccess.java
└── model/ModelTesterPrivateAccess.java
```

## Реалізовані вимоги

- `Sensor` розміщено в пакеті `model`.
- `Main` розміщено в пакеті `app`.
- Продемонстровано модифікатори `private`, package-private, `protected` і `public`.
- Додано конструктори без параметрів і з параметрами.
- Конструктори викликають один одного через `this(...)`.
- `this` використовується для розрізнення полів і параметрів.
- Додано спільне `static`-поле `sensorCount` і статичний метод.
- Додано `final`-поле `sensorNumber`.
- Додано приклад `final`-змінної методу.

## Запуск

```bash
mvn clean package
java -cp target/classes app.Main
```

Очікується успішна збірка Maven і виведення інформації про два датчики.

## Модифікатори доступу

| Поле | Модифікатор | Доступ із `model` | Доступ із `app` |
|---|---|---:|---:|
| `identifier` | `private` | ні | ні |
| `value` | package-private | так | ні |
| `unit` | `protected` | так | ні |
| `label` | `public` | так | так |

Навмисні помилки компіляції винесено в `examples/compile-errors`, щоб вони не ламали основну Maven-збірку.

Перевірити приклад можна окремо:

```bash
javac -d /tmp/sensor-access-errors \
  src/main/java/model/Sensor.java \
  examples/compile-errors/app/MainForbiddenAccess.java
```
