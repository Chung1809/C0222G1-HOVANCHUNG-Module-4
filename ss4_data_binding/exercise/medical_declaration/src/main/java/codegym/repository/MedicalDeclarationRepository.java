package codegym.repository;

import codegym.model.MedicalDeclaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalDeclarationRepository implements IMedicalDeclarationRepository {
    private  static List<MedicalDeclaration> medicalDeclarations = new ArrayList<>();
    private static List<String> birthday = new ArrayList<>();
    private static List<String> gender = new ArrayList<>();
    private static List<String> nationality = new ArrayList<>();
    private static List<String> informationTravel = new ArrayList<>();
    private static List<String> departureDay = new ArrayList<>();
    private static List<String> departureMonth = new ArrayList<>();
    private static List<String> departureYear = new ArrayList<>();
    private static List<String> endDay = new ArrayList<>();
    private static List<String> endMonth = new ArrayList<>();
    private static List<String> endYear = new ArrayList<>();


    static {

        medicalDeclarations.add(new MedicalDeclaration("HỒ VĂN CHUNG", "2000", "Nam",
                "Việt Nam", "1975161", "Tàu thuyền", "1234", "5"
                , "18", "09", "2000", "20", "06",
                "2010", "Không"));

        birthday.add("1990");
        birthday.add("1991");
        birthday.add("1992");
        birthday.add("1993");
        birthday.add("1994");
        birthday.add("1995");
        birthday.add("1996");
        birthday.add("1997");
        birthday.add("1998");
        birthday.add("1999");

        gender.add("-Chọn-");
        gender.add("Nam");
        gender.add("Nữ");
        gender.add("LGBT");

        nationality.add("Việt Nam");
        nationality.add("Mỹ");
        nationality.add("Australia");
        nationality.add("Russia");

        informationTravel.add("Tàu bay");
        informationTravel.add("Tàu thuyền");
        informationTravel.add("Ô tô");
        informationTravel.add("Khác(Ghi rõ)");

        departureDay.add("1");
        departureDay.add("2");
        departureDay.add("3");
        departureDay.add("4");
        departureDay.add("5");
        departureDay.add("6");
        departureDay.add("7");
        departureDay.add("8");
        departureDay.add("9");
        departureDay.add("10");
        departureDay.add("11");
        departureDay.add("12");
        departureDay.add("13");
        departureDay.add("14");
        departureDay.add("15");
        departureDay.add("16");
        departureDay.add("17");
        departureDay.add("18");
        departureDay.add("19");
        departureDay.add("20");
        departureDay.add("21");
        departureDay.add("22");
        departureDay.add("23");
        departureDay.add("24");
        departureDay.add("25");
        departureDay.add("26");
        departureDay.add("27");
        departureDay.add("28");
        departureDay.add("29");
        departureDay.add("30");

        departureMonth.add("1");
        departureMonth.add("2");
        departureMonth.add("3");
        departureMonth.add("4");
        departureMonth.add("5");
        departureMonth.add("6");
        departureMonth.add("7");
        departureMonth.add("8");
        departureMonth.add("9");
        departureMonth.add("10");
        departureMonth.add("11");
        departureMonth.add("12");


        departureYear.add("2000");
        departureYear.add("2001");
        departureYear.add("2002");
        departureYear.add("2003");
        departureYear.add("2004");
        departureYear.add("2005");
        departureYear.add("2006");
        departureYear.add("2007");
        departureYear.add("2008");
        departureYear.add("2009");

        endDay.add("1");
        endDay.add("2");
        endDay.add("3");
        endDay.add("4");
        endDay.add("5");
        endDay.add("6");
        endDay.add("7");
        endDay.add("8");
        endDay.add("9");
        endDay.add("10");
        endDay.add("11");
        endDay.add("12");
        endDay.add("13");
        endDay.add("14");
        endDay.add("15");
        endDay.add("16");
        endDay.add("17");
        endDay.add("18");
        endDay.add("19");
        endDay.add("20");
        endDay.add("21");
        endDay.add("22");
        endDay.add("23");
        endDay.add("24");
        endDay.add("25");
        endDay.add("26");
        endDay.add("27");
        endDay.add("28");
        endDay.add("29");
        endDay.add("30");

        endMonth.add("1");
        endMonth.add("2");
        endMonth.add("3");
        endMonth.add("4");
        endMonth.add("5");
        endMonth.add("6");
        endMonth.add("7");
        endMonth.add("8");
        endMonth.add("9");
        endMonth.add("10");
        endMonth.add("11");
        endMonth.add("12");


        endYear.add("2010");
        endYear.add("2011");
        endYear.add("2012");
        endYear.add("2013");
        endYear.add("2014");
        endYear.add("2015");
        endYear.add("2016");
        endYear.add("2017");
        endYear.add("2018");
        endYear.add("2019");
    }

    @Override
    public List<MedicalDeclaration> findAll() {
        return medicalDeclarations;
    }

    @Override
    public void save(MedicalDeclaration medicalDeclaration) {
        medicalDeclarations.add(medicalDeclaration);
    }

    @Override
    public List<String> birthDay() {
        return birthday;
    }

    @Override
    public List<String> gender() {
        return gender;
    }

    @Override
    public List<String> nationality() {
        return nationality;
    }

    @Override
    public List<String> informationTravel() {
        return informationTravel;
    }

    @Override
    public List<String> departureDay() {
        return departureDay;
    }

    @Override
    public List<String> departureMonth() {
        return departureMonth;
    }

    @Override
    public List<String> departureYear() {
        return departureYear;
    }

    @Override
    public List<String> endDay() {
        return endDay;
    }

    @Override
    public List<String> endMonth() {
        return endMonth;
    }

    @Override
    public List<String> endYear() {
        return endYear;
    }


}
