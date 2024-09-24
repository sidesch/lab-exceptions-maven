package edu.grinnell.csc207.main;

import edu.grinnell.csc207.util.Quadratic;
import edu.grinnell.csc207.util.IOUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    pen.println("Hi! I'm here to help you understand quadratic functions.");
    int a;
    int b;
    int c;

    a = IOUtils.readInt(pen, eyes, "Please enter a (the coefficient of the squared term):");
    b = IOUtils.readInt(pen, eyes, "Please enter b (the coefficient of the linear term) :");
    c = IOUtils.readInt(pen, eyes, "Please enter c (the constant):");

    Quadratic input = new Quadratic((double) a,  (double) b, (double) c);
    
    pen.println("the smaller root of" + input.toString() + " is " + input.smallerRoot());
    pen.println("Experimentally, " + input.toString(input.smallerRoot()) + " = " + input.evaluate(input.smallerRoot()));
    eyes.close();
    pen.close();
  } // main(String[])

} // QR
