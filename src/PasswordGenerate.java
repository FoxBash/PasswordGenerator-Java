import java.util.Random;

public class PasswordGenerate {
    private final String capitalAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWQXYZ";
    private final String smallAlphabet = "abcefghijklmnopqrstuvwxyz";
    private final String specialAlphabet = "`~!@#$%^&*()_-=+[]{};:'\"|\\,<>./?";
    private final String numbers = "1234567890";

    public String PasswordGenerate(int length, boolean includeAlphabet, boolean includeSmall, boolean includeSpecial, boolean includeNumbers) {
        Random random = new Random();
        StringBuilder passwordBuilder = new StringBuilder();



        String characterSet = "";
        if (includeAlphabet){
            characterSet += capitalAlphabet;

        }
        if (includeSmall){
            characterSet += smallAlphabet;
        }
        if (includeSpecial){
            characterSet += specialAlphabet;
        }
        if (includeNumbers){
            characterSet += numbers;
        }
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            char randomChar = characterSet.charAt(index);
            passwordBuilder.append(randomChar);
        }
        return passwordBuilder.toString();
    }

    public String PasswordGenerate() {
        int length = 12;
        Random random = new Random();
        StringBuilder passwordBuilder = new StringBuilder();
        String characterSet = capitalAlphabet + smallAlphabet + specialAlphabet + numbers;
        for (int i = 0; i < length ; i++) {
            int index = random.nextInt(characterSet.length());
            char randomChar = characterSet.charAt(index);
            passwordBuilder.append(randomChar);
        }
        return passwordBuilder.toString();

    }
}
