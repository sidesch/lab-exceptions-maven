package edu.grinnell.csc207.util;

/**
 * Quadratic expressions (of the form ax^2 + bx + c).
 *
 * @author Samuel A. Rebelsky
 * @author YOUR NAME HERE
 * @author YOUR NAME HERE
 */
public class Quadratic {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The coefficient of the x^2 component.
   */
  double a;

  /**
   * The coefficient of the x component.
   */
  double b;

  /**
   * The constant.
   */
  double c;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new quadratic.
   *
   * @param squared
   *   The coefficient of the squared term.
   * @param linear
   *   The coefficient of the linear term.
   * @param constant
   *   The constant.
   */
  public Quadratic(double squared, double linear, double constant) {
    this.a = squared;
    this.b = linear;
    this.c = constant;
  } // Quadratic(double, double, double)

  // +------------------+--------------------------------------------
  // | Standard Methods |
  // +------------------+

  /**
   * Convert to a string.
   *
   * @return the function as a string
   */
  public String toString() {
    return String.format("%fx^2 + %fx + %f", a, b, c);
  } // toString()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Build a string that shows the expression with a particular value.
   *
   * @param val
   *   The value we incorporate in the expression.
   *
   * @return the expression as a string
   */
  public String toString(double val) {
    return String.format("%f*%f^2 + %f*%f + %f", a, val, b, val, c);
  } // toString(double)

  /**
   * Evaluate the quadratic on a value.
   *
   * @param x
   *   The value on which to evaluate the quadratic.
   *
   * @return the value
   */
  public double evaluate(double x) {
    return this.a * x * x + this.b * x + this.c;
  } // evaluate(double)

  /**
   * Find the smaller of the two roots.
   *
   * @return the smaller of the two roots (or the only root, if there
   *   is only one).
   */
  public double smallerRoot() {
    double sqrt = Math.sqrt(this.b*this.b - 4*this.c*this.a);
    return ((0-b -sqrt)/(this.a*2));
  } // smallerRoot

  /**
   * Find the larger of the two roots.
   *
   * @return the larger of the two roots (or the only root, if there
   *   is only one).
   */
  public double largerRoot() {
    return 0; // STUB
  } // largerRoot
} // class Quadratic
