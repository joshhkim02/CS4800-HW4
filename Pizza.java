import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String chain;
    private String size;
    private List<String> toppings = new ArrayList<>();

    public Pizza(String chain, String size, List<String> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Eating a " + size + " pizza from " + chain + " with the following toppings: " + toppings +"\n");
    }
}