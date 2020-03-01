public class Main {
    public static void main(String[] args) {

        String[][] arr = {
                {"10","10","10","10"},
                {"10","10","10","10"},
                {"10","10.0","10","10"},
                {"10","10","10","10"}
        };
        ExceptionTest excTest = new ExceptionTest();
        try {
            excTest.sum(arr);
            System.out.println(excTest.getSum());

        } catch (MyArrayDataException e) {
            System.out.println(e);
        } catch (MyArraySizeException e) {
            System.out.println(e);
        }
    }
}
