public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, world!";
        char[] characters = original.toCharArray();
        for (int i = 0, j = characters.length - 1; i < j; i++, j--) {
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }
        String reversed = new String(characters);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
