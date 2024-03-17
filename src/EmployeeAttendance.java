class EmployeeWagehour {
    public static void main(String args[]){
        int IS_FULL_TIME =1;
        int EMP_RATE_PER_HOURS =20;
        int empHrs =0;
        int empWage =0;
        double empcheck = Math.floor(Math.random () *10) %2;
        if(empcheck ==IS_FULL_TIME)
            empHrs=8;
        else
            empHrs =0;
        empWage = empHrs *EMP_RATE_PER_HOURS;
        System.out.println("Emp Wage :" +empWage);



    }
}
