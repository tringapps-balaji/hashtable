import java.util.Hashtable;
import java.util.Scanner;

class contact {
    long phone;
    String email;
contact (long phone,String email) {

    this.phone = phone;
    this.email = email;
}
public String toString(){
    return "  Phone NUmber : "+phone+"  "+" Email id: "+email;
}
}
class hashtable {
    public static void main (String []args) {
        int choice = 0;
        Hashtable<String, contact> hash = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to Contact List ");

        while (choice<=4) {
            System.out.println("\n 1. Add contact \n 2. Delete contact \n 3. Search Contact \n 4. Display contact ");
            System.out.println("Enter the choice : ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name : ");
                    String name = sc.next();
                    System.out.println("Enter the phone number : ");
                    long phone = sc.nextLong();
                    System.out.println("Enter email : ");
                    String email = sc.next();
                    contact obj = new contact(phone, email);
                    hash.put(name, obj);
                    break;

                case 2:
                    System.out.println("which contact to delete ? ");
                    name = sc.next();
                    if (hash.containsKey(name)) {
                        hash.remove(name);
                        System.out.println("The contact should be deleted");
                    } else {
                        System.out.println("Contacts not found");
                    }
                    break;

                case 3:
                    System.out.println("Enter the contact to search");
                    name = sc.next();
                    if (hash.containsKey(name)) {
                        System.out.println("contacts found");
                        System.out.println("Name : " + name + "  " + hash.get(name));
                    } else {
                        System.out.println("contacts not found");
                    }
                    break;

                case 4:
                    System.out.println("Final hashtable is : " +hash);
                    break;
            }
        }
    }
}
