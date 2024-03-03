public class Main {
    public static void main(String[] args) {
        String[] names = {"Eren","İrem","Yiğit","Hasan","Hüseyin"};
        int [] minutes = {100,200,300,400,500};
        // a 200-299 b 300-399 c 400+ (hatırlamak için)
        Marathon m1 = new Marathon(names,minutes);
        m1.displayAllMessages();
    }
}