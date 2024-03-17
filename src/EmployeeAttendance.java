import java.util.ArrayList;
import java.util.List;


interface WageCalculator {
    double computeWage(double hourlyRate, int daysWorked, int hoursPerDay);
}


class CompanyEmpWage {
    private String companyName;
    private double totalWage;
    private List<Double> dailyWages;

    public CompanyEmpWage(String companyName) {
        this.companyName = companyName;
        totalWage = 0;
        dailyWages = new ArrayList<>();
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

    public List<Double> getDailyWages() {
        return dailyWages;
    }

    public void addDailyWage(double wage) {
        dailyWages.add(wage);
    }
}


class EmpWageBuilder implements WageCalculator {
    private List<CompanyEmpWage> companyEmpWages;

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

    public double getTotalWageByCompany(String companyName) {
        for (CompanyEmpWage companyEmpWage : companyEmpWages) {
            if (companyEmpWage.getCompanyName().equals(companyName)) {
                return companyEmpWage.getTotalWage();
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();


        empWageBuilder.addCompany("Company 1");
        empWageBuilder.addCompany("Company 2");


        empWageBuilder.calculateWages();


        System.out.println("Total wage for Company 1: $" + empWageBuilder.getTotalWageByCompany("Company 1"));
    }

    public void calculateWages() {
        for (CompanyEmpWage companyEmpWage : companyEmpWages) {
            double hourlyRate = 10;
            int daysWorked = 20;
            int hoursPerDay = 8;
            double totalWage = computeWage(hourlyRate, daysWorked, hoursPerDay);
            companyEmpWage.setTotalWage(totalWage);
            for (int i = 0; i < daysWorked; i++) {
                double dailyWage = computeWage(hourlyRate, 1, hoursPerDay);
                companyEmpWage.addDailyWage(dailyWage);
            }
            System.out.println("Company: " + companyEmpWage.getCompanyName() + ", Total Wage: $" + totalWage);
            System.out.println("Daily Wages: " + companyEmpWage.getDailyWages());
        }
    }
}