IK3-Tortue
==========

ADEQUIN Renaud
GHANDRI Ahmed
LIM Steffie
YOUNG Johnathan



Tortue Geniale
Manuel utilisateur 


Présentation Générale 

	Tortue-Géniale est un logiciel créé dans le cadre d'un projet informatique réalisé au cours de la deuxième année de licence informatique, à l'Université Paris Diderot VII. 
Ce logiciel permet de créer des dessins, à partir de ligne de commandes. Pour cela, il suffit de taper vos lignes de commandes, une par une, dans la barre de saisie, de couleur de fond noir, située en bas du cadre dessin. Ces commandes entrées, vous permetttront de pouvoir déplacer la tortue, c'est à dire le curseur, pour pouvoir dessiner.
Les commandes exécutées sont alors envoyées sur le panneau historique.
Une fois fini votre dessin , apres avoir enregistrer vous obtiendrez deux fichiers :
1) un fichier nom_du_dessin.txt dans lequel se trouve toutes les commandes executées
2) un fichier nom_du_dessin.png , c'est une image de votre dessin










Présentation de L'interface

1. L'historique des commandes
Sur l'interface du logiciel, à la droite il y a un panel consacré à la saisie des commandes effectuées pendant la réalisation du dessin. Celle-ci affiche au fur et à mesure vos commandes entrées avec leur parametres. Mais aussi les messages d'erreurs comme la mauvaise syntaxe d'une commande ou si le parametre entré n'est pas correct. De plus les commentaires que vous pourrez rentrer dans la barre de saisies, seront aussi affichées dedans.

2. Le dessin
La plus grande partie de l'interface correspond à l'endroit où le résultat des commandes saisies seront affichés sous forme de dessin. 
3. La tortue (i.e le curseur)
La tortue est représentée par un symbole, c'est un curseur en forme de flèche:
La direction de la tortue est indiqué par le sens dans lequel est dirigée la tortue.

4. La saisie de commandes
Les commandes sont saisies, une par une, dans la barre de saisie, en appuyant sur la touche "Entrée". De là, la commande sera exécuté et le résultat final sera affiché sur l'espace dédié au dessin. De plus la commande saisie sera affiché en rappel, sur le panneau historique situé à droite de la fenêtre.
Remarque : Parmi les commandes proposées par le logiciel, seule une commande échappe à la règle de saisies une par une : REPEAT. (cf Présentation des commandes)
5. Panneau d'information
Une partie, située entre le dessin et la barre de saisie, correspond aux informations qui sont sur le curseur et la souris.
a) Coordonnées de la souris
Attention il faut différencier la souris et la tortue. La tortue est le curseur qui est sur votre dessin, représenté par la flèche. Et la souris est votre souris que vous pouvez directement manipuler.
(x, y|z) donne la position actuel de votre souris (x,y) et change en même temps que vous la bougez. Et indique la direction de votre tortue actuel (z).
b) Position du curseur
Donne la dernière position du curseur après avoir exécuté une commande de dessin, tel que move, circle, repeat.
c) Taille du pinceau
Permet de régler la taille dun pinceau directement sur l'interface, en cliquant respectivement sur le bouton (+) ou le bouton (-) . Cela permet de ne pas passer par la commande pensize.
d) Pinceau
Indique si le curseur est sur le dessin. S'il y a "OUI" alors on peut dessiner sur le dessin, si la position est "NON", alors toute commande de dessin ne fonctionnera pas.
e) Position du REMEMBER
Ces rappels de coordonnées est en relation avec la commande REMEMBER. Ce sont des coordonnées enregistrées par la commande REMEMBER, qui pourront être réutilisée ultérieurement. (cf Présentation des commandes REMEMBER).

f) La couleur du pinceau
En cliquant dessus, vous pourrez choisir une couleur parmi plusieurs couleurs proposées .



Présentation des commandes 
BACK:  	Cette commande fonctionne en complémentarité avec la commande 	"REMEMBER" décrite ci-dessous. Et ne prend aucun argument.
	Elle déplace votre tortue au dernier point enregistré par 	"REMEMBER" 





Resultat final:







BACKGROUNDCOLOR : 	Avec cette commande vous pouvez choisir la couleur de votre arrière 	plan .
	Il suffit de lui donner soit une valeur en hexadécimale en argument, 	soit une couleur prédéfinie par JAVA, celle-ci peut être entré en 	anglais ou français. Les couleurs prédéfinies sont rouge/red , 	white/blanc, black/noir, yellow/jaune, blue/bleu, cyan, rose/pink, 	orange, magenta, lightgray/grisclair, green/vert, gray/gris, 	darkgray/grisfonce. La couleur peut être choisit aléatoirement grâce à 	l'argument random
