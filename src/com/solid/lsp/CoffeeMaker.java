package com.solid.lsp;

public class CoffeeMaker {

    Coffee makeCoffe(int sugarCubes) {
        return new Coffee(sugarCubes);
    }
}
