package Util;
import java.io.Serializable;

public class Product implements Serializable {

    /*
     * Student class have 4 variables which will be constructed as Student Object into List<Student>.
     */
    public String product;


    public Product() {
    }

    public Product(String product) {
        this.product = product;

    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getScore() {
//        return score;
//    }
//
//    public void setScore(String score) {
//        this.score = score;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }


    @Override
    public String toString() {
        return "product" + " " + "product= " + product;
    }

}