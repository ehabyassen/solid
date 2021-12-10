package com.solid.isp.after;

/*
 * >>Interface Segregation Principle>>
 *
 * To apply the ISP, we need to solve the problem of the Interface with multiple methods drawing different types of shapes.
 * We can do so as following:
 * - Shape class loses its DrawStrategy data member, only the abstract draw method remains.
 * - introduce a DrawStrategy interface for each type.
 * - implement each interface with any strategy you want.
 * - each subtype of the base class has a data member of type -> relevant DrawStrategy interface, initialize it in the
 *   constructor.
 * - each subtype implements the draw method so that it forwards the draw call to the DrawStrategy.
 *
 *
 *                  [Shape]<-is a--[Square]<>------owns--------[DrawSquareStrategy]
 *                     ^                                        ^               ^
 *                    |is a                            realizes|               |realizes
 *                [Circle]                                  [ImplA]          [ImplB]
 *                   <>
 *                   |owns
 *         [DrawCircleStrategy]
 *           ^             ^
 *  realizes|             |realizes
 *      [ImplA]         [ImpleB]
 *
 *
 * - now introducing a new Shape can be done in isolation with 0 coupling with existing components. Try it out and
 *   introduce a new type.
 */