Grades : 
STUBBED CODE
 <br> ![image](img/G1.png) <br>
 <br> ![image](img/G2.png) <br>
Dans cette partie, nous avons créé des stubs dans le but de définir la signature des méthodes qui sont connectées au reste du système. Ces méthodes sont présentes pour calculer la note finale en se basant sur les coefficiants suivants :
(homework_total / homework_length) * 0.15 + (labs_total / labs_length) * 0.3 + midterm * 0.25 + final * 0.3 et affiche ensuite percentage_grade, letter_grade et numeric_grade
OUTPUT ON THE WEBPAGE WITH THE STUBBED CODE 
 <br> ![image](img/represent.png) <br> 
Avec le code stubbed, nous pouvons constater que l'application web est capable d'afficher nos notes renvoyées comme prévu. Cela signifie que la partie backend de notre application web se connecte efficacement avec la partie frontend.
Twitter :
4 Missing Tests :
 <br> ![image](Images/test1.png) <br>
 <br> ![image](Images/test2.png) <br>
Il y a deux erreurs dans deux Tests. Dans la classe Twitter.java, la méthode loadTweet() présente trois résultats possibles. Elle peut retourner la chaîne de caractères "I am tweet that likes to talk about @me", la chaîne de caractères "Hello to @you", ou bien null.
 <br> ![image](Images/up1.png) <br>
Les tests isMentionned_handleNull() et isMentionned_dontReturnSubstringMatches() ont échoué. Cependant, dans la méthode isMentionned(), la possibilité que le tweet soit null ou que le nom soit une sous-chaîne n'a pas été prise en compte. Nous avons donc mis à jour la méthode isMentionned.
 <br> ![image](Images/up2.png) <br>
Résultats Après isMentionned est mis à jour :
 <br> ![image](Images/bin:test.png) <br>


