package entities;

/**
 * Representa o produto que pertence ao catalogo de produtos
 *
 * @author mauriciooliveira
 * @version 1.0
 *
 * @see Catalago
 */
public class Produto {
    private String description;
    private String partNumber;
    private Double price;

    public Produto(String description, String partNumber, Double price) {
        this.description = description;
        this.partNumber = partNumber;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "description='" + description + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
