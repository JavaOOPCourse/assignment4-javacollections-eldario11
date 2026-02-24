package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        for (int i = 0; i < 4; i++) {
            actions.add("Action " + i);
        }
    }

    public void undoLastAction() {
        actions.pollLast();
    }

    public void addRequestedTranscript() {
        actions.add("Requested Transcript");
    }

    public void showFirstAndLast() {
        System.out.println(actions.getFirst());
        System.out.println(actions.getLast());
    }

    public void printHistory() {
        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