CENTER :  	Elle déplace votre curseur au centre du dessin. Cette commande ne  	prend aucun argument.
CLEAR :  	Elle efface tout votre dessin, excpeté la couleur de fond. Et efface le 	fichier dans lequel se fait la sauvegarde automatique des commandes 	executées . Elle ne prend aucun argument . 

DOWN :  	Cette commande ne prend aucun argument. Elle dirige la tortue dans 	un angle de 270°.
ERASE : 	Elle permet d'effacer un trait complet ou une partie. Le choix de 	longueur de l'effacement peut se faire par un ou deux arguments. 
GO :  				Elle déplace le curseur où vous voulez dans le dessin. Elle prend deux 				arguments entiers : l'abscisse et l'ordonnée de la nouvelle position du 				curseur. Le placement du curseur peut se faire aléatoirement grâce à 				l'argument random
				Exemple : "GO 100 100" met le curseur au point de coordonnées 					(100, 100).
				Remarque : Si vous cliquez sur le dessin avec la souris il placera votre 				tortue geniale à l'endroit de votre clique.
HELP :	Cette commande permet de connaître la fonctionnalité des différentes 	commandes de Tortue-Géniale. Elle peut prendre des arguments ou 	non. Si vous entrez seulement "HELP" toute la page d'aide s'affichera. 	Si vous demandez l'aide d'une commande spécifique,
	e.g HELP TURN, alors elle affichera seulement la description de la 	commande turn.
Exemple : HELP 







HELP CLEAR



	
LEFT :  	Cette commande ne prend aucun argument. Elle dirige la tortue dans 	un angle de 0°.






MOVE : 	Elle dessine un trait qui va du point actuel jusqu'au point de 	coordonnées (x,y) .
	Vous donnez deux entiers qui représentent ces coordonnées en 	arguments .
	Si vous ne donnez qu'un seul entier "x", cette commande vous dessine 	un trait de longueur "x" dans l'orientation de votre tortue-géniale.
	Il est aussi possible d'incrementer ou de décrementer la commande.
	Exemple : s'il y a eu MOVE 50 et ensuite MOVE +50 il effectuera un 	move de 100.
	Si vous voulez faire un move aléatoirement, il faudra écrire : MOVE 	RANDOM RANDOM
	Remarque : Il est possible de remettre l'incrémentation à 0 en tappant 	MOVE 0
NEW	: 			Commande qui crée un nouvel éditeur. A la saisie de la commande une 				boite de dialogue est ouverte et vous propose, de sauvegarder ou non 				votre dessin ou d'annuler la commande.
				Si vous souhaitez sauvegarder, une autre fenetre vous demandera où 				vous voulez l'enregistrer. Sinon, l'historique de votre dessin et le 					dessin sera supprimé et vous reviendrez sur un éditeur de fond blanc. 
				Dans le cas où vous annulez la commande rien ne se passe.
				Attention: cette commande ne prend aucun argument. Pour ouvrir un 				nouveau fichier il faudra passer par la commande OPEN.
OPEN: 	Elle ouvre un fichier txt de commande et les ajoutes à notre dessin.
	Si vous tapez juste OPEN, il affiche une boite de dialogue pour choisir 	votre fichier mais il est possible d'indiquer le chemin du fichier 	directement à OPEN.
	Mais si vous voulez faire un nouveau dessin à partir du fichier ouvert 	vous pouvez indiquer l'option NEW
	Exemple : OPEN NEW ou bien OPEN NEW C:\chemin_du_fichier.txt
PENCOLOR: 	Avec cette commande vous pouvez choisir la couleur de votre pinceau. 	Il suffit de lui donner la valeur en hexadecimale de la couleur en 	argument. Cette commande peut prendre en argument une couleur, 	ainsi, vous pouvez taper directement en argument red, rouge, white, 	blanc, black, noir, yellow, jaune, blue, bleu, cyan, rose, pink, orange, 	magenta, green, vert, gray ou gris.
	ATTENTION gris fonce (dark gray) et gris clair (light gray) doivent 	être écrit en attaché, exemple : PENCOLOR grisfonce (PENCOLOR 	darkgray) 
PENDOWN  :  	Cette commande ne prend aucun argument. Elle "pose votre pinceau 	sur la feuille de dessin" pour pouvoir dessiner par la suite. 
PENSIZE      :  	On peut changer la taille du pinceau grace à cette commande, elle 	prend comme argument un entier compris entre 1 et 99.
PENUP         :  	Cette commande "lève le pinceau de la feille de dessin" . Une fois 	exécutée, vous ne pourrez plus dessiner. Cette commande ne prend 	aucun argument .
REDO          :  	Cette commande réexécute la commande qui lui est précédente. Cette 	commande ne prend aucun argument .
	Attention, elle réexécute uniquement les commandes qui ont pour but 	de dessiner. Donc elle refait uniquement les commandes MOVE, et	REPEAT
