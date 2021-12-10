package com.solid.lsp;

/*
 * >>Liskuv Substitution Principle>>
 *
 * A principle states that:
 *  - Sub-types must be substitutable for their base types.
 *  - Child class must be able to do everything its parent class can do.
 *  - It must be able to process the same requests and deliver the same result or a result which is a subtype of the
 *    result the parent class returns.
 *
 * Subtyping here is a "Behavioral" subtyping -> "IS-A" relationship.
 *
 * Guidelines of this principle are:
 *  - adhere to the "IS-A" relationship when subtyping. Rectangle is not a Square. Square is not a Rectangle. Both are Shape.
 *  - make sure inheritance is about behaviour not data.
 *  - adhere to the contract of the base type.
 *
 * In the example, CoffeeMaker can make Coffee, CappuccinoMaker can make Cappuccino which is a Sub-type of Coffee.
 * -> CappuccinoMaker can substitute CoffeeMaker.
 */