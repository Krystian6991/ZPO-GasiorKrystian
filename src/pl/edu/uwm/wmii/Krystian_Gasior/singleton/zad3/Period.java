package pl.edu.uwm.wmii.Krystian_Gasior.singleton.zad3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Period {
        public enum Month {
        JANUARY, 
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private final Month month;
    
    private static final Map<Month, Period> periods = new ConcurrentHashMap<>();

    private Period(Month month) {
        this.month = month;
    }

    static {
        periods.put(Month.JANUARY, new Period(Month.JANUARY));
        periods.put(Month.FEBRUARY, new Period(Month.FEBRUARY));
        periods.put(Month.MARCH, new Period(Month.MARCH));
        periods.put(Month.APRIL, new Period(Month.APRIL));
        periods.put(Month.MAY, new Period(Month.MAY));
        periods.put(Month.JUNE, new Period(Month.JUNE));
        periods.put(Month.JULY, new Period(Month.JULY));
        periods.put(Month.AUGUST, new Period(Month.AUGUST));
        periods.put(Month.SEPTEMBER, new Period(Month.SEPTEMBER));
        periods.put(Month.OCTOBER, new Period(Month.OCTOBER));
        periods.put(Month.NOVEMBER, new Period(Month.NOVEMBER));
        periods.put(Month.DECEMBER, new Period(Month.DECEMBER));
    }

    public static Period getInstance(Month month) {
        return periods.get(month);
    }
}
