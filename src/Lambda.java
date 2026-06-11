//interface i1
//{
//    public void show (int a, int b);
//}
//    class Lambda {
//        static void main() {
//            i1 a1 = (a, b) -> System.out.println(a + b);
//
//            a1.show(34, 55);
//        }
//    }
//
interface GreatestNumber
{
void greater(int a, int b);
}
class lambda
{
    public static void main(String args[])
    {
        GreatestNumber g = (a, b) -> System.out.println((a > b) ? a + " is greater." : (b > a) ? b + " is greater." : " both are Equal.");
        g.greater(99, 22);
    }
}