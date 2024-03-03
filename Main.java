public class Main {
    public static void main(String[] args) {
        String[] names = {"Ahmet","Mehmet","Hasan","Hüseyin","Muhammet","Mustafa"};
        int [] minutes = {215,424,555,314,299,90};
        // a 200-299 b 300-399 c 400+ (hatırlamak için)
        Marathon m1 = new Marathon(names,minutes);
        m1.displayAllMessages();
    }
}