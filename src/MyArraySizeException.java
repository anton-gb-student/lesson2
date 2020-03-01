public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super();
    }

    // По условиям задачи это исключение не должно давать подробную информацию
    @Override
    public String toString() {
        return "Неправильная размерность массива";
    }
}
