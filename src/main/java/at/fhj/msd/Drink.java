package at.fhj.msd;

/**
 * Abstract base class for concrete drink classes
 */
public abstract class Drink implements IDrink {
    /**
     * name of the drink
     */
    protected String name;
    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     *
     */
    public Drink(String name) {
        this.name = name;
    }
    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public abstract double getVolume();
    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public abstract double getAlcoholPercent();
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public abstract boolean isAlcoholic();


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
