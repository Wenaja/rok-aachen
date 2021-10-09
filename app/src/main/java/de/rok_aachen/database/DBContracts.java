package de.rok_aachen.database;

public class DBContracts {
    public static int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "rok_db";

    public static final String TP_TABLE_NAME = "Liturgy";
    public static final String MONTH_TABLE_NAME = "Month";

    public class Attributes {
        public static final String ID = "_id";
        public static final String OVERHEAD = "overhead";
        public static final String TITLE = "title";
        public static final String SUBTITLE = "subtitle";
        public static final String BEGINNING_TIME = "beginning_time";
        public static final String DAY = "day";
        public static final String WEEKDAY = "weekday";
        public static final String MONTH = "month";
    }
}
