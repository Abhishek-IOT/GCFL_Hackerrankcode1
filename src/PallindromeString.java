public class PallindromeString {
    private String string = "";

    public PallindromeString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Boolean Pallindrome(String string, int l) {
        String reverse = "";
        for (int i = l; i > 0; i--) {
            char ch = string.charAt(i);
            reverse = reverse + ch;
        }
        if (reverse.equals(string)) {
            return true;
        } else {
            return false;
        }
    }
}
