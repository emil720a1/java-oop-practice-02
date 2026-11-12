# Навмисні помилки компіляції

Файли в цій папці не входять до `src/main/java`, тому вони не ламають основну Maven-збірку.
Їх можна перевірити окремо командою `javac`.

Наприклад:

```text
javac -d /tmp/sensor-access-errors \
  src/main/java/model/Sensor.java \
  examples/compile-errors/app/MainForbiddenAccess.java
```

Очікувано `javac` повідомить про недоступність `identifier`, `value` і `unit`.
Аналогічно `ModelTesterPrivateAccess.java` покаже помилку для `private`-поля,
а `FinalVariableError.java` — помилку повторного присвоєння `final`-змінній.
