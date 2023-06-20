public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Riccardo", "Gucciardi", "Via Aldo Moro 5");
        Employee employee2 = new Employee("Michele", "Savoiardi", "Via Gucci Peralta 9");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
