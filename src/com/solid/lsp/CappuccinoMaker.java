package com.solid.lsp;

public class CappuccinoMaker extends CoffeeMaker {

    @Override
    Cappuccino makeCoffe(int sugarCubes) {
        return new Cappuccino(sugarCubes);
    }
}
