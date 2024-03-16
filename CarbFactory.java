import java.util.Random;

public class CarbFactory implements MacronutrientFactory{
    private Random rand = new Random();
    private String[] noRestriction = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private String[] paleo = {"Pistachio"};
    private String[] vegan = {"Bread", "Lentils", "Pistachio"};
    private String[] nutAllergy = {"Cheese", "Bread", "Lentils"};

    public String carbPlan(String diet) {
        if (diet == "no restriction") {
            return noRestriction[rand.nextInt(noRestriction.length)];
        }
        else if(diet == "paleo") {
            return paleo[rand.nextInt(paleo.length)];
        }
        else if(diet == "vegan") {
            return vegan[rand.nextInt(vegan.length)];
        }
        else if(diet == "nut allergy") {
            return nutAllergy[rand.nextInt(nutAllergy.length)];
        }
        else {
            return "No diet plan given";
        }
    }

    @Override
    public String proteinPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'proteinPlan'");
    }

    @Override
    public String fatPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'fatPlan'");
    }

}