package com.jaxclipse.core;

/*
    This file is part of jaxclipsecore

    Foobar is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.IOException;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class jaxclipsecoreCommandExecutor implements CommandExecutor {

    private jaxclipsecore plugin;

    public jaxclipsecoreCommandExecutor(jaxclipsecore plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        plugin.getLogger().info("onCommand Reached in jaxclipsecore");

        if (command.getName().equalsIgnoreCase("jaxclipse_kit")) {
        	plugin.getLogger().info("jaxclipse_kit used");
            //do something
        	if (sender instanceof Player) {
        		
        		Player player = (Player) sender;
        		
        		ItemStack diamond = new ItemStack(Material.DIAMOND);
        		ItemStack bricks = new ItemStack(Material.BRICK);
        		bricks.setAmount(20);
        		
        		player.getInventory().addItem(bricks, diamond);
        		
        		
        	}
	    
	    
	    
            return true;
        }
        else 
        	
        	if (command.getName().equalsIgnoreCase("jaxclipse_ext")) {
        		
            	plugin.getLogger().info("jaxclipse_ext used");
            	if (sender instanceof Player) {
            		
            		Player player = (Player) sender;
            		
            		String mycommand = "/home/jcaldwell/test_link " ;
            		for (String s : args) {
            			mycommand += s + " ";
            		}
            		
            	
            		
            		try {
						Runtime.getRuntime().exec(mycommand);
					} catch (IOException e) {

						plugin.getLogger().severe(e.getMessage());
						//e.printStackTrace();
					}
            	}
            	
        		
        		
        		
        	}
        
        return false;
    }
}
