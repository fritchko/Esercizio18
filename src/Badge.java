import java.util.Random;
import java.util.UUID;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode(){
        String fullName = employee.getName() + employee.getSurname();
        String randomString1 = UUID.randomUUID().toString().replace("-", "").substring(0,3);
        String randomString2 = UUID.randomUUID().toString().replace("-", "").substring(0,3);

        return randomString1 + fullName + randomString2;
    }

    public void showBadgeDetails(){
        System.out.println("The total number of employees is: " + totalNumberOfEmployees + "\n" +
                "The employee's details are: \n" + employee.getEmployeeDetails() + "\n" +
                "The employee's badge is: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }




}
