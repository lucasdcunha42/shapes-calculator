import java.util.Scanner;

abstract class Shape {
        int width;
        abstract void area();
    }
    class Square extends Shape {
        public Square(int x) {
        super.width = x;
        }
        @Override
        void area() {
            System.out.println(width * width);
        }
    }

    class Circle  extends Shape {
        public Circle(int y) {
            super.width = y;
        }

        @Override
        void area() {
            System.out.println(3.14 * width * width);

        }
    }
    public class Program {
        public static void main(String[ ] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            Square a = new Square(x);
            Circle b = new Circle(y);
            a.area();
            b.area();
        }
    }
