public class Marathon {
    public String[] names;
    public int[] minutes;

    public Marathon(String[] names, int[] minutes) {
        this.names = names;
        this.minutes = minutes;
    }
    public int getFirstRunner() {
        int min = minutes[0];
        int index = 0;

        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] < min) {
                min = minutes[i];
                index = i;
            }
        }
        return index;
    }

    public int getSecondRunner(){
        int min = 999999999;
        int firstindex = getFirstRunner();
        int index = 0;
        for (int i = 0; i < minutes.length; i++) {
            if (i == firstindex) continue;
            if (minutes[i] < min){
                min = minutes[i];
                index = i;
            }
        }
        return index;
    }
    public int getThirdRunner(){
        int min = 99999999;
        int firstindex = getFirstRunner();
        int secondindex = getSecondRunner();
        int index = 0;
        for (int i = 0; i < minutes.length; i++) {
            if (i == firstindex || i == secondindex) continue;
            if (minutes[i] < min){
                min = minutes[i];
                index = i;
            }
        }
        return index;
    }
    public void displayFirstMessage(){
        int i = getFirstRunner();
        System.out.println("Birinci: " + names[getFirstRunner()] + " " + minutes[getFirstRunner()] + "'");
    }
    public void displaySecondMessage(){
        int i = getFirstRunner();
        System.out.println("İkinci: " + names[getSecondRunner()] + " " + minutes[getSecondRunner()] + "'");
    }
    public void displayThirdMessage(){
        int i = getFirstRunner();
        System.out.println("Üçüncü: " + names[getThirdRunner()] + " " + minutes[getThirdRunner()] + "'");
    }
    public void displayAllMessages(){
        displayFirstMessage();
        displaySecondMessage();
        displayThirdMessage();
        abclist();
    }
    public void abclist(){ // A - 200-299 dakika olcak, B - 300-399 dakika olcak, C - 400+
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] >= 400)
                a++;
            else if (minutes[i] >= 300)
                b++;
            else if (minutes[i] >= 200)
                c++;
        }
        System.out.println("A -> " + a);
        System.out.println("B -> " + b);
        System.out.println("C -> " +c);
    }
}
