class ByProcess implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(3000);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ByProcess p1 = new ByProcess();
        Thread t1 = new Thread(p1);
        t1.start();
        ByProcess p2 = new ByProcess();
        Thread t2 = new Thread(p2);
        t2.start();
    }
}