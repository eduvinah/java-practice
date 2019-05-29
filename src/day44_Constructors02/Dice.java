package day44_Constructors02;

import java.util.ArrayList;
import java.util.List;

public class Dice {

	public static void main(String[] args) {

		Job job1 = new Job();
		Job job2 = new Job("Java Dev");
		Job job3 = new Job("SDET", "Amazon", 13000.0);

		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());

		// create a list of jobs
		// add 5 different jobs, with company, salary, title

		List<Job> jobList = new ArrayList<>();
		jobList.add(job3);
		jobList.add(new Job("Scrum master", "Google", 130000));
		jobList.add(new Job("SDET", "FreddieMac", 115000));
		jobList.add(new Job("BA", "Leidos", 98000));
		jobList.add(new Job("Senior QA Tester", "Delta", 120000));

		System.out.println(jobList.toString());

		// find the highest paying job and print toString for that
		double max = 0;
		for (Job s : jobList) {
			if (s.getAnnualSalary() > max) {
				max = s.getAnnualSalary();
				
				/*
				 * for(int i=0; i<jobsList.size(); i++)
				 * if(JobsList.get(i).getAnnualSalary()> maxSalar{
				 * maxSalary = jobsList.get(i).getAnnualSalary();
				 * highestIndex = i;
				 * print after the 2nd loop
				 * Job bestJob = jobsList.get(i).getAnnualSalary();
				 */
			}
		}
		System.out.println("Highest Salary " + max);
	}

}
