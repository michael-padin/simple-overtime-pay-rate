import java.util.Scanner;

public class Main {
    String name;
    int hoursWorkForTheWeek, hoursAbsent;
    double overtimePayRate;

    public Main(String name,int hoursWorkForTheWeek, int hoursAbsent, double overtimePayRate){
        this.name = name;
        this.hoursWorkForTheWeek = hoursWorkForTheWeek;
        this.hoursAbsent = hoursAbsent;
        this.overtimePayRate = overtimePayRate;
    }

    static double rate(int totalHours) {
        if (totalHours >= 90) {
            return  0.2;
        } else if (totalHours >= 75) {
            return 0.15;
        } else if (totalHours >= 68){
            return 0.1;
        } else if (totalHours >= 56){
            return 0.05;
        } else {
            return 0;
        }
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Employee name: ");
        String name = scan.nextLine();
        System.out.println("Number of hours work per week: ");
        int hoursWork = scan.nextInt();
        System.out.println("Enter hours absent: ");
        int hoursAbsent = scan.nextInt();
        double rate = rate(hoursWork - hoursAbsent);

        Main employee = new Main(name, hoursWork, hoursAbsent, rate);
        System.out.println("____________________________________________");
        System.out.println("Name: " + employee.name );
        System.out.println("Hours work per week: " + employee.hoursWorkForTheWeek );
        System.out.println("Hours absent: " + employee.hoursAbsent );
        System.out.println("Overtime pay rate: " + employee.overtimePayRate);
    }
}
