package com.solid.srp.after;

/*
 * >>Single Responsibility Principle>>
 *
 * Let's restructure the dependency graph to high level modules and low level components:
 * - Overlap: knows only about class Circle
 * - Printing: knows about classes Circle, Printer
 * - Drawing: knows about classes Circle, Screen
 * - Serialization: knows about classes Circle, Serializer
 *
 * P.S.Assume that the adjacent packages are the high level and low level modules:
 * - each module depends only on the dependencies it needs.
 * - the Circle class does not have dependency on the Screen, Printer or Serializer anymore and is only concerned about
 *   Circle properties and basic Geometric functions i.e. translate and rotate.
 * - the Overlap calculator module doesn't have dependency on Screen, Printer or Serializer anymore.
 *
 * Now the coupling between different module/components is much lower and cohesion 'purpose' of every module has increased
 * and this makes changes in isolation much easier.
 */
