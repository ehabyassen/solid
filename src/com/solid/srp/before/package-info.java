package com.solid.srp.before;

/*
 * >>Single Responsibility Principle>>
 *
 * It aims to:
 * - Increase Cohesion by designing components that are self-contained [Independent, with a single and well-defined purpose].
 * - Decrease Coupling which is the enemy of change because it links together things that does not strictly belong together.
 *
 * When (Cohesion is increased) and (Coupling is decreased), making (changes in isolation becomes easier).
 *
 * Cohesion relates to the purpose of the unit "module, class or a method". Things that strongly belong together in the unit.
 *
 * How to check if a class/module is highly coupled?
 * 1- check for dependencies in a class/module.
 * 2- draw a dependency graph between the components.
 * 3- assumes some dependencies change "replaced or altered i.e class methods are changed".
 * 4- apply the changes.
 * 5- check if the implementation details must be changed because of these changes and if change in isolation is easy.
 *======================================================================================================================
 *======================================================================================================================
 * An example: a library that calculates the overlapping of Geometrics has a Circle class with:
 * - data members
 * - getters and setters
 * - functionalities: translate(x, y) - rotate(double angle) - draw(Screen s) - draw(Printer p) - serialize(Serializer b)
 *
 * The circle class will change if:
 * - basic properties of the circle are changed.
 * - the Screen class is changed -> draw function might be adapted if so.
 * - the Printer class is changed -> draw function might be adapted.       => Circle class needs to recompile if one of these classes is changed.
 * - the Serializer class is changed -> serialize function might be adapted.
 * - if the implementation details of draw() method needs to be changed. i.e. to use a new drawing library.
 * - if the implementation details of serialize() method need to be changed.
 *
 * This means, the Circle class can be changed for many unrelated reasons.
 *
 * Looking at the dependency graph and assuming more Shapes in the library, we can see that each shape Class will depend
 * on "Screen", "Printer" and "Serializer" and the Overlap class depends on the Shapes classes and therefore depends on
 * "Screen", "Printer" and "Serializer" as well even it has nothing to do with them.
 * The classes are highly coupled and the Circle class in this state is not highly coherent because it contains stuff
 * that can be separated and do not belong to the unit "Circle".
 *
 * This can be solved by restructuring the components in the dependency graph in modules that suite their purpose. Go to
 * package-info.java of the package "after".
 */
