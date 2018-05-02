package bicome.logic.feature;
/**
 * Determines "hump" size, humps are those things that camels have on their back
 * Dominant: Small Hump
 * Recessive: Big Hump
 * None: No Hump
 * @author Ege Balcioglu
 * @version 23.4.2018
 */
import bicome.logic.genotype.Genotype;
import bicome.logic.attribute.*;
import java.util.HashMap;
public final class Hump extends FeatureBase
{
   private static Hump instance;
   
   private Hump()
   {
      super();
   }
   
   public static FeatureBase getInstance()
   {
      if ( instance == null )
         instance = new Hump();
      return instance;
   }
   
   @Override
   protected void setMultipliers()
   {
      // TBA
      this.dominantMultipliers.put( "water_stockpiling", 1.4 );
      this.recessiveMultipliers.put( "water_stockpiling", 1.8 );
      this.dominantMultipliers.put( "nutrition_stockpiling", 1.1 );
      this.recessiveMultipliers.put( "nutrition_stockpiling", 1.4 );
      // this.noneMultipliers.put();
   }
}