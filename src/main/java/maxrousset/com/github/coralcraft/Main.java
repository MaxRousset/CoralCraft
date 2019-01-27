package maxrousset.com.github.coralcraft;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


  public void smallCraft(Material input, Material output) {

    ShapedRecipe recipe = new ShapedRecipe( new ItemStack( output ) );
    recipe.shape("EEE","EEE","EEE");
    recipe.setIngredient( 'E', input );
    getServer().addRecipe( recipe );
  }


  public void craft(Material input, Material output) {

    ShapedRecipe recipe = new ShapedRecipe( new ItemStack( output ) );
    recipe.shape("EE","EE");
    recipe.setIngredient( 'E', input );
    getServer().addRecipe( recipe );
  }

  @Override
  public void onEnable() {

    //RECIPES FOR SMALL CORALS

    smallCraft(Material.TUBE_CORAL_FAN, Material.TUBE_CORAL_BLOCK);

    smallCraft(Material.BRAIN_CORAL_FAN, Material.BRAIN_CORAL_BLOCK);

    smallCraft(Material.BUBBLE_CORAL_FAN, Material.BUBBLE_CORAL_BLOCK);

    smallCraft(Material.FIRE_CORAL_FAN, Material.FIRE_CORAL_BLOCK);

    smallCraft(Material.HORN_CORAL_FAN, Material.HORN_CORAL_BLOCK);


    //RECIPES FOR BIG CORALS

    craft(Material.TUBE_CORAL,Material.TUBE_CORAL_BLOCK);

    craft(Material.BRAIN_CORAL,Material.BRAIN_CORAL_BLOCK);

    craft(Material.BUBBLE_CORAL,Material.BUBBLE_CORAL_BLOCK);

    craft(Material.FIRE_CORAL,Material.FIRE_CORAL_BLOCK);

    craft(Material.HORN_CORAL,Material.HORN_CORAL_BLOCK);

  }

}
