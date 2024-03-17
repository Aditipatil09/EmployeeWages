class EmpWagespermonth {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HOUR =20;
    public static final int NUM_OF_WORKING_DAYS =4;
    public static void main (String args[]){

        int empHrs =0, empWages =0, totalEmpWages=0;
        for (int day= 0; day<NUM_OF_WORKING_DAYS; day++){
            int empCheck = (int) Math.floor (Math.random() *10) %3;
            switch (empCheck){
                case IS_PART_TIME:
                    empHrs=4;
                    break ;
                case IS_FULL_TIME:
                    empHrs =8;
                    break ;
                default :
                    empHrs =0;
            }
            empWages = empHrs * EMP_RATE_PER_HOUR ;
            totalEmpWages += empWages ;
            System.out.println("Emp Wages:" +empWages);
        }
        System.out.println("Total Emp Wages:" +totalEmpWages);

    }
}

