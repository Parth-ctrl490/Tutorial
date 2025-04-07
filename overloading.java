public class Overloading {
    public static int Method(int x,int y){
        return x+y;

    }
    public static double Method(double x,double y){
        return x+y;
    }
    public static void main(String[] args){
        int sum1=Method(4,5);
        double sum2=Method(2.3,6.5);
        System.out.println("sum of integers:"+sum1);
        System.out.println("sum of double"+sum2);
    }
}
