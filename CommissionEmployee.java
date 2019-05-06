
public class CommissionEmployee extends Employee
{
 private double grossSales;
 private double commissionRate;

 public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
   double grossSales, double commissionRate)
 {
  super(firstName, lastName, socialSecurityNumber);
  // validate and assign gross sales
  if (grossSales < 0.0)
   throw new IllegalArgumentException("Gross sales must be positive or zero.");

  // validate and assign commissionRate
  if(commissionRate <= 0.0 || commissionRate >= 1.0)
   throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0.");

  this.grossSales = grossSales;
  this.commissionRate = commissionRate;
 }
final public void setGrossSales(double grossSales)
 {
  if (grossSales < 0.0)
   throw new IllegalArgumentException("Gross sales must be positive or zero.");

  this.grossSales = grossSales;
 }
 // accesor methods
 // accesor for firstName

 // accesor for grossSales
 final public double getGrossSales()
 {
  return grossSales;
 }

 // accesor for commissionRate
 final public double getCommissionRate()
 {
  return commissionRate;
 }

 // mutator methods
 // mutator for grossSales
 

 // mutator for commissionRate
 final public void setCommissionRate(double commissionRate)
 {
  // validate and assign commissionRate
  if(commissionRate <= 0.0 || commissionRate >= 1.0)
   throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0.");

  this.commissionRate = commissionRate;
 }

 @Override ////replacing earnings method with getPaymentAmount to place the class in the Payable Hierarchy as subclass of Employee class that implements Payable
 public double getPaymentAmount()
 {
  return getGrossSales() * getCommissionRate(); //calculates comission employee payment amount by prodict of groossales and comission rate
 }

 // tostring methods
 @Override
 public String toString()
 {
  return String.format("%s %s%n%s: %,.2f%n%s: %,.2f",
    "commission", super.toString(),
    "gross sales", getGrossSales(),
    "commission rate", getCommissionRate());
 }
}

    