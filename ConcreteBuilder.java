public class ConcreteBuilder {
    public static void main(String[] args) { 
        // Pizza with 3 toppings
        Pizza pizza1 = new PizzaBuilder()
        .setChain("Blaze Pizza")
        .setSize("Small")
        .addToppings("Pepperoni")
        .addToppings("Sausage")
        .addToppings("Mushrooms")
        .createPizza();

        // Pizza with 6 toppings
        Pizza pizza2 = new PizzaBuilder()
        .setChain("Papa Johns")
        .setSize("Medium")
        .addToppings("Pepperoni")
        .addToppings("Sausage")
        .addToppings("Mushrooms")
        .addToppings("Bacon")
        .addToppings("Onions")
        .addToppings("Extra Cheese")
        .createPizza();

        // Pizza with 9 toppings
        Pizza pizza3 = new PizzaBuilder()
        .setChain("California Pizza Kitchen")
        .setSize("Large")
        .addToppings("Pepperoni")
        .addToppings("Sausage")
        .addToppings("Mushrooms")
        .addToppings("Bacon")
        .addToppings("Onions")
        .addToppings("Extra Cheese")
        .addToppings("Peppers")
        .addToppings("Chicken")
        .addToppings("Olives")
        .createPizza();

        // Eat created pizzas
        System.out.println("---------------------- Driver Program Pizzas ----------------------");
        pizza1.eat();
        pizza2.eat();
        pizza3.eat();

        // Create Pizza Hut, Little Caesars, and Dominos pizzas
        // Pizza Hut
        Pizza pizzaHut1 = new PizzaBuilder()
        .setChain("Pizza Hut")
        .setSize("Large")
        .addToppings("Pepperoni")
        .addToppings("Sausage")
        .addToppings("Mushrooms")
        .createPizza();

        Pizza pizzaHut2 = new PizzaBuilder()
        .setChain("Pizza Hut")
        .setSize("Small")
        .addToppings("Bacon")
        .addToppings("Onions")
        .createPizza();

        // Little Caesars
        Pizza littleCaesars1 = new PizzaBuilder()
        .setChain("Little Caesars")
        .setSize("Medium")
        .addToppings("Peppers")
        .addToppings("Chicken")
        .addToppings("Olives")
        .addToppings("Spinach")
        .addToppings("Tomato and Basil")
        .addToppings("Beef")
        .addToppings("Ham")
        .addToppings("Pesto")
        .createPizza();

        Pizza littleCaesars2 = new PizzaBuilder()
        .setChain("Little Caesars")
        .setSize("Small")
        .addToppings("Pepperoni")
        .addToppings("Sausage")
        .addToppings("Tomato and Basil")
        .addToppings("Beef")
        .addToppings("Spicy Pork")
        .addToppings("Ham and Pineapple")
        .createPizza();

        // Dominos
        Pizza dominos1 = new PizzaBuilder()
        .setChain("Dominos")
        .setSize("Small")
        .addToppings("Pepperoni")
        .createPizza();

        Pizza dominos2 = new PizzaBuilder()
        .setChain("Dominos")
        .setSize("Large")
        .addToppings("Sausage")
        .addToppings("Tomato and Basil")
        .addToppings("Beef")
        .createPizza();

        System.out.println("---------------------- Pizza Chain pizzas ----------------------");
        pizzaHut1.eat();
        pizzaHut2.eat();
        littleCaesars1.eat();
        littleCaesars2.eat();
        dominos1.eat();
        dominos2.eat();
    }
}
