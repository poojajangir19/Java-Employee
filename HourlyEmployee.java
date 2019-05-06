
public class HourlyEmployee extends Employee
{
 private double hours;
 private double wage;

 public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
   double hours, double wage)
 {
  super(firstName, lastName, socialSecurityNumber);

  // check and assign hours worked
  if (hours <0.0 || hours > 168.0)
   throw new IllegalArgumentException ("Hours worked must be positive  and below 168h per week.");

  // check and assign hourly wage
  if (wage < 0.0)
   throw new IllegalArgumentException ("Hourly wage must be positive.");

  this.hours = hours;
  this.wage = wage;

 }

 // accesor methods
 // accesor for hours
 final public double getHours()
 {
  return hours;
 }

 // accesor for wage
 final public double getWage()
 {
  return wage;
 }

 // mutator methods
 // mutator for hours
 final public void setHours (double hours)
 {
  if (hours < 0.0 || hours > 168)
   throw new IllegalArgumentException ("Hours worked must be positive and below 168h per week.");
  this.hours = hours;
 }

 // mutator for wage
 final public void setWage (double wage)
 {
  if (wage < 0.0)
   throw new IllegalArgumentException ("Hourly wage must be positive.");
  this.wage = wage;
 }

 // method to determine weekly earnings
 @Override
 final public double getPaymentAmount() //replacing earnings method with getPaymentAmount to place the class in the Payable Hierarchy as subclass of Employee class that implements Payable
 {
  if (getHours() <= 40.0)
   return getWage() * getHours();
  else
   return getWage() * 40 + getWage() * (getHours() - 40) * 1.5;
 }

 @Override
 final public String toString()
 {
  return String.format("%s %s%n%s: %,.2f%n%s: $%,.2f",
    "Hourly", super.toString(),
    "Hours worked", getHours(),
    "Wage per hour", getWage());
 }

}

    