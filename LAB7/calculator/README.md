<br> ![image](../img/calc.jpg) <br>
<br> ![image](../img/test.jpg) <br>
### Spotage de bugs
<br> ![image](../img/bugs.png) <br>
<br> ![image](../img/bugfixer.png) <br>
BAD PRACTICE<br>
1.Certaines méthodes Swing ne doivent être invoquées qu'à partir du thread Swing<br>
2.Comparison of String parameter using == or !=<br>
PERFORMANCE<br>
1.Peut-être transformée en classe interne statique nommée<br>
2.Boxing/unboxing to parse a primitive<br>
3.Boxing/unboxing to parse a primitiv<br>
4.Champ non lu : devrait-il être statique ?<br>
5.Champ non lu : devrait-il être statique ?<br>
6.Champ non lu : devrait-il être statique ?<br>
7.Champ non lu : devrait-il être statique ?<br>
8.Champ non lu : devrait-il être statique ?<br>
9.Champ non lu : devrait-il être statique ?<br>
DODGY CODE<br>
1.Méthode utilisant le même code pour deux branches<br>
2.Switch statement found where default case is missing<br>
3.Condition has no effect<br>
4.Condition has no effect<br>
5.Condition has no effect<br>
6.Condition has no effect<br>
### correction de bugs
Before: <br>
if ( s == "" ) <br>
    After: <br>
if (s.isEmpty())<br>
  
Before: <br>
setVisible(true); //in Main.java<br>
    
 After:<br>
public CalCFrame(String title) {<br>

  super(title);<br>
  setVisible(true); //in CalCFrame.java<br>
  //...<br>
    Before:<br>
addWindowListener(new WindowAdapter() {<br>
  public void windowClosing(WindowEvent e) {<br>
  System.exit(0);<br>
}});<br>
    After:<br>
private static class CustomWindowAdapter extends WindowAdapter {<br>
  public void windowClosing(WindowEvent e) {<br>
    System.exit(0);<br>
  }<br>
}<br>
//...<br>
addWindowListener(new CustomWindowAdapter());<br>
    Before:<br>
num1 = Double.valueOf( input ).doubleValue();<br>
    After:<br>
num1 = Double.parseDouble(input);<br>
    Before:<br>
answer = Double.valueOf(s).doubleValue();<br>
    After:<br>
answer = Double.parseDouble(s);<br>
    Before:<br>
num2 = Double.valueOf( input ).doubleValue();<br>
    After:<br>
num2 = Double.parseDouble(input);<br>
    Before:<br>
num3 = Double.valueOf( input ).doubleValue();<br>
    After:<br>
num3 = Double.parseDouble(input);<br>
    Before:<br>
private final int ADD=1,<br>    
  SUB = 2,     <br>
  MULT = 3, <br>
  DIVI = 4, <br>
  POW = 5, <br>
  SQRT = 6;<br>
    After:<br>
private static final int ADD=1,   <br>    
  SUB = 2,     <br>
  MULT = 3, <br>
  DIVI = 4, <br>
  POW = 5, <br>
  SQRT = 6;<br>
    Before:<br>
if ( i <= 2 )<br>
  getContentPane().add( buttons[i] );<br>
else if ( i >= 3 && i <= 7)<br>
  getContentPane().add( buttons[i] );<br>
else if ( i >=8 && i <= 12 )<br>
  getContentPane().add( buttons[i] );<br>
else if ( i >= 13 && i <= 17 )<br>
   getContentPane().add( buttons[i] );<br>
else<br>
  getContentPane().add( buttons[i] );<br>
getContentPane().add( buttons[i] );<br>
    Before:<br>
switch( oper ) {<br>
  // ...<br>
  // no default case<br>
}<br>
}<br>
    After:<br>
switch( oper ) {<br>
  // ...<br>
  default: <br>
    clearScreen();<br>
    System.out.println("Calculate called without operator -> investigate!");<br>
    break;<br>
}<br>
    Before:<br>
else if (morenums) {<br>
    After:<br>
else {<br>

<br> ![image](../img/bug0.png) <br>

