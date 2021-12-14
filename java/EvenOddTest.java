import java.util.Scanner;



public class EvenOddTest {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        EvenOdd obj = new EvenOdd();
        obj.setNum(n);
        System.out.print(obj.checkEvenOdd());
    
}



}
class EvenOdd{
    private int num;
    private boolean evenOdd;
    public boolean isEvenOdd() {
        return evenOdd;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public boolean checkEvenOdd(){
    int k = getNum();
    if(k%2==0){
        return true;
    }
    return false;
    }

}
