public class Outerclass {
    int x=19;

 class Innerclass{
    int y=56;
}}
 class Main2{
    public static void main(String[] args)
    {
        Outerclass obj=new Outerclass();
        Outerclass.Innerclass obj1=obj.new Innerclass();
        System.out.println(obj1.y+obj.x);
    }

 }
