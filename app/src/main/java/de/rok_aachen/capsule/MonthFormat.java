package de.rok_aachen.capsule;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

public class MonthFormat {

    public int getCurrentMonthNumber(){
        int iMonthNumber;
        String sMonthNumber;
        Date currentDate = new Date(System.currentTimeMillis());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M");

        sMonthNumber = simpleDateFormat.format(currentDate);
        iMonthNumber = Integer.parseInt(sMonthNumber);

        return iMonthNumber;
    }

    public int convertToMonthNumber(String month){
        int number;

        if(month.contains("Янв")){
            number = 1;
        }else if(month.contains("Фев")){
            number = 2;
        }else if (month.contains("Мар")){
            number = 3;
        }else if(month.contains("Апр")){
            number = 4;
        }else if (month.contains("Май")){
            number = 5;
        }else if (month.contains("Июн")){
            number = 6;
        }else if (month.contains("Июл")){
            number = 7;
        }else if (month.contains("Авг")){
            number = 8;
        }else if (month.contains("Сен")){
            number = 9;
        }else if (month.contains("Окт")){
            number = 10;
        }else if (month.contains("Ноя")){
            number = 11;
        }else if (month.contains("Дек")){
            number = 12;
        }else {
            number = -1;
        }

        return number;
    }

}
