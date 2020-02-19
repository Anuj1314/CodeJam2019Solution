import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The amount will be divided into two parts, which will not consist of digit '4' ");
        System.out.print("Enter the Amount: ");
        int input = scan.nextInt();
        StringBuffer sb = new StringBuffer(input+"");
        StringBuffer sa = new StringBuffer(input+"");
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='4'){
              sb.setCharAt(i,'3');
              sa.setCharAt(i,'1');
            }
            else{
               sa.setCharAt(i,'0');
            }
          }
        System.out.println("First part of amount will be: "+sb);
        System.out.println("Second Part of amount will be: "+sa);
        int answer = Integer.parseInt(sb.toString()) + Integer.parseInt(sa.toString());
        if(answer == input){
            System.out.println("Correct distribution has done as both part of amount doesn't contain character '4' ");
        }
        System.out.println();
    }
}
