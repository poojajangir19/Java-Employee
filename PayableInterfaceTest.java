
public class PayableInterfaceTest //class to test the functionalities of other classes like Payable, Employee, and all the subclasses of Employees
{
public static void main(String[] args)
 {
  Payable[] payableObjects = new Payable[6];
  payableObjects[0] = new Invoice("01234", "seat", 2, 375.00); //making new object of Invoice class by processing polymerphically
  payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);  //making new object of Invoice class by processing polymerphically
  payableObjects[2] = new SalariedEmployee("David", "Smith", "111-11-1111",1000); //passing values through new object of SalariedEmployee class by processing polymerphically
  payableObjects[3] = new HourlyEmployee("Pankaj", "Kumar", "222-22-2222", 20.25, 50); //passing values through new object of HourlyEmployee class by processing polymerphically
  payableObjects[4] = new CommissionEmployee("Sevantika", "Jangir", "333-33-3333", 20000, .05); //passing values through new object of ComissionEmployee class by processing polymerphically
  payableObjects[5] = new BasePlusCommissionEmployee("Kamla", "devi", "444-44-4444", 3000, .10, 500); //passing values through new object of BasePlusComissionEmployee class by processing polymerphically
  System.out.println("Invoices and Employees processed polymorphically:"); 

  for (Payable currentPayable : payableObjects) //printing each payableObject in the array
  {
   System.out.printf("%n%s %n",currentPayable); //invokes toString
   if (currentPayable instanceof BasePlusCommissionEmployee) //determines whether element is a BasePlusComissonEmployee
   {
    Employee employee = (Employee) currentPayable; //processing eeach element in array employees
    BasePlusCommissionEmployee basePlus = (BasePlusCommissionEmployee) employee; //downcast employee reference to BasePlusComission Employee
    basePlus.setBaseSalary(1.10 * basePlus.getBaseSalary());
    System.out.printf("new base salary with 10%% increase is: $%,.2f%n", basePlus.getBaseSalary()); //new base salary with 10% inclrease
    }
    System.out.printf("%s: $%,.2f%n","payment due",currentPayable.getPaymentAmount()); //payable amount for each payable object
   }
   System.out.println();   //get type name of each object in payableObjects array
   for (int j = 1; j < payableObjects.length; j++)         
   System.out.printf("PayableObject %d is a %s%n", j,       payableObjects[j].getClass().getName()); 
  }
 }

    