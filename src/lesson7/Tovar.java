package lesson7;

//мы создали новый тип
public class Tovar {
    //переменная (поля класса),которые описывают состояние объекта (характеристики)
    //ЗДЕСЬ МОГУТ БЫТЬ ПЕРЕМЕННЫЕ КОТОРЫЕ ОТНОСЯТСЯ ТОЛЬКО К 1 ТОВАРУ
    //И КОТОРЫЕ ОПИСЫВАЮТ СОСТОЯНИЕ ДАННОГО ОБЪЕКТА
    private int id;
    private int fullPrice;
    private int SalePrice;
    private String name;

    public void setId(int idToSave){
        id = idToSave;
    }

    public void setFullPrice(int newFullPrice){
        fullPrice = newFullPrice;
    }




}
