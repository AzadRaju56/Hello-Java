package displayNames;

import java.util.Scanner;

/**
 *
 * @author Md Abul kalam azad raju 20183290262 <akazadraju56 at outlook.com>
 */
public class MethodTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CustomerBiz customer = new CustomerBiz();
        Scanner input = new Scanner(System.in);
        System.out.print("How many customer's name do you want to add: ");
        int size = input.nextInt();
        //System.out.print("Enter customer's name: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the name of customer" + (i + 1) + ": ");
            String name1 = input.next();
            customer.addName(name1);
        }

        customer.showNames();

        System.out.print("Search a customer's name: ");
        String oldName = input.next();
        customer.searchName(oldName);

        System.out.print("Do you want to change the name (y/n): ");
        String change = input.next();
        if (change.equals("y")) {
            System.out.print("Enter customer's new name: ");
            String newName = input.next();
            customer.changeName(oldName, newName);
        }
        customer.showNames();
    }

}
