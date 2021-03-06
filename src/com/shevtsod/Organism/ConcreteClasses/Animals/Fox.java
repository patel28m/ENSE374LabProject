package com.shevtsod.Organism.ConcreteClasses.Animals;


import com.shevtsod.Organism.Animal.Carnivore;
import com.shevtsod.Organism.TypeOrganism;

/**
 * <p>
 *     A Fox for the animal habitat simulator.
 * </p>
 *
 * @author Daniel Shevtsov
 */
public class Fox extends Carnivore {
    /**
     * Constructor for Fox - initializes member variables.
     * @param posX initial x coordinate
     * @param posY initial y coordinate
     */
    public Fox(int posX, int posY) {
        super(posX, posY);
        organism = TypeOrganism.Fox;

        //The parameters below can be changed to different integer values.
        /*
        this.speed = 3;
        this.maxHunger = 5;
        */
    }

    /**
     * Check whether this Organism eats the passed in targetOrganism
     * @param targetOrganism the Organism to check against this Organism
     * @return true if this Organism can eat the targetOrganism, false otherwise.
     */
    public boolean eats(TypeOrganism targetOrganism) {
        switch(targetOrganism) {
            case Squirrel:
            case Rabbit:
            case Bluejay:
            case Mouse:
                return true;
            default:
                return false;
        }
    }
}
