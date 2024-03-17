import java.util.ArrayList;

// Interface for calculating wages
interface WageCalculator {
    double computeWage(double hourlyRate, int daysWorked, int hoursPerDay);
}


class CompanyEmpWage {
    private String companyName;
    private double totalWage;

    public CompanyEmpWage(String companyName) {
        this.companyName = companyName;
        totalWage = 0;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(double totalWage) {
        this.totalWage = totalWage;
    }
}


class EmpWageBuilder implements WageCalculator {
    private ArrayList<CompanyEmpWage> companyEmpWages;

    public EmpWageBuilder() {
        companyEmpWages = new ArrayList<>();
    }

    public void addCompany(String companyName) {
        companyEmpWages.add(new CompanyEmpWage(companyName));
    }

    @Override
    public double computeWage(double hourlyRate, int daysWorked, int hoursPerDay) {
        int totalHoursWorked = daysWorked * hoursPerDay;
        return hourlyRate * totalHoursWorked;
    }

    public void calculateWages() {
        for (CompanyEmpWage companyEmpWage : companyEmpWages) {
            double hourlyRate = 10; // Assuming a default hourly rate for demonstration
            int daysWorked = 20;    // Assuming a default number of days worked for demonstration
            int hoursPerDay = 8;    // Assuming a default number of hours worked per day for demonstration
            double totalWage = computeWage(hourlyRate, daysWorked, hoursPerDay);
            companyEmpWage.setTotalWage(totalWage);
            System.out.println("Company: " + companyEmpWage.getCompanyName() + ", Total Wage: $" + totalWage);
        }
    }

    public static void main(String[] args) {

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();


        empWageBuilder.addCompany("Company 1");
        empWageBuilder.addCompany("Company 2");


        empWageBuilder.calculateWages();
    }
}