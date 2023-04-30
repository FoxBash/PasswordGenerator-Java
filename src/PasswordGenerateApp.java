import java.util.Scanner;

public class PasswordGenerateApp {
    public static void main(String[] args) {
        PasswordGenerate passwordGenerate = new PasswordGenerate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to automatically generate password  (select 1 to accept or 2 to decline");
        if (sc.nextInt() == 1){
            System.out.println(passwordGenerate.PasswordGenerate());
        }else {
            int length;
            boolean includeCapital = false;
            boolean includeSmall = false;
            boolean includeNumbers = false;
            boolean includeSpecial = false;
            System.out.println("Enter the length of password you want to generate ");
            length = sc.nextInt();
            System.out.println("If you want to include capital alphabet press 1");
            if (sc.nextInt() == 1){
                includeCapital = true;
            }
            System.out.println("If you want to include small alphabet press 1");
            if (sc.nextInt() == 1){
                includeSmall = true;
            }
            System.out.println("If you want to include special alphabet press 1");
            if (sc.nextInt()==1){
                includeSpecial = true;
            }
            System.out.println("If you want to include numbers press 1");
            if (sc.nextInt() == 1){
                includeNumbers = true;
            }
            System.out.println(passwordGenerate.PasswordGenerate(length,includeCapital,includeSmall,includeSpecial,includeNumbers));
        }

    }
}
