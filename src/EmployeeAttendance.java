 class EmpWageBuilder {
    private double totalWage;


    public EmpWageBuilder() {
        totalWage = 0;
    }


    public double computeWage(double hourlyRate, int daysWorked, int hoursPerDay) {
        int totalHoursWorked = daysWorked * hoursPerDay;
        totalWage = hourlyRate * totalHoursWorked;
        return totalWage;
    }


    public double getTotalWage() {
        return totalWage;
    }


    public static void main(String[] args) {

        EmpWageBuilder company1 = new EmpWageBuilder();
        double company1HourlyRate = 12;
        int company1DaysWorked = 20;
        int company1HoursPerDay = 8;
        double company1Wage = company1.computeWage(company1HourlyRate, company1DaysWorked, company1HoursPerDay);
        System.out.println("Company 1 employee's wage: " + company1Wage);


        EmpWageBuilder company2 = new EmpWageBuilder();
        double company2HourlyRate = 15;
        int company2DaysWorked = 25;
        int company2HoursPerDay = 7;
        double company2Wage = company2.computeWage(company2HourlyRate, company2DaysWorked, company2HoursPerDay);
        System.out.println("Company 2 employee's wage: " + company2Wage);
    }
}