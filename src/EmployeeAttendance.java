class Employee {
    private static double hourlyRate = 10;


    public static double computeWage(int hoursWorked) {
        return hourlyRate * hoursWorked;
    }


    public static void main(String[] args) {
        int hoursWorked = 40;
        double wage = Employee.computeWage(hoursWorked);
        System.out.println("Employee's wage for " + hoursWorked + " hours worked: " + wage);
    }
}