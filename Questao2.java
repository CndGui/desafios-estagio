public class Questao2 {
    public static void main(String[] args) {
        String string = "TamAnduá";
        int a = 0;

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'A') {
                a++;
            }
        }

        System.out.println("Há "+ a +" letras 'a' na palavra "+string);
    }
}
