public class ArithematicOperation
{
    public void calculate(String input) {
        Validation v = new Validation();
        int i = v.validate(input);
        if (i == 1) {
            System.out.println("Enter valid expression");
        } else {
            int output = 0;
            int d1 = 0, d2 = 0, d3 = 0;
            String in = input;
            String[] array = in.split("");
            int len = array.length;

            if (len == 5) {
                d1 = Integer.parseInt(array[0]);
                d2 = Integer.parseInt(array[2]);
                d3 = Integer.parseInt(array[4]);
                if ((array[1].equals("+")) && (array[3].equals("+"))) {
                    output = d1 + d2 + d3;
                } else if ((array[1].equals("+")) && (array[3].equals("-"))) {
                    output = d1 + d2 - d3;
                } else if ((array[1].equals("+")) && (array[3].equals("*"))) {
                    output = d1 + (d2 * d3);
                } else if ((array[1].equals("+")) && (array[3].equals("/"))) {
                    output = d1 + (d2 / d3);
                } else if ((array[1].equals("-")) && (array[3].equals("+"))) {
                    output = d1 - d2 + d3;
                } else if ((array[1].equals("-")) && (array[3].equals("-"))) {
                    output = d1 - d2 - d3;
                } else if ((array[1].equals("-")) && (array[3].equals("*"))) {
                    output = d1 - (d2 * d3);
                } else if ((array[1].equals("-")) && (array[3].equals("/"))) {
                    output = d1 - (d2 / d3);
                } else if ((array[1].equals("*")) && (array[3].equals("+"))) {
                    output = d1 * d2 + d3;
                } else if ((array[1].equals("*")) && (array[3].equals("-"))) {
                    output = d1 * d2 - d3;
                } else if ((array[1].equals("*")) && (array[3].equals("*"))) {
                    output = d1 * d2 * d3;
                } else if ((array[1].equals("*")) && (array[3].equals("/"))) {
                    output = d1 * d2 / d3;
                } else if ((array[1].equals("/")) && (array[3].equals("+"))) {
                    output = d1 / d2 + d3;
                } else if ((array[1].equals("/")) && (array[3].equals("-"))) {
                    output = d1 / d2 - d3;
                } else if ((array[1].equals("/")) && (array[3].equals("*"))) {
                    output = d1 / d2 * d3;
                } else if ((array[1].equals("/")) && (array[3].equals("/"))) {
                    output = d1 / d2 / d3;
                }
                System.out.println(output);
            }

            if (len == 3) {
                d1 = Integer.parseInt(array[0]);
                d2 = Integer.parseInt(array[2]);

                if (array[1].equals("+")) {
                    output = d1 + d2;
                } else if (array[1].equals("-")) {
                    output = d1 - d2;
                } else if (array[1].equals("*")) {
                    output = d1 * d2;
                } else if (array[1].equals("/")) {
                    output = d1 / d2;
                }
                System.out.println(output);

            }

        }
    }

}