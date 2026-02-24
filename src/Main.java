import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        // Initialize all data
        studentService.initializeStudents();
        studentService.removeLowGPA();
        studentService.findHighestGPA();
        studentService.insertAtIndex();

        appointmentService.initializeAppointments();
        appointmentService.cancelLast();
        appointmentService.showFirstAndLast();

        issueService.initializeIssues();
        issueService.showMostUrgent();
        issueService.resolveIssues();

        actionService.initializeActions();
        actionService.undoLastAction();
        actionService.addRequestedTranscript();
        actionService.showFirstAndLast();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== 🎓 Smart University Service System =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Appointments");
            System.out.println("3. Show Emergency Issues");
            System.out.println("4. Show Action History");
            System.out.println("5. Add New Issue");
            System.out.println("6. Undo Action");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentService.printStudents();
                    break;
                case 2:
                    appointmentService.printAppointments();
                    break;
                case 3:
                    issueService.printRemainingIssues();
                    break;
                case 4:
                    actionService.printHistory();
                    break;
                case 5:
                    System.out.print("Enter issue description: ");
                    scanner.nextLine();
                    String desc = scanner.nextLine();
                    System.out.print("Enter urgency level (1 = most urgent): ");
                    int urgency = scanner.nextInt();
                    scanner.nextLine();
                    issueService.addNewIssue(desc, urgency);
                    System.out.println("Issue added ✅");
                    break;
                case 6:
                    actionService.undoLastAction();
                    System.out.println("Last action undone ✅");
                    break;
                case 7:
                    System.out.println("Exiting... 👋");
                    break;
                default:
                    System.out.println("Invalid option ❌");
            }

        } while (choice != 7);

        scanner.close();
    }
}
