/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor5;

/**
 *
 * @author mufqi
 */
// ****************************************************************************
// Warning.java
//
// Reads student data from a text file and writes data to another text file.
// ****************************************************************************
import java.util.Scanner;
import java.io.*;
public class Warning {
    // --------------------------------------------------------------------
    // Reads student data (name, semester hours, quality points) from a
    // text file, computes the GPA, then writes data to another file
    // if the student is placed on academic warning.
    // --------------------------------------------------------------------
    public static void main (String[] args) {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String line, name, inputName = "students.dat";
        String outputName = "warning.dat";
        try {
            // Set up scanner to input file
            File file = new File(inputName);
            Scanner scan = new Scanner(file);
            // Set up the output file stream
            PrintWriter outFile = new PrintWriter(new File(outputName));
            // Print a header to the output file
            outFile.println ();
            outFile.println ("Students on Academic Warning");
            outFile.println ();
            // Process the input file, one token at a time

            while (scan.hasNext()) {
                // Get the credit hours and quality points and
                // determine if the student is on warning. If so,
                // write the student data to the output file.
                name = scan.next();
                creditHrs = scan.nextInt();
                qualityPts = scan.nextDouble();
                gpa = qualityPts/(double)creditHrs;
                if(creditHrs<30&&gpa<1.5){
                    outFile.write(name + " " + creditHrs + " " + gpa);
                    outFile.println();
                }
                else{
                    if(creditHrs<60&&gpa<1.75){
                        outFile.write(name + " " + creditHrs + " " + gpa);
                        outFile.println();
                    }
                    else{
                        if(gpa<2.0){
                            outFile.write(name + " " + creditHrs + " " + gpa);
                            outFile.println();
                        }
                    }
                }
            }
            // Close output file
            outFile.close();
        }
        catch (FileNotFoundException exception) {
            System.out.println ("The file " + inputName + " was not found.");
        }
        catch (IOException exception) {
            System.out.println (exception);
        }
        catch (NumberFormatException e) {
            System.out.println ("Format error in input file: " + e);
        }
    }
} 
