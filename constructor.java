//public class Constructor {
//    int x;
//    public Constructor()//this is a constructor
//    {
//        x=5;
//    }
//    public static void main(String[] args){
//        Constructor obj=new Constructor();// calling constructor
//        int result=obj.x;
//        System.out.println(result);
//
//
//    }
//}

public class Constructor {
    int carno;
    String carname;
    public Constructor(int number,String name)//this is a constructor
    {
        carno=number;
        carname=name;
    }
    public static void main(String[] args){
        Constructor obj=new Constructor(2341,"alto");// calling constructor
        int result1=obj.carno;
        String result2=obj.carname;
        System.out.println(result1);
        System.out.println(result2);
    }
}
