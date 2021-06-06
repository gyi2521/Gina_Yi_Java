public class ConverterIf implements Converter{

    @Override
    public String convertMonth(int monthNumber) {
        String result;
        if (monthNumber == 1) {
            result = "January";
        } else if (monthNumber == 2) {
            result = "February";
        } else if (monthNumber == 3) {
            result = "March";
        } else if (monthNumber == 4) {
            result = "April";
        } else if (monthNumber == 5) {
            result = "May";
        } else if (monthNumber == 6) {
            result = "June";
        } else if (monthNumber == 7) {
            result = "July";
        } else if (monthNumber == 8) {
            result = "August";
        } else if (monthNumber == 9) {
            result = "September";
        } else if (monthNumber == 10) {
            result = "October";
        } else if (monthNumber == 11) {
            result = "November";
        }else if (monthNumber == 12) {
            result = "December";
        } else {
            result = "Error: You need to enter a number between 1 and 12!";
        }
        return result;
 }

    @Override
    public String convertDay(int dayNumber) {
        String result;
        if (dayNumber == 1) {
            result = "Sunday";
        } else if (dayNumber == 2) {
            result = "Monday";
        } else if (dayNumber == 3) {
            result = "Tuesday";
        } else if (dayNumber == 4) {
            result = "Wednesday";
        } else if (dayNumber == 5) {
            result = "Thursday";
        } else  if (dayNumber == 6) {
            result = "Friday";
        } else if (dayNumber == 7) {
            result = "Saturday";
        } else {
            result = "Error: You need to enter a number between 1 and 7!";
        }
        return  result;
    }
}
