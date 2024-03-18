public class catYearsDogYears {
    public static void main(String[] args) {
        int catYears = 10;
        int catAge = 0;
        int dogAge = 0;

        for (int i = 0; i <= catYears; i++) {
            if (i == 1) {
                catAge = 15;
                dogAge = 15;
            }
            if (i == 2) {
                catAge = catAge + 9;
                dogAge = dogAge + 9;
            }
            if (i >= 3 && i <= catYears) {
                catAge = catAge + 4;
                dogAge = dogAge + 5;
            }
        }
        System.out.println("Cat age: " + catAge + " Dog age: " + dogAge);
    }
}
