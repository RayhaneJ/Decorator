1) Architecture fortement couplée qui necessite la création 
pour chaque ajout d'ingrédient. Code smell car ne respecte pas le concept DRY et nécessite de nombreuse modifications 
lors d'une refactorisation.

2) Approche avec du code moins couplée. Cependant ne convient pas à l'ajout de 
plusieurs ingrédients du même type. Autrement dit, si j'ajoute plusieurs 
sauce comme dans l'exemple le boolean n'est pas suffisant. On peut lier ce boolean à un compte 
pour chaque ingrédients. Si ce compteur est égal à 0 le boolean devient false. Si il est supérieur à 0 le boolean devient true. 
Avec ce compteur, une gestion de l'ingrédient doubleSoy sera possible en récuperant
ce compteur. Dans notre exemple, il sera égal à 2.

3) Apporche adéquate permet d'éviter un couplage fort et évite de nombreuse répétion de code.
Maintenabilité du code plus facile qu'à l'origine. 

