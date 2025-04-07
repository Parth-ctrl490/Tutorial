//final
//public class keywords {
//final int x=10;
//final double y=9.8;
//public static void main(String[] args){
//    keywords obj=new keywords();
//    obj.x=11;
//    obj.y=11.3;
//}}//error will occur as a value cannot be modified in final word



//static
//public class keywords {
//    static void staticMethod(){
//        System.out.println("static is called without using object");
//    }
//    public void publicMethod(){
//        System.out.println("public is called using object");
//    }
//    public static void main(String[] args){
//        staticMethod();
//        keywords obj=new keywords();
//        obj.publicMethod();
//    }
//}

//abstract class
 abstract class keywords {
    String fname = "Parth Shukla:";
    int rollnumber = 37;

    public abstract void study();
}
 class Student extends keywords{
    public void study(){
        System.out.println("name is "+fname+"  "+"rollnumber  "+rollnumber);
    }
    public static void main(String[] args){
        Student obj=new Student();
        obj.study();
    }
}
