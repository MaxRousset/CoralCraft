package maxrousset.com.github.coralcraft;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


  @Override
  public void onEnable() {

    //RECIPES FOR SMALL CORALS

    ShapedRecipe recipe_blue_coral_block_small = new ShapedRecipe( new ItemStack( Material.TUBE_CORAL_BLOCK ) );
    recipe_blue_coral_block_small.shape("EEE","EEE","EEE");
    recipe_blue_coral_block_small.setIngredient( 'E', Material.TUBE_CORAL_FAN );
    getServer().addRecipe( recipe_blue_coral_block_small );


    ShapedRecipe recipe_pink_coral_block_small = new ShapedRecipe( new ItemStack( Material.BRAIN_CORAL_BLOCK ) );
    recipe_pink_coral_block_small.shape("EEE","EEE","EEE");
    recipe_pink_coral_block_small.setIngredient( 'E', Material.BRAIN_CORAL_FAN );
    getServer().addRecipe( recipe_pink_coral_block_small );


    ShapedRecipe recipe_purple_coral_block_small = new ShapedRecipe( new ItemStack( Material.BUBBLE_CORAL_BLOCK ) );
    recipe_purple_coral_block_small.shape("EEE","EEE","EEE");
    recipe_purple_coral_block_small.setIngredient( 'E', Material.BUBBLE_CORAL_FAN );
    getServer().addRecipe( recipe_purple_coral_block_small );


    ShapedRecipe recipe_red_coral_block_small = new ShapedRecipe( new ItemStack( Material.FIRE_CORAL_BLOCK ) );
    recipe_red_coral_block_small.shape("EEE","EEE","EEE");
    recipe_red_coral_block_small.setIngredient( 'E', Material.FIRE_CORAL_FAN );
    getServer().addRecipe( recipe_red_coral_block_small );


    ShapedRecipe recipe_yellow_coral_block_small = new ShapedRecipe( new ItemStack( Material.HORN_CORAL_BLOCK ) );
    recipe_yellow_coral_block_small.shape("EEE","EEE","EEE");
    recipe_yellow_coral_block_small.setIngredient( 'E', Material.HORN_CORAL_FAN );
    getServer().addRecipe( recipe_yellow_coral_block_small );


    //RECIPES FOR BIG CORALS

    ShapedRecipe recipe_blue_coral_block = new ShapedRecipe( new ItemStack( Material.TUBE_CORAL_BLOCK ) );
    recipe_blue_coral_block.shape("EE","EE");
    recipe_blue_coral_block.setIngredient( 'E', Material.TUBE_CORAL );
    getServer().addRecipe( recipe_blue_coral_block);


    ShapedRecipe recipe_pink_coral_block = new ShapedRecipe( new ItemStack( Material.BRAIN_CORAL_BLOCK ) );
    recipe_pink_coral_block.shape("EE","EE");
    recipe_pink_coral_block.setIngredient( 'E', Material.BRAIN_CORAL );
    getServer().addRecipe( recipe_pink_coral_block );

    ShapedRecipe recipe_purple_coral_block = new ShapedRecipe( new ItemStack( Material.BUBBLE_CORAL_BLOCK ) );
    recipe_purple_coral_block.shape("EE","EE");
    recipe_purple_coral_block.setIngredient( 'E', Material.BUBBLE_CORAL );
    getServer().addRecipe( recipe_purple_coral_block );


    ShapedRecipe recipe_red_coral_block = new ShapedRecipe( new ItemStack( Material.FIRE_CORAL_BLOCK ) );
    recipe_red_coral_block.shape("EE","EE");
    recipe_red_coral_block.setIngredient( 'E', Material.FIRE_CORAL );
    getServer().addRecipe( recipe_red_coral_block );


    ShapedRecipe recipe_yellow_coral_block = new ShapedRecipe( new ItemStack( Material.HORN_CORAL_BLOCK ) );
    recipe_yellow_coral_block.shape("EE","EE");
    recipe_yellow_coral_block.setIngredient( 'E', Material.HORN_CORAL );
    getServer().addRecipe( recipe_yellow_coral_block );

  }

}
