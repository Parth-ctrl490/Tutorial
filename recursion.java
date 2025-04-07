/*//to print sum of 1 to 10 numbers using recursion
public class recursion {
    public static void main(String[] args){
        int result=add(10);
        System.out.println(result);

    }
    public static int add(int k){
        if(k>0) {
            return k + add(k - 1);
        }
        else{
            return 0;
        }
    }
}//55*/

//to print sum of 5 to 10 numbers using recursion
public class recursion {
    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println(result);
    }
    public static int add(int start,int end){
        if(end>start){
            return end+add(start,end-1);

        }
        else{
            return 0;
        }

    }
    }

