class Details extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String args[]) {

        Details d1 = new Details();
        d1.setName("My thread");
        d1.setDaemon(true);
        d1.setPriority(Thread.MAX_PRIORITY);
        d1.start();

        Details d2 = new Details();
        d2.setPriority(Thread.MIN_PRIORITY);
        d2.start();
    }

}