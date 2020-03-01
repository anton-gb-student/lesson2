public class MyArrayDataException extends Exception {
    int i=-1,j=-1; // Поля для выдачи координат дефектной ячейки

    public MyArrayDataException(Throwable cause) { // Конструктор, указывает на исходное исключение
        super(cause);

    }

    // Сеттеры координат дефектной ячейки
    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    // Программируем, что будет сообщать исключение, по условию задачи:
    // с детализацией, в какой именно ячейке лежат неверные данные
    @Override
    public String toString() {
        return "Неправильный формат данных в ячейке [" + i + "][" + j + "]";
    }
}
