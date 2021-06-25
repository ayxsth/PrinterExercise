# Simple Printer Exercise
This is a simple printer exercise developed using Queue and LinkedList which performs as a real Printer.

## Question
Create a class called Printer and a class called Job that will simulate a computer printer. The printer should store a queue of Job objects until they are printed. Each Job should consist of a title and the number of pages the job contains. The printer should also store the number of jobs it can print per minute. The class should include methods to add jobs and print jobs. The method that prints a job should return the amount of time it took to print the job.

Create a driver program that processes an input file that contains one of two directions on each line. The directions
are: 

- Add Title # Pages – Add the specified Job to the printer
- Print n – Print the specified number of jobs

An example input file might look like the following:

  ```
  Add Wikipedia: Java 5
  Add ACM article: Optimizing Interpreted Languages 7
  Print 1
  Add Slashdot: News for nerds, stuff that matters  12
  Add Webmail Message 1
  Print 3
  Add Homework.doc  4
  Add Study_Guide.pdf 3
  Print 2
  ...
  ```

Each instruction is on a separate line and each token of each instruction is separated by a single tab character. Each time a job is printed, determine how long it would take to print the job and keep track of how much time has been spent printing all together. When the whole file has been processed, print a summary that includes the total number of jobs and pages printed and the total amount of time spent printing.

## Sample Output
  ```
  Printing: Wikipedia: Java
  Number of Pages: 5

  Printing: ACM article: Optimizing Interpreted Languages
  Number of Pages: 7

  Printing: Slashdot: News for nerds, stuff that matters
  Number of Pages: 12

  Printing: Webmail Message 
  Number of Pages: 1

  Printing: Homework.doc
  Number of Pages: 4

  Printing: Study_Guide.pdf
  Number of Pages: 3

  Print Summary
  6 jobs and 32 pages printed in 6.4 minutes.
  ```

## Proposed Solution
- Read the content from the file and split it taking tab as parameter.
- Add or print the job according to the instruction.
- Display the summary of printing.

## Running the project

- Clone the repository

  ``git clone https://github.com/ayxsth/PrinterExercise.git``
- Open the IDE
- Go to the **Open Project** section
- Run the project