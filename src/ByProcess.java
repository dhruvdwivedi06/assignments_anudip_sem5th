class ByProcess {
    public void run(){
        try{
            for(int i=1; i<=10; i++){
                Thread.sleep(3000);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
         ByProcess p1 = new ByProcess();
         p1.run();
         ByProcess p2 = new ByProcess();
         p2.run();
    }
}