public class CoordinatesXY_1 {
    private final int x;
    private final int y;
    private final String vectorNameXY;
    private static final String TEXT = "Этот вектор для двумерной системы координат";

    //    - конструктор с параметрами в виде списка координат
    public CoordinatesXY_1(String vectorNameXY, int x, int y) {
        this.x = x;
        this.y = y;
        this.vectorNameXY = vectorNameXY;
        System.out.println("Вектор: " + vectorNameXY + " (" + x + "; " + y + ")");
    }

    // Метод, вычисляющий длину вектора.
    public void vectorXYLength() {
        System.out.printf("Длина вектора: " + this.vectorNameXY + " = %.3f %n", Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)));
    }

    // Метод, вычисляющий скалярное произведение
    public void vectorXYScal(int x1, int y1, int x2, int y2) {
        System.out.println("Скалярное произведение векторов: " + "a(" + x1 + "; " + y1 + ") и b(" + x2 + "; " + y2 + ") равно " + (x1 * x2 + y1 * y2));
    }

    // Метод, вычисляющий сумму
    public void vectorXYSum(int x1, int y1, int x2, int y2) {
        System.out.println("Сумма векторов: " + "a(" + x1 + "; " + y1 + ") и b(" + x2 + "; " + y2 + ") равна c(" + (x1 + x2) + "; " + (y1 + y2) + ")");
    }

    // метод разности векторов;
    public void vectorXYSubs(int x1, int y1, int x2, int y2) {
        System.out.println("Разность векторов: a(" + x1 + "; " + y1 + ") и b(" + x2 + "; " + y2 + ") равна d(" + (x1 - x2) + "; " + (y1 - y2) + ")");
        System.out.println();
    }

    public static void vectorXYmasive(int N) {
        int[] mas = new int[N];
        int data = 1;
        for (int x: mas) {
            x = (int) (Math.random() * 10) + 1;
            int y = (int) (Math.random() * 10) + 1;
            System.out.println("Вектор N: " + data + " имеет координаты (" + x + "; " + y + ")");
            data++;
        }
    }

}


