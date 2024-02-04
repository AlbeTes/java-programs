import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

public class MyPicture extends JFrame {
    Scanner scan = new Scanner(System.in);
    public MyPicture(String s) {
        super(s);
        setLayout(null); // отключение менеджера расположения компонентов
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paintS(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 600, 600);

        g.setColor(Color.BLUE);
        int x1 = 0, y1 = 0, x2 = 600, y2 = 600;
        g.drawLine(x1, y1, x2, y2);

        int c = 50;
        int z = x2 * x2 + y2 * y2;
        System.out.println(z);

        int s = c * c + c * c;
        System.out.println(s);

        int i = 0;
        g.fillRect(x1, y1, c, c);

        while (s * ++i < z) {
            g.fillRect(x1 + (i * c), y1 + (i * c), c, c);
        }
    }

    public void paintD(Graphics g) {
        g.setColor(Color.YELLOW); //установить желтый цвет (объект Color)
        g.fillRect(0, 0, 600, 600); //залить окно установленным цветом
        g.setColor(Color.blue);//установить синий цвет (объект Color)
        int x1 = 0; //значение начальной точки по Х оси
        int y1 = 0; // значение начальной точки по Y оси
        int x2 = 600; //размер окна по Х
        int y2 = 600; //размер окна по Y
        g.drawLine(x1, y1, x2, y2); //прорисовка диагонали окна
        int c = 50; //длины стороны квадрата
        int z = x2 * x2 + y2 * y2; //расчет длины диагонали окна
        System.out.println(z); // вывод значения переменной z в консоль
        int s = c * c + c * c; //расчет длины диагонали квадрата 50x50
        System.out.println(s); //вывод значения переменной s в консоль
        int i = 0; //счетчик квадратов
        g.fillRect(x1, y1, c, c); //прорисовка первого квадратам в 0 точке окна
        while (true) {//пока сумма диагоналей прорисованных квадратов не
            //станет больше длины диагонали окна
            g.setColor(Color.blue);
            g.fillRect(x1 + (i * c), y1 + (i * c), c, c);//рисуем следующий квадрат
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.setColor(Color.YELLOW);
            g.fillRect(x1 + (i * c), y1 + (i * c), c, c);
            g.fillRect(x1, y1, c, c);
            if(i++ > 10)
                i = 0;
        }
        }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int i = scan.nextInt();
        if(i == 1)
            paintS(getGraphics());
        else if (i == 2)
            paintD(getGraphics());
    }

    public static void main(String[] args) {
        new MyPicture("Рисунок");
    }
}
