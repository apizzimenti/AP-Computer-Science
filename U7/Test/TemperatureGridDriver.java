public class TemperatureGridDriver
{
    public static void main(String[]args)
    {
        double[][]grid = {{95.5, 100.0, 100.0, 100.0, 100.0, 110.3},
            {0.0, 50.0, 50.0, 50.0, 50.0, 0.0},
            {0.0, 40.0, 40.0, 40.0, 40.0, 0.0},
            {0.0, 20.0, 20.0, 20.0, 20.0, 0.0},
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}};
        
        TemperatureGrid temps = new TemperatureGrid(grid);
        
        System.out.print(temps.toString());
        System.out.println("\nWithin Tolerance of 10.5 = "+temps.withinTolerance(10.5));
        System.out.println("Within Tolerance of 15.0 = "+temps.withinTolerance(15.0));
    }
}
