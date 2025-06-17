package me.aviloo.empty.Utils;

public class SalaryUtils {

    private static int Plan;
    private static int CurrentRevenue;
    private static int Today;

    //Salary
    private static final int SalaryMain = 10000;
    private static final int AKB = 10000;
    private static final int BonusPlan = 5000;
    private static int BonusSell = 100;

    public static int getSalary(){
        if((CurrentRevenue/Plan)* 100 >= 100){
            return (int) Math.round(SalaryMain + AKB + BonusPlan + (float)(BonusSell * 4) /100);
        }
        if((CurrentRevenue/Plan)* 100 < 100){
            return (int) Math.round(SalaryMain + AKB +(float)(BonusSell * 4) /100);
        }

        return 0;
    }


    //Getter and Setter

    public static int getPlan() {
        return Plan;
    }

    public static void setPlan(int plan) {
        Plan = plan;
    }


    public static int getCurrentRevenue() {
        return CurrentRevenue;
    }

    public static void setCurrentRevenue(int currentRevenue) {
        CurrentRevenue = currentRevenue;
    }


    public static int getToday() {
        return Today;
    }

    public static void setToday(int today) {
        Today = today;
    }


}