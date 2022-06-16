package codegym.model;

public class MedicalDeclaration {
    private String name;
    private String birthDay;
    private String gender;
    private String nationality;
    private String card;
    private String informationTravel;
    private String vehicleNumber;
    private String seats;
    private String departureDay;
    private String departureMonth;
    private String departureYear;
    private String endDay;
    private String endMonth;
    private String endYear;
    private String destinationInformation;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String name, String birthDay, String gender, String nationality, String card,
                              String informationTravel, String vehicleNumber, String seats, String departureDay,
                              String departureMonth, String departureYear, String endDay, String endMonth,
                              String endYear, String destinationInformation) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.nationality = nationality;
        this.card = card;
        this.informationTravel = informationTravel;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
        this.departureDay = departureDay;
        this.departureMonth = departureMonth;
        this.departureYear = departureYear;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
        this.destinationInformation = destinationInformation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getInformationTravel() {
        return informationTravel;
    }

    public void setInformationTravel(String informationTravel) {
        this.informationTravel = informationTravel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(String departureDay) {
        this.departureDay = departureDay;
    }

    public String getDepartureMonth() {
        return departureMonth;
    }

    public void setDepartureMonth(String departureMonth) {
        this.departureMonth = departureMonth;
    }

    public String getDepartureYear() {
        return departureYear;
    }

    public void setDepartureYear(String departureYear) {
        this.departureYear = departureYear;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getDestinationInformation() {
        return destinationInformation;
    }

    public void setDestinationInformation(String destinationInformation) {
        this.destinationInformation = destinationInformation;
    }
}
