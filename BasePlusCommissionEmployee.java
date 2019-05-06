public class BasePlusCommissionEmployee extends CommissionEmployee
{
 private double baseSalary;

 public BasePlusCommissionEmployee (String firstName, String lastName, String socialSecurityNumber,
   double grossSales, double commissionRate, double baseSalary)
 {
  super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

  // check and set baseSalary
  if (baseSalary < 0.0)
   throw new IllegalArgumentException("Base salary must be >=0.0");

  this.baseSalary = baseSalary;
 }

 final public void setBaseSalary(double baseSalary)
 {
  // check and set baseSalary
  if (baseSalary < 0.0)
   throw new IllegalArgumentException("Base salary must be >= 0.0");

  this.baseSalary = baseSalary;
 }

 // accesor methods
 // accesor for baseSalary
 final public double getBaseSalary()
 {
  return baseSalary;
 }

//modifying earnings method with getPaymentAmount to place the class in the Payable Hierarchy as subclass of Employee class that implements Payable
 @Override
 final public double getPaymentAmount()
 {
  return baseSalary + super.getPaymentAmount(); //calculating paymentAmount with product of baseSalary and getting the payment amount from BasePlusComissionEmployee
 }

 // mutator methods
 // mutator for baseSalary
 
 // toString methods
 // default toString
 @Override
 final public String toString()
 {
  return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(),
    "base salary", getBaseSalary());
 }
}

    