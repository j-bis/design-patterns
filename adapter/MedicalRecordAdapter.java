import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MedicalRecordAdapter implements MedicalRecord{
    private HealthRecord record;
    Date date;
    private ArrayList<Visit> visits = new ArrayList<Visit>();

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    public String getFirstName() {
        return record.getName().substring(0, record.getName().indexOf(" "));
    }

    public String getLastName() {
        return record.getName().substring(record.getName().indexOf(" "));
    }

    public Date getBirthday() {
        return record.getBirthdate();
        // String month = record.getBirthdate().toString().substring(15, 17);
        // int monthConverted = 0;
        // int day = Integer.parseInt(record.getBirthdate().toString().substring(19, 20));
        // int year = Integer.parseInt(record.getBirthdate().toString().substring(35,38));
        // switch (month) {
        //     case "Jan": monthConverted = 1;
        //         break;
        //     case "Feb": monthConverted = 2;
        //         break;
        //     case "Mar": monthConverted = 3;
        //         break;
        //     case "Apr": monthConverted = 4;
        //         break;
        //     case "May": monthConverted = 5;
        //         break;
        //     case "Jun": monthConverted = 6;
        //         break;
        //     case "Jul": monthConverted = 7;
        //         break;
        //     case "Aug": monthConverted = 8;
        //         break;
        //     case "Sep": monthConverted = 9;
        //         break;
        //     case "Oct": monthConverted = 10;
        //         break;
        //     case "Nov": monthConverted = 11;
        //         break;
        //     case "Dec": monthConverted = 12;
        //         break;
        // }
        // Calendar myCalendar = new GregorianCalendar(year, monthConverted - 1, day);
        // return myCalendar.getTime();
        //return Date(year, monthConverted, day);
    }

    public Gender getGender() {
        if (record.getGender().equalsIgnoreCase("male")) return Gender.MALE;
        if (record.getGender().equals("female")) return Gender.FEMALE;
        return Gender.OTHER;
    }

    public void addVisit(Date date, boolean well, String description) {
        visits.add(new Visit(date, !well, description));
    }

    public ArrayList<Visit> getVisitHistory() {
        ArrayList<String> visitString = record.getHistory();
        for (String i : visitString) {
            String description = i.substring(i.indexOf("Comments: ")+9);
            int day = Integer.parseInt(i.substring(i.indexOf("Visit: ")+11, i.indexOf("Visit: ")+12));
            int month = Integer.parseInt(i.substring(i.indexOf("Visit: ")+15, i.indexOf("Visit: ")+16));
            int year = Integer.parseInt(i.substring(i.indexOf("Visit: ")+19, i.indexOf("Visit: ")+22));
            boolean well = Boolean.parseBoolean(i.substring(i.indexOf("Well visit: ")+12,i.indexOf("Well visit: ")+12));
            Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
            addVisit(myCalendar.getTime(), well, description);
        }
        return visits;
    }

    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = simpleDateFormat.format(getBirthday());
        return "***** " + getFirstName() + " " + getLastName() + " *****\nBirthday: " + formattedDate
        + "\nGender: " + getGender() + "\nMedical Visit History:\n" + displayHistory();

    }

    private String displayHistory() {
        String ret = "";
        for (Visit v : getVisitHistory()) {
            ret += v + "\n";//.getDate() + ": " + v.get
        }
        return ret;
    }
}
