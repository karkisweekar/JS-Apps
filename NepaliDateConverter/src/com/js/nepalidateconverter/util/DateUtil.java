package com.js.nepalidateconverter.util;

import java.util.ArrayList;
import java.util.List;

import com.js.nepalidateconverter.R;

/**
 * Created by Sweekar karki on 6/17/2015.
 */
public class DateUtil {

    public String getMonthInNepali(int month) {
        String nepaliMonth = null;
        switch (month) {
        case 1:
			nepaliMonth = "बैसाख";
			break;
		case 2:
			nepaliMonth = "जेठ";
			break;
		case 3:
			nepaliMonth = "आषाढ़";
			break;
		case 4:
			nepaliMonth = "श्रावण";
			break;
		case 5:
			nepaliMonth = "भाद्र";
			break;
		case 6:
			nepaliMonth = "असोज";
			break;
		case 7:
			nepaliMonth = "कार्तिक";
			break;
		case 8:
			nepaliMonth = "मंसिर";
			break;
		case 9:
			nepaliMonth = "पुस";
			break;
		case 10:
			nepaliMonth = "माघ";
			break;
		case 11:
			nepaliMonth = "फाल्गुन";
			break;
		case 12:
			nepaliMonth = "चैत्र";
			break;

            default:
                break;
        }
        return nepaliMonth;

    }

    public String getDayInNepali(int day) {

        String dayN = null;
        switch (day) {
            case 1:
    			dayN = "०१";
    			break;
    		case 2:
    			dayN = "०२";
    			break;
    		case 3:
    			dayN = "०३";
    			break;
    		case 4:
    			dayN = "०४";
    			break;
    		case 5:
    			dayN = "०५";
    			break;
    		case 6:
    			dayN = "०६";
    			break;
    		case 7:
    			dayN = "०७";
    			break;
    		case 8:
    			dayN = "०८";
    			break;
    		case 9:
    			dayN = "०९";
    			break;
    		case 10:
    			dayN = "१०";
    			break;
    		case 11:
    			dayN = "११";
    			break;
    		case 12:
    			dayN = "१२";
    			break;
    		case 13:
    			dayN = "१३";
    			break;
    		case 14:
    			dayN = "१४";
    			break;
    		case 15:
    			dayN = "१५";
    			break;
    		case 16:
    			dayN = "१६";
    			break;
    		case 17:
    			dayN = "१७";
    			break;
    		case 18:
    			dayN = "१८";
    			break;
    		case 19:
    			dayN = "१९";
    			break;
    		case 20:
    			dayN = "२०";
    			break;
    		case 21:
    			dayN = "२१";
    			break;
    		case 22:
    			dayN = "२२";
    			break;
    		case 23:
    			dayN = "२३";
    			break;
    		case 24:
    			dayN = "२४";
    			break;
    		case 25:
    			dayN = "२५";
    			break;
    		case 26:
    			dayN = "२६";
    			break;
    		case 27:
    			dayN = "२७";
    			break;
    		case 28:
    			dayN = "२८";
    			break;
    		case 29:
    			dayN = "२९";
    			break;
    		case 30:
    			dayN = "३०";
    			break;
    		case 31:
    			dayN = "३१";
    			break;
    		case 32:
    			dayN = "३२";
    			break;
    		case 33:
    			dayN = "३३";
    			break;

            default:
                break;
        }
        return dayN;

    }

    public String getYearInNepali(String year) {
        char[] breakYear = year.toCharArray();
        String yearInNp = null;

        List<String> myList = new ArrayList<String>();
        for (int i = 0; i < breakYear.length; i++) {
            String a = String.valueOf(breakYear[i]);
            if (a.equals("0")) {
				myList.add("०");
			}
			if (a.equals("1")) {
				myList.add("१");
			}
			if (a.equals("2")) {
				myList.add("२");
			}
			if (a.equals("3")) {
				myList.add("३");
			}
			if (a.equals("4")) {
				myList.add("४");
			}
			if (a.equals("5")) {
				myList.add("५");
			}
			if (a.equals("6")) {
				myList.add("६");
			}
			if (a.equals("7")) {
				myList.add("७");
			}
			if (a.equals("8")) {
				myList.add("८");
			}
			if (a.equals("9")) {
				myList.add("९");
            }if(a.equals(":")){
                myList.add(":");
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String string : myList) {
            sb.append(string);

        }
        yearInNp = sb.toString();
        return yearInNp;

    }

    public String getDayOfWeekInNepali(String dayOfWeek){

        String dOw = null;
        switch (dayOfWeek) {
        case "Sun":
			dOw = "आइतवार";
			break;
		case "Mon":
			dOw = "सोम्बार ";
			break;
		case "Tue":
			dOw = "मंगलवार";
			break;
		case "Wed":
			dOw = "बुधवार";
			break;
		case "Thu":
			dOw = "बिहिबार ";
			break;
		case "Fri":
			dOw = "शुक्रबार ";
			break;
		case "Sat":
			dOw = "शनिबार ";
			break;

            default:
                break;
        }
        return dOw;

    }

}
