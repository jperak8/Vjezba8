public class Main {

    public static void main(String[] args) {

        try {
            Window.checkCoordinates(20, 15, 100, 40);

            Window window1 = new Window("ProzorPerak");
            System.out.println("Širina prozora je: " + window1.width(100, 20));
            System.out.println("Visina prozora je: " + window1.height(40, 15));
            System.out.println("Površina prozora je: " + window1.area(20, 15, 100, 40));
            System.out.println("Opseg prozora je: " + window1.perimeter(20, 15, 100, 40));
            window1.draw(20, 15, 100, 40);

            Window window2 = new Window("DrugiProzor", true, 40, 100, 15, 20, "nekaOznaka");
            System.out.println(window2.toString());

        } catch (IllegalArgumentException e) {
            System.out.println("Pogreška: " + e.getMessage());
        }

    }

}
