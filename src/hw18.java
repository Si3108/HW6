public class hw18 {
    public static void main(String[] args) {
        Car18 car1 = new Car18("1號車");
        car1.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("正在進行main()的處裡工作");
            } catch (Exception e) {
            }
        }
    }
}

class Car18 extends Thread {
    private String name;

    public Car18(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("正在進行" + name + "的處裡工作");

        }
    }

}