public class main {
    static int winterCosts = 700;
    static int fallCosts = 300;
    static int springCosts = 300;
    static int summerCosts = 600;
    static int yearCosts = 1000;

    public static void main(String[] args) {
        int yearCosts = winterCosts + fallCosts + springCosts + summerCosts;
        System.out.println("The total costs during the winter season amounted to " + winterCosts + " dollars. The total costs during the fall season amounted to " + fallCosts + " dollars. The total costs during the spring season amounted to " + springCosts + " dollars. The total costs during the summer season amounted to " + summerCosts + " dollars. The yearly maintenance costs amounted to " + yearCosts + " dollars.");

    }

}
