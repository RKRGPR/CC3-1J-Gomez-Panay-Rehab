package act1.mean.mode;
import java.util.Scanner;
public class Act1MeanMode {
static Scanner sc = new Scanner(System.in);
    static int ui(){
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        return size;
    }
    static int getData(int size){
        System.out.print("Index [" +size+ "]: ");
        int data = sc.nextInt();
        return data;
    }
    static void pro(){
        int size = ui();
        System.out.println("Enter elements");
        int num[] = new int [size];
        for (int i = 0; i < size; i++) {
            num[i] = getData(i);
        }
        mean(num, size);
        mode(num, size);
    }
    static void mean(int num[], int size){
        int sum = 0;
        for (int i = 0; i < size; i++) {
             sum += num[i];
        }
        double fmean = (double) sum/size;
        System.out.println("The mean is " + fmean + ".");
    }
    static void mode(int num[], int size){
        int maxNumber = -1;
        int maxAppearances = -1;
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if(num[i] == num [j]){
                    count++;
                }
            }
                if (count > maxAppearances) {
                    maxNumber = num[i];
                    maxAppearances = count;
                }
            }
            System.out.println("The mode is " + maxNumber + ".");
    }
    public static void main(String[] args) {
        pro();
    }
    
}
