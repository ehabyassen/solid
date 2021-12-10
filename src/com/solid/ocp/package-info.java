package com.solid.ocp;

/*
 * >>Open-Closed Principle>>
 *
 * "Software artifacts (classes, modules, functions, etc.) should be open for extension, but closed for modification."
*                                                                                                     ~ Bertrand Meyer
*
* This means that while designing software components, we should design them to be extensible. So, adding new
* functionality can be done by extending existing classes, not changing existing ones.
*
* Applying this on the Shapes example, we will try to add new function and new type to existing software. There are two
* approaches to do this:
*
* 1- Procedural Approach:
* -----------------------
* We want to design a module for Shapes with the following functions 'translate, rotate, draw'. To do so we can:
* - introduce an enum for the shape types and add our shapes to it.
* - introduce a base type "Shape" with a member field "ShapeType" which is initialized in the constructor.
* - make the Shape class abstract and declare both translate and rotate.
* - introduce a Circle class that inherits from "Shape" and pass the ShapeType "circle" to initialize the parent type.
* - do the same and introduce a Square class.
* - both Circle and Square must implement both translate and rotate.
* - extract the draw function 'using free functions approach' to a drawing module in order not to couple the drawing to
*   the Circle or Square types.
* - the free function "draw" receives a collection of shapes, checks the type of each shape and calls the relative draw
*   "draw" function.
*
* This approach satisfies the OCP in terms of adding new functions because we can extend the existing type with more
* custom/specific types, add new functions to them and use the free functions approach to call them where we need.
*
* However, it fails when it comes to adding new types because in order to add a new type we have to:
* - change the enum and add a new ShapeType i.e. triangle. This affects existing types classes "Circle" and "Square"
*   because both are aware of the ShapeType, and they need to recompile.
* - also, any place that switch between existing shapes needs to be adapted to handle the new shape. This can be a lot
*   of places.
*
* This makes change to add a new type very hard and expensive.
*
* ======================================================================================================================
* ======================================================================================================================
*
* 2- Object-oriented Approach:
* ----------------------------
* We can solve the problem of adding a new type by following this approach and do the following:
* - introduce an abstract base class Shape with abstract functionalities -> translate, rotate and draw.
* - inherit from this class and add our shapes and implement the abstract methods from Shape.
* - the free function "draw" becomes much simpler because it doesn't have to check for the type to call the corresponding
*   method and therefore adding a new type can be done without any changes to the free function "draw".
*
* TODO: clarify why the OO approach violates the SRP with the draw method being inside the Shapes.
*       clarify why the Procedural approach does not have the prev. problem or why it was not mentioned.
 */