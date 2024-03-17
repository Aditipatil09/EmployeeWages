class Employee {

    public static double computeWage(double hourlyRate, int daysWorked, int hoursPerDay) {
        int totalHoursWorked = daysWorked * hoursPerDay;
        return hourlyRate * totalHoursWorked;
    }


    public static void main(String[] args) {

        double company1HourlyRate = 12;
        int company1DaysWorked = 20;
        int company1HoursPerDay = 8;
        double company1Wage = Employee.computeWage(company1HourlyRate, company1DaysWorked, company1HoursPerDay);
        System.out.println("Company 1 employee's wage: " + company1Wage);


        double company2HourlyRate = 15;
        int company2DaysWorked = 25;
        int company2HoursPerDay = 7;
        double company2Wage = Employee.computeWage(company2HourlyRate, company2DaysWorked, company2HoursPerDay);
        System.out.println("Company 2 employee's wage: " + company2Wage);
    }
}