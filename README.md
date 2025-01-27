# R4A11_TP1


Question 1

 Le ficher XML se trouve dans le dossier "res/layout" sous le nom : activity_main.xml

Question 2

 Il fallait modifier l'attribut "android:text" dans le TextView du fichier activity_main.xml

Question 3

 Il Faut ajouter une image dans le dossier drawable (ou mipmap) et ensuite modifier le  android:icon ainsi que le  android:roundIcon en ajoutant l'image de notre choix

Question 4

 Non cela n'est pas nécessaire de cliquer sur le bouton valider pour afficher le texte saisi sur la seconde activité car il n'y a aucun lien entre le listener du bouton next ainsi que le listener du bouton valider, l'un n'impacte donc pas l'autre.

Question 5

 Le comportement de la question 4 ne me semble pas normal car on devrait avoir à valider notre saisie avant de pouvoir passer à l'activité suivante sinon celà peut créer trop de problèmes notamment de missclick pour l'utilisateur. En remediant à ce problème on force l'utilisateur à valider sa saisie avant de passer à l'activité suivante.

Question 6

 On peut bloquer le passage à la 2ème activité en rajoutant une condition sur une variable qu'on aura initialement implémentée comme étant une chaine vide. Si la chaine n'est pas vide on peut passer à l'activité suivante, sinon on ne fait rien donc on reste bloqué sur la 1ère activité.


 

