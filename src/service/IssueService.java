package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("Failed Exam Appeal", 1));
        issues.add(new Issue("Missing Grades", 2));
        issues.add(new Issue("Schedule Conflict", 3));
        issues.add(new Issue("Late Registration", 4));
        issues.add(new Issue("Library Fine", 5));
    }

    public void showMostUrgent() {
        System.out.println("Most urgent: " + issues.peek());
    }

    public void resolveIssues() {
        System.out.println("Resolved: " + issues.poll());
        System.out.println("Resolved: " + issues.poll());
    }

    public void printRemainingIssues() {
        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
    }
}
