public class Zad7 {
    public static void main(String[] args){
        System.out.println();
        String s = "The quick brown fox";

        char[] ch = s.toCharArray();
        String text = "";
        for(int i=ch.length-1; i>=0; i--) {
            text = text +ch[i];

        }
        System.out.println("Original string: " + s);
        System.out.println("Reversed string: " + text);
    }
}