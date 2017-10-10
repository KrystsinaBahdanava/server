package by.kr.business_logic.products;

public class ProductOnStock {
    protected int productId;
    protected String productName;
    protected int pricePerItem;
    protected boolean availebleOnStock;

    Rack rack; //отсюда узнаем, сколько вместимость и на сколько заполнено. Стоит ли здесь выделять это отдельным классом?
}
