public class Date {
    //String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    String days;
    //String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String months;
    int year;
    int start_time;
    int end_time;

    public void set_year(int year){

        this.year = year;
    }
    public int get_year(){

        return year;
    }

    public void set_start_time(int start_time){

        this.start_time = start_time;
    }
    public int get_start_time(){

        return start_time;
    }

    public void set_end_time(int end_time){

        this.end_time = end_time;
    }
    public int get_end_time(){

        return end_time;
    }

    /*public void set_days(String days){
        this.days = new String[]{days};
    }
    public String[] get_days(String d){
        return days;
    }*/

    public void set_days(String days){

        this.days = days;
    }
    public String get_days(String d){

        return days;
    }

    public void set_months(String months){

        this.months = months;
    }
    public String get_months(){
        return months;
    }

    /*public void set_months(String months){
        this.months = new String[]{months};
    }
    public String[] get_months(){
        return months;
    }*/
}
