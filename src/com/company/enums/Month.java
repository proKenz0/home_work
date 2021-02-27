package com.company.enums;

public enum Month {
    JANUARY(31, Season.WINTER), FEBRUARY(28, Season.WINTER), MARCH(31, Season.SPRING),
    APRIL(30, Season.SPRING), MAY(31, Season.SPRING), JUNE(30, Season.SUMMER),
    JULY(31, Season.SUMMER), AUGUST(31, Season.SUMMER), SEPTEMBER(30, Season.AUTUMN),
    OCTOBER(31, Season.AUTUMN), NOVEMBER(30, Season.AUTUMN), DECEMBER(31, Season.WINTER);

    private int days;
    private Season season;

    Month(int days, Season season) {
        this.days = days;
        this.season = season;
    }
    static boolean isMonth(String monthInput){
        for(var month : Month.values()){
            if(month.name().equals(monthInput))
                return true;
        }
        return false;
    }
    boolean hasSameDays(Month month){
        if(days == month.days)
            return true;
        return false;
    }
    boolean hasSameSeason(Month month){
        if(season.equals(month.season))
            return true;
        return false;
    }

    public int getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return season + " has " + days + " days.\n";
    }
}
