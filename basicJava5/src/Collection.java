import java.util.ArrayList;

public class Collection {
    public static ArrayList<String> addEmployee(String name, String phone) {
        ArrayList<String> employee = new ArrayList<>();
        employee.add(name);
        employee.add(phone);
        return employee;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                a.add(i);
            }
        }
        System.out.println("==== ArrayList even numbers ====");
//        System.out.println(a);
        for (int i : a) {
            System.out.print(i + ", ");
        }

        System.out.println("\n==== Employee info ====");
        ArrayList<String> employee = addEmployee(
                "John Doe",
                "123-456-7890"
        );
        for (int i = 0; i < employee.size(); i++) {
            System.out.print(employee.get(i) + ", ");
        }
    }
}
