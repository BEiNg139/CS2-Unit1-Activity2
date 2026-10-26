public class Main {

   public static double feetToInches(double feet) {
      double inches;
      // TODO: Convert feet to inches (1 foot = 12 inches)
      inches = feet * 12;
      return inches;
   }

   public static double calcLadderSize(double height, double width) {
      double ladderSize;
      // TODO: Calculate using Pythagorean theorem
      // Use Math.sqrt and Math.pow or *
      ladderSize = Math.sqrt((Math.pow(height, 2) + Math.pow(width, 2)));
      return ladderSize;
   }


   public static void main(String []args) {
      double inches = feetToInches(4.0);
      System.out.println("4 feet is " + inches + " inches");
      double ladderSize = calcLadderSize(3, 4);
      System.out.println("The ladder is " + ladderSize + " feet long");
   }
}
