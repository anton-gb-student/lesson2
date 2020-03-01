public class ExceptionTest {
    // Поля класса: массив для суммирования и сумма
    private String[][] arr;
    private int sum;

    // Геттер суммы
    public int getSum() {
        return sum;
    }

    // Метод суммирования, кидает исключения в вызвавший метод
    public int sum(String[][]arr) throws MyArraySizeException, MyArrayDataException {
        this.arr = arr;

        if (arr.length != 4 || arr[0].length != 4 || arr[1].length != 4 || arr[2].length != 4 || arr[3].length != 4) {
            throw new MyArraySizeException();
        } // Исправляю ошибку, забыл, что массив может быть не только меньше, но и больше по размеру
        else {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    // Перебираем циклом все ячейки, для каждой запускаем блок try-catch
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        // Если не можем преобразовать в int, создаем кастомное исключение
                        MyArrayDataException err = new MyArrayDataException(e);
                        err.setI(i); // Для определения дефектной ячейки передаем ее координаты
                        err.setJ(j);
                        throw err;   // Кидаем полученный объект выше

                    }
                }
            }

            return sum;
        }
    }
}

