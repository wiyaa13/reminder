
public class reminder extends Date{
    private static Date Date;
    private Date DateList;
    private static Date DtList;
    private Location Location;

    public static Date getDate() {
        return Date;
    }

    public static void setDate(Date date) {
        Date = date;
    }

    public Date getDateList() {
        return DateList;
    }

    public void setDateList(Date dateList) {
        DateList = dateList;
    }

    public static Date getDtList() {
        return DtList;
    }

    public static void setDtList(Date dtList) {
        DtList = dtList;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location location) {
        Location = location;
    }
}




