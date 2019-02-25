package se.iths.martin.demo2;

public class ProductException extends RuntimeException {
    String s;
    public ProductException(String s) {
        this.s = s;
    }
}
