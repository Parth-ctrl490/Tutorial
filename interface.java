//interface is another way to do abstraction
interface Interface {
    public void animalsound();
    public void sleep();

}
class Pig implements Interface{
    public void animalsound(){
        System.out.println("we we");

    }
    public void sleep(){
        System.out.println("zzz");
    }
}
class Main3{
    public static void main(String[] args){
        Pig obj=new Pig();
        obj.animalsound();
        obj.sleep();

    }
}
