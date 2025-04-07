//enum is a special class that represenrts constant
enum level{
    MEDIUM,
    LOW,
    HIGH
}
class Main4{
    public static void main(String[] args){
        level obj=level.MEDIUM;
        switch (obj){
            case LOW:
                System.out.println("low");
                break;
            case HIGH:
                System.out.println("high");
                break;
            case MEDIUM:
                System.out.println("medium");
                break;

        }
    }

}
