class Compare {
    public void compareTo(double lengthLine1, double lengthLine2) {
        System.out.println("Length of line1 is= "+lengthLine1);
        System.out.println("Length of line2 is= "+lengthLine2);
        if (lengthLine1 > lengthLine2)
            System.out.println("Length of line 1 is greater than Length of line 2");
        else if (lengthLine1 < lengthLine2)
            System.out.println("Length of line 1 is lesser than Length of line 2");
        else
            System.out.println("Both lines are equal");
    }
}
    public class LineComputation {
       private final double x1;
       private final double y1;
       private final double x2;
       private final double y2;

    public LineComputation(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparision Computation Program");
        LineComputation line1 = new LineComputation(9, 4, 5, 4);
        LineComputation line2 = new LineComputation(9, 4, 5, 8);
        double lengthOfLine1 = Math.sqrt(Math.pow((line1.x2-line1.x1),2) + Math.pow((line1.y2-line1.y1),2));
        double lengthOfLine2 = Math.sqrt(Math.pow((line2.x2-line2.x1),2) + Math.pow((line2.y2-line2.y1),2));
        Compare comparision = new Compare();
        comparision.compareTo(lengthOfLine1, lengthOfLine2);
    }
}
