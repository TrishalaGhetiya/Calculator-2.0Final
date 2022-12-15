import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Validation
{
    public int validate(String input)
    {
        Boolean b=true;
        List<String> operatorList = new ArrayList<>();
        List<String> operandList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(input, "+-*/", true);
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();

            if ("+-/*".contains(token))
            {
                operatorList.add(token);
            }
            else
            {
                operandList.add(token);
            }
        }

        for(String operand : operandList)
        {
            try
            {
                int i = Integer.parseInt(operand);
                b=true;
                if(i>=10 | i<1)
                {
                    b=false;
                    break;
                }
                else
                    b=true;

            }
            catch(Exception e)
            {
                b=false;
            }

        }

        if(b)
            return 0;
        else
            return 1;

//		 System.out.println("Operators:" + operatorList);
//		 System.out.println("Operands:" + operandList);

    }
}
