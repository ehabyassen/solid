package com.solid.lsp;

public class CappuccinoMaker extends CoffeeMaker {

    @Override
    Coffee makeCoffe(int sugarCubes) {
        return new Cappuccino(sugarCubes);
    }
}
