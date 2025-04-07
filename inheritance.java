public class Inheritance {
    public String name="Mustang";
    public void honk(){
        System.out.println("tut tut");

    }
}
 class model extends Inheritance{
    public String Model="ford";
    public void objetc(){
        model obj=new model();
      obj.honk();
        System.out.println("NAME IS "+obj.name+"model is"+obj.Model+"sound is ");
    }
}
