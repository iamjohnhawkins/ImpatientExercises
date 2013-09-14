package ch5

import java.awt.Point;
/*
Define a object origin that extends java.awt.Point - why is this not a good idea.  Define a scala Point class with a companion
object that allows creation of Point(3,4) without use of new
 */
object Origin extends java.awt.Point {
}
