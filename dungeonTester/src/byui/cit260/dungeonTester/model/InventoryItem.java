/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dungeonTester.model;

/**
 *
 * @author Meez
 */
public class InventoryItem {
    
    public enum Item {
        potion,
        key,
        sword,
        dagger,
        shield;
    }
    
    public static InventoryItem[] createInventoryList() {
       InventoryItem[] inventory = 
               new InventoryItem[Constants.5];
        
        InventoryItem potion = new InventoryItem();
        potion.setDescription("A healing potion.");
        potion.setQuantityOwned(0);
        potion.setQuantityRequired(0);
        inventory[Item.potion.ordinal()] = potion;
        
        InventoryItem key = new InventoryItem();
        key.setDescription("A key used to unlock a door.");
        key.setQuantityOwned(0);
        key.setQuantityRequired(1);
        inventory[Item.key.ordinal()] = key;
        
        InventoryItem sword = new InventoryItem();
        sword.setDescription("Slightly longer, still pointy.");
        sword.setQuantityOwned(0);
        sword.setQuantityRequired(0);
        inventory[Item.sword.ordinal()] = sword;
        
        InventoryItem dagger = new InventoryItem();
        dagger.setDescription("Small but pointy.");
        dagger.setQuantityOwned(1);
        dagger.setQuantityRequired(0);
        inventory[Item.dagger.ordinal()] = dagger;
        
        InventoryItem shield = new InventoryItem();
        shield.setDescription("It'll probably protect you.");
        shield.setQuantityOwned(0);
        shield.setQuantityRequired(0);
        inventory[Item.shield.ordinal()] = shield;
        
        return inventory;
        
    }

    private void setDescription(String a_healing_potion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuantityOwned(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuantityRequired(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
