package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Normal Appointment 1");
        appointments.add("Normal Appointment 2");
        appointments.add("Normal Appointment 3");
        appointments.addFirst("Urgent Appointment");
    }

    public void cancelLast() {
        appointments.removeLast();
    }

    public void showFirstAndLast() {
        System.out.println(appointments.getFirst());
        System.out.println(appointments.getLast());
    }

    public void printAppointments() {
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
