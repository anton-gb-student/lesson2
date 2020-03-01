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

            for (int i =0; i <4; i++) {
                for (int j =0; j <4; j++) {
                    // Перебираем циклом все ячейки, для каждой запускаем блок try-catch
                    try {
                    sum += Integer.parseInt(arr[i][j]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new MyArraySizeException(e);
                        // Если ячейка за пределами индекса, кидает исключение
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

