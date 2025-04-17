package at.fhj.msd;

public interface IDrink {

  /**
   * Calculates and returns volume of drink
   *
   * @return the volume of drink in liter
   */
  double getVolume();

  /**
   * Calculates and returns the alcohol percentage
   *
   * @return alcohol volume percent (e.g. 50)
   */
  double getAlcoholPercent();

  /**
   * Gives information if drink is alcoholic or not
   *
   * @return true when alcoholic liquids are present, otherwise false
   */
  boolean isAlcoholic();

  String getName();

  void setName(String name);

}