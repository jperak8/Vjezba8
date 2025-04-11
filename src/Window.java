public class Window {

    private String naslov;
    private String oznaka;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String boja;
    private boolean jelAktivan;

    public Window(String naslov, boolean jelAktivan, int y2, int x2, int y1, int x1, String oznaka) {
        this.naslov = naslov;
        this.jelAktivan = jelAktivan;
        this.y2 = y2;
        this.x2 = x2;
        this.y1 = y1;
        this.x1 = x1;
        this.oznaka = oznaka;
    }

    public Window(String naslov) {
        this.naslov = naslov;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public boolean isJelAktivan() {
        return jelAktivan;
    }

    public void setJelAktivan(boolean jelAktivan) {
        this.jelAktivan = jelAktivan;
    }

    @Override
    public String toString(){
        return "Naslov: " + getNaslov() + " oznaka: " + getOznaka() + " status:" + isJelAktivan() + " gornji lijevi ugao: " + getX1() + ", " + getY1() + " donji desni ugao: " + getX2() + ", " + getY2();
    }

    public static int width(int x2, int x1) {
        return x2 - x1;
    }

    public static int height(int y2, int y1) {
        return y2 - y1;
    }

    public static int area(int x1, int y1, int x2, int y2) {
        return width(x2, x1) * height(y2, y1);
    }

    public int perimeter(int x1, int y1, int x2, int y2) {
        return 2 * (width(x2, x1) + height(y2, y1));
    }

    public void draw(int x1, int y1, int x2, int y2) {

        for (int i = 0; i < x2 - x1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < (y2 - y1) - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < (x2 - x1) - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < x2 - x1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
