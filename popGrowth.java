class PopulationGrowth {
    // Population growth, p0 = orig population, percent, aug (inhabitants coming or leaving each year), p (population to surpass)
    // Note: Don't forget to convert the percent parameter as a percentage in the body of your function: if the parameter percent is 2 you have to convert it to 0.02.
    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        double pop = p0;
        int year = 0;
        while (!(pop >= p))
        {
        pop += ((percent/100) * pop) + aug;
        year++;
        }
        return year;
    }
}
