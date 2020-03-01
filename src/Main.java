public class Main {
    public static void main(String[] args) {

        String[][][] arr = {
                {
                        {"10", "10", "10", "10"},
                        {"10", "10", "10", "10"},
                        {"10", "10", "10", "10"},
                        {"10", "10", "10", "10"}
                },
                {
                        {"10", "10", "10", "10"},
                        {"10", "10", "10", "10"},
                        {"10", "10", "10"},
                        {"10", "10", "10", "10"}
                },
                {
                        {"10", "10", "10", "10"},
                        {"10", "10", "10", "10"},
                        {"10", "10.0", "10", "10"},
                        {"10", "10", "10", "10"}
                }
        };


        ExceptionTest excTest = new ExceptionTest();
        for (int i = 0; i < 3; i++) {
            try {
                excTest.sum(arr[i]);
                System.out.println(excTest.getSum());

            } catch (MyArrayDataException v) {
                System.out.println(v);
            } catch (MyArraySizeException u) {
                System.out.println(u);
            }

        }
    }
}
