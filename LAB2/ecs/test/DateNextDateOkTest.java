import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@RunWith(Parameterized.class)
public class DateNextDateOkTest
{

private Date date;
private Date expectedResult;
/**
	 * Constructor for a parameterized test case.
	 * </p>
	 * <p>
	 * The constructor stores the parameters in instance variables for use by
	 * whichever test method is being run. Because we don't know exactly which
	 * method will be run (in general), the parameters have to be set up for all
	 * possible test methods for the set of values.
	 *
	 * @param date
	 *            Bit value for left side of binary operator
	 *            Bit value for right side of binary operator
	 * @param expectedResult
	 *            Expected bit value for the result of AND
	 */

public DateNextDateOkTest(Date date, Date expectedResult) {
    this.date = date;
    this.expectedResult = expectedResult;
}

@Parameters
public static List<Date[]> data( )
{
    List<Date[]> params = new LinkedList<Date[]>( );
    params.add(new Date[] {new Date(1700, 6, 20), new Date(1700, 06, 21)});
    params.add(new Date[] {new Date(2005, 04,15), new Date(2005, 04, 16)});
    params.add(new Date[] {new Date(1901, 07,20), new Date(1901, 07,21)});
    params.add(new Date[] {new Date(3456, 03,27), new Date(3456, 03,28)});
    params.add(new Date[] {new Date(1500, 02,17), new Date(1500, 02,18)});
    params.add(new Date[] {new Date(1700, 06,29), new Date(1700, 06,30)});
    params.add(new Date[] {new Date(1800, 11,29), new Date(1800, 11,30)});
    params.add(new Date[] {new Date(3453, 01,29), new Date(3453, 01,30)});
    params.add(new Date[] {new Date(444, 02,29), new Date(444, 03,01)});
    params.add(new Date[] {new Date(2005, 04,30), new Date(2005, 05,01)});
    params.add(new Date[] {new Date(3453, 01,30), new Date(3453, 01,31)});
    params.add(new Date[] {new Date(3456, 03,30), new Date(3456, 03,31)});
    params.add(new Date[] {new Date(1901, 07,31), new Date(1901, 8,01)});
    params.add(new Date[] {new Date(3453, 01,31), new Date(3453, 02,01)});
    params.add(new Date[] {new Date(3456, 12,31), new Date(3457, 01,01)});
    return params;
}

@Test
public void testDate(){
    Date actualDate = date.nextDate();
    assertEquals(expectedResult, actualDate);
}

}

