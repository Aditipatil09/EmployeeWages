class CompanyEmpWage {
    private String companyName;
    private double hourlyRate;
    private int daysWorked;
    private int hoursPerDay;
    private double totalWage;

    public CompanyEmpWage(String companyName, double hourlyRate, int daysWorked, int hoursPerDay) {
        this.companyName = companyName;
        this.hourlyRate = hourlyRate;
        this.daysWorked = daysWorked;
        this.hoursPerDay = hoursPerDay;
        this.totalWage = 0; // Initialize total wage to 0
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public double getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(double totalWage) {
        this.totalWage = totalWage;
    }
}

class EmpWageBuilder {
    private CompanyEmpWage[] companyEmpWages;
    private int numOfCompanies;

    public EmpWageBuilder() {
        companyEmpWages = new CompanyEmpWage[5]; // Assuming a maximum of 5 companies
        numOfCompanies = 0;
    }

    public void addCompanyEmpWage(String companyName, double hourlyRate, int daysWorked, int hoursPerDay) {
        companyEmpWages[numOfCompanies] = new CompanyEmpWage(companyName, hourlyRate, daysWorked, hoursPerDay);
        numOfCompanies++;
    }

    public void computeWages() {
        for (int i = 0; i < numOfCompanies; i++) {
            CompanyEmpWage companyEmpWage = companyEmpWages[i];
            int totalHoursWorked = companyEmpWage.getDaysWorked() * companyEmpWage.getHoursPerDay();
            double totalWage = companyEmpWage.getHourlyRate() * totalHoursWorked;
            companyEmpWage.setTotalWage(totalWage);
            System.out.println(companyEmpWage.getCompanyName() + " employee's wage: $" + totalWage);
        }
    }

    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();


        empWageBuilder.addCompanyEmpWage("Company 1", 12, 20, 8);
        empWageBuilder.addCompanyEmpWage("Company 2", 15, 25, 7);


        empWageBuilder.computeWages();
    }
}