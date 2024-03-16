import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder{
    private String chain;
    private String size;
    private List<String> toppings = new ArrayList<>();

    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    
    }
    public PizzaBuilder addToppings(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(chain, size, toppings);
    }
}