package s19_OoadSolid;

public class TestProduct {
    private String name;
    private double costProduct;
    private String ngProduct;
    public TestProduct(){
    }
    ;
    public TestProduct(String name, double costProduct, String ngProduct){
        this.name = name;
        this.costProduct = costProduct;
        this.ngProduct = ngProduct;

    }

    public String getName() {
        return name;
    }

    public double getCostProduct() {
        return costProduct;
    }

    public String getNgProduct() {
        return ngProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCostProduct(double costProduct) {
        this.costProduct = costProduct;
    }

    public void setNgProduct(String ngProduct) {
        this.ngProduct = ngProduct;
    }

}
