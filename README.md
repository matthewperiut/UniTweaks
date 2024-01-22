# UniTweaks
[![wakatime](https://wakatime.com/badge/user/38aa5505-b4f7-4c8d-849e-7c33caecee59/project/018cfcb9-ebf8-4fea-b92d-62b38b8ed951.svg)](https://wakatime.com/badge/user/38aa5505-b4f7-4c8d-849e-7c33caecee59/project/018cfcb9-ebf8-4fea-b92d-62b38b8ed951)

![modrinth](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg)
![java17](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/built-with/java17_vector.svg)
![fabric](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/supported/fabric_vector.svg)
![risugamis-modloader](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/unsupported/risugamis-modloader_vector.svg)


## Tweaks
#### **All Tweaks can be toggled unless specified**
### General
* Show Quit Button on the Main Menu
* FOV Slider with proper hand adjustment
* Fog Density Slider
* Improved Controls Menu
* Packet Speedup Patch - Removes an artificial delay when processing packets (upto 392ms for sending an action and receiving a response) ***non-configurable***

### Gameplay
* No Food Wastage - Prevents you from eating when your health is already full
* Step Assist - Allows you to step up one block
* Pick Block from Inventory -- Allow picking blocks from inventory

### Tweaks
* Sugar Cane can be placed on sand (from Beta 1.8)
* Boats drop themselves when broken by a player 
* Fences placeable like normal - lifted restrictions on the block below having to be solid or fence
* Fences connect to blocks
* Bookshelves drop 3 books
* Allow placing pressure plates on fences
* Better boat handling

### Old Features
* Disable Dead Bush Generation
* Disable Tall Grass Generation
* Punch TNT to light it
* Punch Sheep for wool

### Recipes
* Tool Repair recipes
* More Furnace Fuels
<details>
    <summary>Modern Recipes</summary>

* Shapeless Flint and Steel
* Shalepess Mushroom Stew
* Shapeless Chest Minecart
* Shapeless Furnace Minecart
* Shapeless Sticky Piston
* Books Require Leather
* Wool Redyeing
* 6 Slabs per Craft
* Button requires 1 stone
* Modern Fence Recipe
* Snow Layer Recipe
* 3 Ladder per Craft
</details>

<details>
    <summary>Tweaked Recipes</summary>

* Shapeless Jack o' Lantern
* Adjustable Stairs per Craft
</details>

<details>
    <summary>Obtainable Recipes</summary>

* Craftable Grass Blocks
* Craftable Cobwebs
* Craftable Fire
* Craftable Coal Ore
* Craftable Iron Ore
* Craftable Gold Ore
* Craftable Lapis Ore
* Craftable Diamond Ore
</details>

## Bugfixes
#### **All Bugfixes can be toggled unless specified**
* Bit Depth Fix - Fixes Z-Fighting on AMD graphic cards
* Slime Split Fix - Fixes slimes not splitting when their health is below zero after dying
* Stairs Drop Fix - Stairs now drop themselves
* Boat Dismount Fix - Fixes sometimes falling through the boat when dismounting it
* Block Effectiveness Fix - Fixes axes and pickaxes not being effective on various blocks
  * Axe : Crafting Table, Wooden Slab, Wooden Stairs, Fence, Wooden Door, Ladder, Sign, Pumpkin, Jack o' Latern, Wooden Pressure Plate, Jukebox and Noteblock
  * Pickaxe : Furnace, Cobblestone Stairs, Bricks, Redstone Ore, Iron Door, Rails, Dispenser, Stone Pressure Plates and Spawner
* Pig Drop Saddle Fix - Fixes saddled pig not dropping saddle on death
* Multiplayer Entity Physics Fix - Fixes jittering caused by client interpolation ***non-configurable***
* Fence Bounding Box Fix - Fence's bounding box now better reflect its current shape
* Pick Block Fix - Fixes some blocks not being pickable using Pick Block
* Spring Propagation Fix - Fixes water source blocks not forming when a block below is water
