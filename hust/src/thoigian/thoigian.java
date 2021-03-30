package thoigian;
import java.util.Objects;

public class thoigian {
    public static enum Mday{
        first("1st"),second("2nd"),third("3rd"),fourth("4th"),fifth("5th"),
        sixth("6th"),seventh("7th"),eighth("8th"),ninth("9th"),tenth("10th"),
        eleventh("11th"),twelfth("12th"),thirteenth("13th"),fourteenth("14th"),
        fifteenth("15th"),sixteenth("16th"),seventeenth("17th"),eighteenth("18th"),
        nineteenth("19th"),twentieth("20th"),twenty_first("21th"),twenty_second("22th"),
        twenty_third("23th"),twenty_fourth("24th"),twenty_fifth("25th"),twenty_six("26th"),
        twenty_seven("27th"),twenty_eighth("28th"),twenty_ninth("29th"),thirtieth("30th"),thirty_first("31th");
        private String ngay;
        Mday(String ngay){
            this.ngay=ngay;
        }
        public String gDay(){
            return ngay;
        }
    }
    public enum Mmonth{
        January("01"),February("02"),March("03"),April("04"),May("05"),June("06"),July("07"),August("08"),September("09"),October("10"),November("11"),December("12");
        private String thang;
        Mmonth(String thang){
            this.thang=thang;
        }
    }
    public static enum Myear{
        nineteen("19"),twenty("20"),eleven("11"),twelve("12"),thirteen("13"),fourteen("14"),fifteen("15"),sixteen("16"),seventeen("17"),eighteen("18"),
        one("1"),two("2"),three("3"),four("4"),five("5"),six("6"),seven("7"),eight("8"),nine("9"),ten("10"),zero("0"),hundred("00"),zero_one("01"),zero_two("02"),zero_three("03"),zero_four("04"),zero_five("05"),zero_six("06"),zero_seven("08"),zero_eight("09"),twenty_one("21"),twenty_two("22"),twenty_three("23"),twenty_four("24"),twenty_five("25"),twenty_six("26"),twenty_seven("27"),twenty_eight("28"),twenty_nine("29"),thirty("30"),thirty_one("31"),thirty_two("32"),thirty_three("33"),thirty_four("34"),thirty_five("35"),thirty_six("36"),thirty_seven("37"),thirty_eight("38"),thirty_nine("39"),fourty("40"),fourty_one("41"),fourty_two("42"),
        fourty_three("43"),fourty_four("44"),fourty_five("45"),fourty_six("46"),fourty_seven("47"),fourty_eight("48"),fourty_nine("49"),
        fifty("50"),fifty_one("51"),fifty_two("52"),fifty_three("53"),fifty_four("54"),fifty_five("55"),fifty_six("56"),fifty_seven("57"),fifty_eight("58"),fifty_nine("59"),
        sixty("60"),sixty_one("61"),sixty_two("62"),sixty_four("64"),sixty_three("63"),sixty_five("65"),sixty_six("66"),sixty_seven("67"),sixty_eight("68"),sixty_nine("69"),
        seventy("70"),seventy_one("71"),senventy_two("72"),seventy_three("73"),seventy_four("74"),seventy_five("75"),seventy_six("76"),seventy_seven("77"),seventy_eight("78"),seventy_nine("79"),
        eighty("80"),eighty_one("81"),eighty_two("82"),eighty_three("83"),eighty_four("84"),eighty_five("85"),eighty_six("86"),eighty_seven("87"),eighty_eight("88"),eighty_nine("89"),
        ninety("90"),ninety_one("91"),ninety_two("92"),ninety_three("93"),ninety_four("95"),ninety_five("95"),ninety_six("96"),ninety_seven("97"),ninety_eight("98"),ninety_nine("99")

        ;
        private String nam;
        Myear(String nam){
            this.nam=nam;
        }
    }
    public static String cDay(String day){
        String n = "Khong xac dinh";
        for(Mday a:Mday.values()){
            if(day == a.name()){
                n =a.ngay;
            }
        }
        return n;
    }
    public static String cMonth(String month){
        String n="Khong xac dinh";
        for(Mmonth a: Mmonth.values()){
            if(month==a.name()){
                n= a.thang;
            }
        }
        return n;
    }
    public static String cYear(String year){
        String n1="Khong xac dinh";
        String n2="Khong xac dinh";
        String st1 = year.substring(0,year.indexOf(" "));
        for(Myear a: Myear.values()){
            if(Objects.equals(st1,a.name())){
                n1=a.nam;
            }
        }
        String st2 =year.substring(year.indexOf(" ")+1,year.length());
        for(Myear a: Myear.values()){
            if(Objects.equals(st2, a.name())){
                n2=a.nam;
            }
        }
            return n1+n2;
        }
    public static String iMonth(String monthInt){
        String n="Khong xac dinh";
        for(Mmonth a: Mmonth.values()){
            if(Objects.equals(monthInt, a.thang)){
                n=a.name();
            }
        }
        return n;
    }
}

