import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import javax.management.ConstructorParameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{
    private int year;
    private int month;
    private int day;
    private IllegalArgumentException expectedResult;
    /**
	 * Constructor for a parameterized test case.
	 * </p>
	 * <p>
	 * The constructor stores the parameters in instance variables for use by
	 * whichever test method is being run. Because we don't know exactly which
	 * method will be run (in general), the parameters have to be set up for all
	 * possible test methods for the set of values.
	 *
	 * @param year
	 *            Bit value for left side of binary operator
	 * @param month
	 *            Bit value for right side of binary operator
	 * @param day
     * @param expectedResult
	 *            Expected bit value for the result of AND
	 */
    
public DateNextDateExceptionTest(int year, int month, int day, IllegalArgumentException expectedResult){

    this.year=year;
    this. month = month;
    this.day = day;
    this.expectedResult=expectedResult; 
}
@Parameters
public static List<Object[]> data( )
{
    List<Object[]> params = new LinkedList<Object[]>( );
    params.add(new Object[] {1500,2,31,new IllegalArgumentException("Le mois de Février compte 28 jours pour une année non bissextile et 29 jours pour une année bissextile.")});
    params.add(new Object[] {1500,2,29,new IllegalArgumentException("Le mois de Février compte 28 jours pour une année non bissextile et 29 jours pour une année bissextile.")});
    params.add(new Object[] {-1,10,20,new IllegalArgumentException("L'intervalle pour l'an est : year>=0.")});
    params.add(new Object[] {1458,15,12,new IllegalArgumentException("l'intervalle pour le mois est : 1<= month <= 12.")});
    params.add(new Object[] {1975,6,-50,new IllegalArgumentException("L'intervalle pour le jour est : 1 <= day <= 31.")});
    return params;
}

@Test(expected = IllegalArgumentException.class)
    public void testDate() {
        Date date = new Date(year, month, day);
        Date nextDate = date.nextDate();
        assertEquals(expectedResult, nextDate);        
    }
}
