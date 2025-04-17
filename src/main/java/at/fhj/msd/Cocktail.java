package at.fhj.msd;

import java.util.List;

public class Cocktail extends Drink {
  private List<Liquid> ingredients;

  public Cocktail(String name, List<Liquid> ingredients) {
    super(name);
    this.ingredients = ingredients;
  }

  @Override
  public double getVolume() {
    double sum = 0;
    for (Liquid l : ingredients) {
      sum += l.getVolume();
    }
    return sum;
  }

  @Override
  public double getAlcoholPercent() {
    double totalVol = getVolume();
    if (totalVol == 0)
      return 0;

    double alcohol = 0;
    for (Liquid l : ingredients) {
      alcohol += l.getVolume() * l.getAlcoholPercent();
    }

    return alcohol / totalVol;
  }

  @Override
  public boolean isAlcoholic() {
    for (Liquid l : ingredients) {
      if (l.getAlcoholPercent() > 0)
        return true;
    }
    return false;
  }
}
