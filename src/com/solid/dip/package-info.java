package com.solid.dip;

/*
 * >>Dependency Inversion Principle>>
 *
 * States that flexible systems are systems in which; source code dependencies refer to abstraction not to concretions.
 *
 * For this, there are 2 rules:
 * - High level modules should not depend on low level modules. Both should depend on Abstraction.
 * - Abstractions should not depend on details. Details should depend on "meet the specification of" abstractions.
 *
 * High level modules are modules that are near to the heart of the application where we don't want to change too much.
 * Low level modules are those that can be changed easily.
 *
 * To satisfy this:
 * 1- add abstraction layer 'interfaces' to the high level modules so that high level modules own them.
 * 2- add concretions 'implementations of these interfaces' to the low level modules. So now the low level modules
 *    depend on the high level modules and must satisfy the contracts own by the high level modules.
 *
 * Look at the attached graphs in the package:
 * - The high level module Circle "where we don't change too often because circle attributes are usually fixed"
 *   depends on the low level module Drawing "where we can apply changes often if a new drawing library to be used".
 *   So it might be changed if that module is changed.
 * - To solve this we need to do 2 steps:
 *      1- Introduce an abstraction layer. An interface. Now the Circle class does not depend on the implementation
 *         details of drawing a circle, it depends on the abstraction "drawing circle interface".
 *      2- Move the abstraction layer "the interface" to the high level module where the Circle class is. Now the low
 *         level module of drawing depends on the abstraction layer owned by the high level module class Circle. Circle
 *         can change this interface any time and the implementation details in the low level module must satisfy this
 *         interface.
 *
 * To explain the graphs:
 * 1- Geometry module depends on Drawing module.
 * 2- High level module depends on the implementation details of low level module.
 * 3- Implementation details of low level module depends on an interface.
 * 4- The dependency inversion is locally in the low level module. But the arrow still points from high-level to low-level.
 * 5- The interface is moved to the high-level module and the arrow is inverted so that low-level module depends on
 *    high level module.
 */