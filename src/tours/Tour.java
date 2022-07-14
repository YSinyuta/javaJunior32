package tours;

public class Tour {
    private int id;
    private String[] countries = new String[15];
    private int days;
    private String typeOfTransport;
    private int stars;
    private int price;
    private String typeOfService;

    public Tour() {

    }

    public Tour(int id, int days, String typeOfTransport, int stars, int price, String typeOfService) {
        this.id = id;
        this.days = days;
        this.countries = countries;
        this.stars = stars;
        this.typeOfService = typeOfService;
        this.typeOfTransport = typeOfTransport;
        this.price = price;
    }
    public void addCountry(String country){
        //цель - добавить в массив со странами в Первую Свободную ячейку
        // данную страну. {"Италия",null,null,}

        for(int i = 0;i<countries.length;i++){
            if (countries[i]==null){
                countries[i] = country;
                break;
            }
        }
    }
/**
 * на все поля сделать методы set,
 * на все поля сделать метод get (вернуть значение поля)
 */
}