REMEMBER :	Enregistre les coordonnées (abscisse, ordonnee et direction) du curseur 	actuel. Cette commande ne prend aucun argument. 
REPEAT : 	La syntaxe générale de cette commande est "REPEAT m [ commande1 	; ... ; commande n ]".
	Cette commande est tout simplement une boucle, elle exécute m fois 	les commandes qui sont entre accolades.
	Elle prend un entier comme 	argument , celui-ci représente le nombre 	de fois que les commandes seront exécutées.
	Remarque : Il est possible d'imbriquer plusieurs repeat.
	Pour voir un exemple de l'execution cf Exemples.
RIGHT : 	Cette commande tourne votre tortue genial vers la droite, c'est à dire 	de 180°.
SAVE : 	Cette commande sert à enregistrer votre travail. En l'exécutant, une 	fenêtre s'ouvre, dans laquelle vous pouvez choisir le nom et 	l'emplacement de votre fichier. Il sauvegarde le dessin au format .png 	et le fichier texte qui contient les commande executées. Il est possible 	d'indiquer le chemin du fichier directement à la commande SAVE.
TURN : 	Cette commande prend un entier m comme argument. Elle tourne 	votre tortue-géniale d'un angle de valeur m dans le sens de rotation des 	aiguilles d'une montre. Il est possible de mettre un signe + ou – à 	l'argument de TURN ce qui l'ajoutera ou l'enlevera à la direction de 	votre tortue geniale.
UNDO: 	Elle annule la commande qui lui est précédente. Mais uniquement les 	commandes qui permettent de dessiner, donc uniquement MOVE et 	REPEAT. Et garde l'angle du curseur actuel. Cette commande ne prend 	aucun argument .
UP : 	Cette commande tourne votre tortue genial vers le haut, donc dans un 	angle de 90°.





VAR: 	Cette commande vous permet de déclarer des variables et/ou de 	modifier leurs valeurs. Une déclaration de variable commence toujours 	par VAR_*, mais pour l'utilisation elle comme toujours par 	l'underscore "_" suivi du nom de la variable donnée. 
	Voici les 3 cas possibles:
La déclaration simple :
VAR _variable = 33 ou VAR _variable2 = _variable
Le changement de signe :
VAR _variable = - _variable ou VAR _variable2 = - _variable

Les opérations : 
VAR _variable = _variable - 33 ou VAR _variable3 = _variable * _variable2
				Les opérations permises sont +, -, *, et /\.
				Pour avoir la liste des variables que vous avez déclaré : VAR info.
 				Attention, il n'est possible de faire des opérations que sur deux 					variables à la fois	

Astuces et Raccourcis
1) Astuces :
Vous pouvez éviter de taper entièrement la commande désirée, il suffit de taper les deux premieres lettres de cette commande et appuyer sur la touche 'Tabulation' , le programme complètera automatiquement la commande. 
Si plusieurs commande commence par les mêmes lettres, les différents choix proposées seront affichés sur le panel historique.
Vous bénéficiez également des touches de navigation, la touche (flèche du) haut et (flèche du) bas de votre clavier, avec lesquelles vous naviguez dans la barre de saisie. Par exemple, pour resaisir l'avant dernière commande, il suffit de taper deux fois sur la touche ' flèche du haut' de votre clavier et la commande s'affiche. 
Il est possible de choisir aléatoirement  la valeur que l'on veut, en utilisant l'argument random. Celle-ci peut être utilisé avec les commandes : BACKGROUNDCOLOR, GO, MOVE, PENCOLOR, REPEAT et TURN.
Exemple pour un PENCOLOR RANDOM:
Position initiale 



Execution d'un PENCOLOR RANDOM

	2) Raccourcis :
	Appuyer sur " CTRL + L " pour supprimer le panneau d'historique. 


Exemples 

On peut dessiner cette rosace en tapant seulement :
> BACKGROUNDCOLOR #00AC88
// en premier temps pour choisir le fond d'ecran et en suite
> REPEAT 18 [turn +20 ; repeat 18 [turn +20 ; move 50]] .


Pour obtenir cette figure géometrique très avancée , il suffit d'exécuter ces deux commandes :
> BACKGROUNDCOLOR #00A8B4
> REPEAT 100 [move +5;turn +121 ]


Ce qui fait la force de ce logiciel, c'est de pouvoir réaliser des figures très compliquées en saisissant seulement quelques commandes.
La figure ci-dessus peut etre réalisée en saisissant cette unique commande :
> REPEAT 180 [REPEAT 4 [MOVE 80;TURN +90];TURN +2 ]


Pareil pour cette figure , une seule commande et le tour est joué :
> REPEAT 10 [ move +4; repeat 10 [ move +3;turn +90] ].