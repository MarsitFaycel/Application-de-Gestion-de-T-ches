# Application de Gestion de Taches
Développez une application qui permet aux utilisateurs de créer, modifier et supprimer des tâches. Vous pouvez inclure des fonctionnalités telles que la priorisation des tâches, les rappels, et la catégorisation.

### Spécifications de l'Application de Gestion de Tâches

1. **Fonctionnalités de Base** :
   - Permet aux utilisateurs de créer, modifier et supprimer des tâches.
   - Fonctionnalité de priorisation des tâches.
   - Rappels pour les tâches à effectuer.
   - Catégorisation des tâches pour une meilleure organisation.

2. **Backend (Java 17)** :
   - Utilisation de Spring Boot pour créer une application backend RESTful.
   - Persistance des données avec Hibernate pour interagir avec la base de données.
   - Utilisation de Java 17 pour bénéficier des dernières fonctionnalités du langage.

3. **Frontend (React JS)** :
   - Utilisation de React JS pour la construction d'une interface utilisateur interactive et réactive.
   - Utilisation de Redux pour la gestion de l'état de l'application.
   - Styled Components pour la gestion des styles CSS avec des composants React.

4. **Gestion des Tâches** :
   - Création de tâches avec un formulaire comprenant un champ de titre, une description et une sélection de priorité.
   - Affichage de la liste des tâches avec des options de modification et de suppression.
   - Possibilité de modifier les détails d'une tâche existante.
   - Suppression de tâches avec une confirmation pour éviter les suppressions accidentelles.
   - Priorisation des tâches avec des options de filtrage et de tri basées sur la priorité.
   - Catégorisation des tâches avec la possibilité d'attribuer des tags ou des catégories à chaque tâche.

5. **Rappels pour les Tâches** :
   - Implémentation de rappels pour notifier les utilisateurs des tâches à effectuer.
   - Possibilité de définir des rappels pour une tâche spécifique à une date et heure précises.
   - Envoi de rappels sous forme de notifications à l'utilisateur à l'heure spécifiée.
   - Options de répétition et de désactivation des rappels configurables par l'utilisateur.

6. **Interface Utilisateur Réactive** :
   - Conception d'une interface utilisateur intuitive et réactive avec React JS.
   - Utilisation d'animations et de transitions pour une expérience utilisateur fluide.
   - Gestion des états de chargement et des erreurs pour une expérience utilisateur sans faille.

7. **Sécurité** :
   - Authentification des utilisateurs avec JSON Web Tokens (JWT) pour sécuriser les endpoints backend.
   - Validation des données côté client et côté serveur pour éviter les attaques XSS et CSRF.

8. **Tests et Qualité du Code** :
   - Écriture de tests unitaires et d'intégration pour garantir la fiabilité de l'application.
   - Utilisation d'outils comme JUnit, Mockito et Jest pour les tests.

