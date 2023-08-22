import java.util.Scanner;
public class Main {
    static String s1="SafeZone";
    static String d1="DangerousZone";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfValue;
        int value;
        int max=0;
        int min=0;
        System.out.println("Enter the num of values you want");
        numOfValue=in.nextInt();
        for (int i=0;i<numOfValue;i++){
            System.out.println("Enter the value num"+" "+(i+1)+":");
            value=in.nextInt();
            if (i==0){
                max=value;
                min=value;
            }
            if (value>max){
                max=value;
            }else if(value<min){
                min=value;
            }

        }
        double differance = max-min;
        System.out.println("The maximum num is :"+" "+max);
        System.out.println("The minimum num is :"+" "+min);
        System.out.println("The Differance is :"+" "+differance);
        System.out.println(zone(differance,max));


    }
    public static String zone(double differ,int ma){
        if(differ>=(ma/2)){
            return s1;
        } else if (differ<(ma/2)) {
            return d1;

        }
        return null;

    }
}