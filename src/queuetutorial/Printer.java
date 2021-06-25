package queuetutorial;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

    static Queue<Job> queue = new LinkedList<>();
    int numberOfJobs, numberOfPages, numberOfJobsCompleted, numberOfPagesCompleted;
    private double timeTaken;
    final private double jobsPerMin;

    public Printer() {
        this.timeTaken = 0.0;
        this.numberOfJobs = 0;
        this.numberOfPages = 0;
        this.jobsPerMin = 4.5;
        this.numberOfJobsCompleted = 0;
        this.numberOfPagesCompleted = 0;
    }

    public void addJob(String title, int pages) {
        queue.add(new Job(title, pages));
        numberOfJobs++;
        numberOfPages += pages;
    }

    public double printJob(int number) {
        for (int i = 0; i < number; i++) {
            if (queue.peek() != null) {
                Job job = queue.remove();
                System.out.println("Printing: " + job.getTitle());
                System.out.println("Number of Pages: " + job.getPages() + "\n");
                numberOfJobsCompleted++;
                numberOfPagesCompleted += job.getPages();
                timeTaken += (double) numberOfJobsCompleted / jobsPerMin;
            }
        }
        return timeTaken;
    }
   
}
