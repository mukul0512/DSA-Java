public class ReverseAStringUsingStringBuffer {
    public static void reverseAStringUsingStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {
        String str = "INTERVIEW";
        reverseAStringUsingStringBuffer(str);
    }
}
