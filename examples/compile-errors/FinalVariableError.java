/** Навмисно некоректний приклад для демонстрації final-змінної. */
public class FinalVariableError {
    public static void main(String[] args) {
        final String text = "Перше значення";
        text = "Друге значення";
        System.out.println(text);
    }
}
