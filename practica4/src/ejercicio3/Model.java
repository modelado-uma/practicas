package ejercicio3;

public class Model {
    private String model;
    private Integer pricePerDay;

    public Model(String model, Integer pricePerDay){
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public Integer getPricePerDay(){
        return this.pricePerDay;
    }

    public void setPricePerDay(Integer pricePerDay){
        this.pricePerDay = pricePerDay;
    }
}
