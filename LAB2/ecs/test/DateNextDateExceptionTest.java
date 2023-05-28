import java.util.LinkedList;
import java.util.List;


public class DateNextDateExceptionTest
{
    private int year;
    private int month;
    private int day;
    private IllegalArgumentException expectedResult;

    
public DateNextDateExceptionTest(int year, int month, int day, IllegalArgumentException expectedResult){

    this.year=year;
    this. month = month;
    this.day = day;
    this.expectedResult=expectedResult; 
}

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

public void testDate(){
    System.out.println(expectedResult);
}

}