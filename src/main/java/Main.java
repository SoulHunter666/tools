public class Main {
    public static void main(String[] args) {
        Guitar g1 = new Guitar(true,5);
        Guitar g2 = new Guitar(false,6);
        Drum d1 = new Drum(9.99);
        Trumpet t1 = new Trumpet(6.66);
        Tool[]tools ={g1,g2,d1,t1};
        for (Tool tool: tools){
            tool.play();
        }
    }
}
