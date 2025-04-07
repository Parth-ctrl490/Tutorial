//program to find avg
public class array {
    public static void main(String[] args) {
    int[] ages={20,21,22,23};
    int sum=0;
    int len=ages.length;
    for(int i:ages){
        sum=sum+i;
    }
    int avg=sum/len;
    System.out.println("average of is:"+avg);
    }
}
