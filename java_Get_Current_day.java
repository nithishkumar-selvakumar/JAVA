 public static String findDay(int month, int day, int year) {

        return LocalDate.of(year,month,day).getDayOfWeek().name();
        //int year;
        int day;
        int month;
        package:import java.time.LocaDate;
        LocalDate dt=LocalDate.of(year,month,day);
        sysout(dt.getDayOfWeek());//

    }
