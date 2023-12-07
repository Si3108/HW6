public class hw16 {
    public static void main(String[] args) {
        Car16 car1 = new Car16("1號車");
        car1.start();
        Car16 car2 = new Car16("2號車");
        car2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行main()的處裡工作");
        }
    }
}

class Car16 extends Thread {
    private String name;

    public Car16(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行" + name + "的處裡工作");
        }
    }

}