import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap chuoi vao day: ");
        String inputString = sc.nextLine();
        int[] frequentChar = new int[255];
        System.out.println("chu cai xuat hien nhieu nhat la: ");
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);
            frequentChar[ascii] +=1;

            int max = 0;
            char character = (char) 255;
            for (int j = 0; j < 255; j++) {
                if (frequentChar[j]>max){
                    max = frequentChar[j];
                    character = (char) j;
                }
            }
            System.out.println("Chu cai xuat hien nhieu nhat la: "+ character + " voi tan suat "+ max +" lan");

        }


    }
}
