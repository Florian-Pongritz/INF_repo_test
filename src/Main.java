public class Main {
    public static void main(String[] args) {
        Employee em = new Employee("Pongritz", "Florian", "333", 3);
        em.printall();
        em.setSupervisorID("21213");
        em.setIncome(1000);
        em.IncreaseIncome(22);
        em.printall();
    }
}