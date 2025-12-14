# Système d’accès à un bâtiment sécurisé
## Informations
**Réalisé par:** TATY MASSANGA PETINIA MICHELLE (*Travail individuel*)
**Module:**  programmation orientée objet

## description du projet
Ce projet est un système de gestion d’accès sécurisé à un bâtiment équipé de portes électroniques. Chaque employé possède un badge contenant un niveau de sécurité. Le système permet de vérifier si un employé est autorisé ou non à ouvrir une porte donnée. Il se concentre principalement sur l’application du Single Responsibility Principle (SRP), en séparant clairement les responsabilités des classes, tout en utilisant la composition et l’agrégation pour modéliser correctement un système d’accès sécurisé.
### objectifs
-gérer les employés et leurs badges
-gérer les portes et leurs niveaux d’accès
-vérifier les autorisations d’accès
-enregistrer les tentatives d’accès en mémoire

## architecture du projet
### structure des fichiers


<img src="Struc_fichier.png" alt="Structure des fichiers">

### diagramme de classes uml
<img src="uml.png" alt="Diagramme UML">

## Principes de conception
### Responsabilités
**Employee** : représenter un employé et contenir son badge
**Badge** stocker le niveau de sécurité de l’employé
**Door**représenter une porte avec un niveau d’accès requis
**Building** regrouper les portes du bâtiment
**AccessValidator** vérifier si un accès est autorisé
**AccessLog** enregistrer les tentatives d’accès

*Chaque classe a une responsabilité claire et unique*


### Gestion des exceptions

Les classes **lèvent des exceptions** lorsque
 
-Un accès est refusé
-une porte ou un employé est invalide

La gestion des erreurs est effectuée uniquement dans la classe principale App. Les classes métier ne contiennent aucun affichage console, afin de respecter la séparation des responsabilités.


 ## utilisation
 ### Prérequis
 Java 17 ou version compatible

Aucun framework externe
Python 3.8 ou version supérieure

### Lancement
javac app/App.java
java app.App

**Fonctionnalités testées :**

Le programme principal démontre les fonctionnalités suivantes :
1. création d’un bâtiment
2. ajout de plusieurs portes avec différents niveaux d’accès
3. création d’employés avec badge
4. test d’accès autorisé
5. test d’accès refusé
6. enregistrement des tentatives d’accès en mémoire


## Points techniques

### La classe Employee

Représente un employé et contient un badge par composition

**Exceptions possibles :**
- `IllegalArgumentException` : données invalides

### La classe Door

Représente une porte avec un niveau d’accès requis.


**Exceptions possibles :**
- `IllegalArgumentException` : niveau invalide


### La classe AccessValidator

Contient la logique de vérification d’accès entre un employé et une porte.

**Exceptions possibles :**
- `SecurityException` : accès refusé

### La classe AccessLog

Stocke en mémoire l’historique des tentatives d’accès.

## Compétences développées

Ce projet m'a permis de travailler sur :
- l’application du SRP
- la composition et l’agrégation
- la séparation claire des responsabilités
- la conception orientée objet propre et maintenable
- 

---

**MERCI !!**