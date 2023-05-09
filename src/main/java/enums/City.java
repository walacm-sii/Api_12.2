package enums;

public enum City {
    LONDON("London", 2643743, "GB"),
    OXFORD("Oxford", 2640729, "GB"),
    WARSAW("Warsaw", 756135, "PL"),
    MELBOURNE("Melbourne", 4163971, "US");

    private String name;

    private int id;

    private String country;

    City(String name, int id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }
}
