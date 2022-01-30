import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz : ");
        int derece=scanner.nextInt();

        if(derece<5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(derece>=5 && derece<=15)
            System.out.println("Sinemaya gidebilirsiniz");
        else if(derece>15 && derece<=25)
            System.out.println("Pikniğe gidebilirsiniz");
        else //derece>25
            System.out.println("Yüzmeye gidebilirsiniz");
    }
}
