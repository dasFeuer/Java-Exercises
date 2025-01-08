package LinearSearchRevision;

public class SwapTheLetter {
    public static void main(String[] args) {
        char[] letters = {'a', 'b'};
        swapTheLetter(letters);
        System.out.println("Swapped letters: " + letters[0] + " and " + letters[1]);
    }
    static public void swapTheLetter(char[] letter){
        letter[0] = (char) (letter[0] + letter[1]);
        letter[1] = (char) (letter[0] - letter[1]);
        letter[0] = (char) (letter[0] - letter[1]);

    }
}
