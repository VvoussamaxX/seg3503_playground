import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void test1(){
      Date d = new Date(1700, 06,20);
      assertDate (new Date(1700, 06, 21), d.nextDate());
  }
  
  @Test
  void test2(){
      Date d = new Date(2005, 04,15);
      assertDate (new Date(2005, 04, 16), d.nextDate());
  }
  
  @Test
  void test3(){
      Date d = new Date(1901, 07,20);
      assertDate (new Date(1901, 07,21), d.nextDate());
  }
  
  @Test
  void test4(){
      Date d = new Date(3456, 03,27);
      assertDate (new Date(3456, 03,28), d.nextDate());
  }
  
  @Test
  void test5(){
      Date d = new Date(1500, 02,17);
      assertDate (new Date(1500, 02,18), d.nextDate());
  }
  
  @Test
  void test6(){
      Date d = new Date(1700, 06,29);
      assertDate (new Date(1700, 06,30), d.nextDate());
  }
  
  @Test
  void test7(){
      Date d = new Date(1800, 11,29);
      assertDate (new Date(1800, 11,30), d.nextDate());
  }
  
  @Test
  void test8(){
      Date d = new Date(3453, 01,29);
      assertDate (new Date(3453, 01,30), d.nextDate());
  }
  
  @Test
  void test9(){
      Date d = new Date(444, 02,29);
      assertDate (new Date(444, 03,01), d.nextDate());
  }
  
  @Test
  void test10(){
      Date d = new Date(2005, 04,30);
      assertDate (new Date(2005, 05,01), d.nextDate());
  }
  
  @Test
  void test11(){
      Date d = new Date(3453, 01,30);
      assertDate (new Date(3453, 01,31), d.nextDate());
  }
  
  @Test
  void test12(){
      Date d = new Date(3456, 03,30);
      assertDate (new Date(3456, 03,31), d.nextDate());
  }
  
  @Test
  void test13(){
      Date d = new Date(1901, 07,31);
      assertDate (new Date(1901, 8,1), d.nextDate());
  }
  
  @Test
  void test14(){
      Date d = new Date(3453, 01,31);
      assertDate (new Date(3453, 02,01), d.nextDate());
  }
  
  @Test
  void test15(){
      Date d = new Date(3456, 12,31);
      assertDate (new Date(3457, 01,01), d.nextDate());
  }
  
  @Test
  void test16(){
      assertThrows(IllegalArgumentException.class, ()->{new Date(1500, 2, 31).nextDate();}, 
      "Le mois de Février compte 28 jours pour une année non bissextile et 29 jours pour une année bissextile.");
  }
  
  @Test
  void test17(){
      assertThrows(IllegalArgumentException.class, ()->{new Date(1500, 2, 29).nextDate();}, 
      "Le mois de Février compte 28 jours pour une année non bissextile et 29 jours pour une année bissextile.");
  }
  
  @Test
  void test18(){
      assertThrows(IllegalArgumentException.class, ()->{new Date(-1, 10, 20).nextDate();}, 
      "L'intervalle pour l'an est : year>=0.");
  }
  
  @Test
  void test19(){
      assertThrows(IllegalArgumentException.class, ()->{new Date(1458, 15, 12).nextDate();}, 
      "l'intervalle pour le mois est : 1<= month <= 12.");
  }
  
  @Test
  void test20(){
      assertThrows(IllegalArgumentException.class, ()->{new Date(1975, 6, -50).nextDate();}, 
      "L'intervalle pour le jour est : 1 <= day <= 31.");
  }

  private void assertDate(Date date, Date date2)
  {
  	assertEquals(date + "", date2.toString());
  }
}