package com.company.enums;

import java.util.ArrayList;

public class MonthOperations {

    public ArrayList<Month> getMonthsWithSameSeason(Month month){
        ArrayList<Month> months = new ArrayList<>();
        for(var item : Month.values()){
            if(item.hasSameSeason(month))
                months.add(item);
        }
        return months;
    }
    public Season getNextSeason(Month month){
        Season currentSeason = month.getSeason();
        Season nextSeason;
        if(currentSeason.ordinal() == (Season.values().length-1)){
            nextSeason = Season.values()[0];
        }
        else {
            nextSeason = Season.values()[currentSeason.ordinal()+1];
        }
        return nextSeason;
    }
    public Season getPrevSeason(Month month){
        Season currentSeason = month.getSeason();
        Season prevSeason;
        if(currentSeason.ordinal() == 0){
            prevSeason = Season.values()[Season.values().length-1];
        }
        else {
            prevSeason = Season.values()[currentSeason.ordinal()-1];
        }
        return prevSeason;
    }
    public ArrayList<Month> getMonthsWithSameDays(Month month){
        ArrayList<Month> months = new ArrayList<>();
        for(var item : Month.values()){
            if(item.hasSameDays(month))
                months.add(item);
        }
        return months;
    }
    public ArrayList<Month> getMonthsWithLessDays(Month month){
        ArrayList<Month> months = new ArrayList<>();
        for(var item : Month.values()){
            if(item.getDays() < month.getDays())
                months.add(item);
        }
        return months;
    }
    public ArrayList<Month> getMonthsWithMoreDays(Month month){
        ArrayList<Month> months = new ArrayList<>();
        for(var item : Month.values()){
            if(item.getDays() > month.getDays())
                months.add(item);
        }
        return months;
    }
    public ArrayList<Month> getMonthsWithPairDays(){
        ArrayList<Month> months = new ArrayList<>();
        for(var item : Month.values()){
            if(item.getDays() % 2 == 0)
                months.add(item);
        }
        return months;
    }
    public ArrayList<Month> getMonthsWithUnPairDays(){
        ArrayList<Month> months = new ArrayList<>();
        for(var item : Month.values()){
            if(item.getDays() % 2 != 0)
                months.add(item);
        }
        return months;
    }


    public void printMonths(ArrayList<Month> months){
        System.out.println();
        for(var month : months){
            System.out.print(month.name() + " ");
        }
        System.out.println();
    }
}
