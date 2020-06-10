/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayNames;

/**
 *
 * @author Abul kalam azad raju 20183290262 <akazadraju56 at outlook.com>
 */
class CustomerBiz {

    String[] names = new String[30];

    public void addName(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public void showNames() {
        System.out.println("\n******************************");
        System.out.println("Customer's name list");
        System.out.println("******************************");
        for (String name : names) {
            if (name != null) {
                System.out.print(name + "\t");
            }
        }
        System.out.println("");
    }

    public void searchName(String oldName) {
        for (String name : names) {
            if (name.equals(oldName)) {
                System.out.println("You can change the name.");
                break;
            } else {
                System.out.println("Not find!");
            }
        }
    }

    public void changeName(String oldName, String newName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(oldName)) {
                names[i] = newName;
                break;
            }
        }
    }
}
