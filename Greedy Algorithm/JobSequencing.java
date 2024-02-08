import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    public static class Jobs {
        int id,deadline, profit;

        public Jobs(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int[][] jobsInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Jobs> jobs = new ArrayList<>();

        // Creating object of every job
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Jobs(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sorting every job according to the profit
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);


        int time = 0;
        ArrayList<Integer> jobsCanAttempt = new ArrayList<>();

        for (int i = 0; i<jobs.size(); i++){
            Jobs currentJob = jobs.get(i);
            if (currentJob.deadline > time){ // If time < current job's deadline then we can attempt it.
                time++;
                jobsCanAttempt.add(currentJob.id);
            }
        }

        System.out.println(jobsCanAttempt);

    }
}
