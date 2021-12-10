package com.solid.isp.before;

/*
 * >>Interface Segregation Principle>>
 *
 * It is a special case of the Single Responsibility Principle. It states that Clients should not depend on methods
 * they do not need and that many client-specific interfaces are better than one general purpose interface.
 *
 * Example: applying the strategy design pattern to the Shapes example:
 * - start with an abstract base class Shape with an abstract method "draw" which draws a shape by delegating to an
 *   Interface "DrawStrategy" that is owned by the Shape class and initialized in its constructor "dependency injection".
 *
 *
 * [Shape]<>---owns--[DrawStrategy]
 *                    ^          ^
 *           realizes|          | realizes
 *         [DrawStrategyA]  [DrawStrategyB]
 *
 *
 * - The DrawStrategy interface has a draw method for each existing type "Circle", "Square".
 * - The DrawStrategy interface has multiple implementations A, B, etc... each of them implements all the method of that
 *   interface.
 * - Circle and Square have constructors that initialize their data members including the DrawStrategy member from the
 *   base class Shape.
 * - each has a draw method which calls the draw method on the DrawStrategy member field and passes a reference to itself.
 *
 * - The problem here is that if we want to add a new type "Triangle", we need to declare a new method in DrawStrategy
 *   to draw a Triangle and both existing Circle and Square must recompile because the interface is used there.
 *   This means that there is coupling between the Shapes classes and the DrawStrategy interface. *
 */