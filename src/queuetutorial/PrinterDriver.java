package queuetutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrinterDriver {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("books.txt");
        Printer printer = new Printer();
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            String printPend = read.nextLine();
            String[] print = (printPend.split("\t"));
            if (print[0].equals("Add")) {
                printer.addJob(print[1].trim(), Integer.parseInt(print[2].trim()));
            } else if (print[0].equals("Print")) {
                printer.printJob(Integer.parseInt(print[1].trim()));
            } else {
                System.out.println("Invalid pattern.");
            }
        }
        System.out.println("Print Summary");
        System.out.printf("%d/%d jobs and ", printer.numberOfJobsCompleted, printer.numberOfJobs);
        System.out.printf("%d/%d pages printed in ", printer.numberOfPagesCompleted, printer.numberOfPages);
        System.out.printf("%.1f minutes.\n", printer.printJob(0));
    }
}
