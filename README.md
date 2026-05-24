# MapApp - Projet Google Maps Android

## Partie 1 : Création du projet "Google Maps Activity"
### Objectif
Mettre en place la structure de base d'une application Android utilisant l'API Google Maps.
### Étapes réalisées
1. **Initialisation** : Configuration du projet avec le template "Google Maps Activity".
2. **Structure du projet** : `MapsActivity.java`, `activity_maps.xml`, `google_maps_api.xml`.
3. **Configuration du Manifest** : Permissions de base et déclaration de la clé.

## Partie 2 : Clé Google Maps API
### Objectif
Lier l'application aux services Google Maps.
### Étapes réalisées
1. **Génération** : Clé API créée sur la console Google Cloud.
2. **Intégration** : Clé insérée dans `res/values/google_maps_api.xml`.

## Partie 3 : Permissions et Logique Runtime
### Objectif
Gérer la localisation de l'utilisateur de manière sécurisée et interactive.
### Étapes réalisées
1. **Permissions Manifest** : Ajout de `ACCESS_FINE_LOCATION`.
2. **Vérification GPS** : Ajout de `buildAlertMessageNoGps()` pour détecter si le GPS est désactivé.

## Partie 4 : Implémentation de onMapReady()
### Objectif
Rendre la carte dynamique en suivant la position réelle.
### Étapes réalisées
1. **LocationManager** : Utilisation du `NETWORK_PROVIDER` pour des mises à jour rapides.
2. **Marqueurs** : Ajout de marqueurs lors des changements de position.

## Partie 5 : Gestion de la réponse aux permissions et Animation
### Objectif
Améliorer l'expérience utilisateur (UX) lors de la demande de permission et rendre les mouvements de caméra fluides.
### Étapes réalisées
1. **Gestion du Rappel (`onRequestPermissionsResult`)** : Interception du code 200 pour recharger la carte.
2. **Transitions fluides** : Utilisation de `animateCamera` pour un déplacement de vue professionnel.

## Partie 6 : Optimisation des Marqueurs (Version Propre)
### Objectif
Éviter la pollution visuelle de la carte en n'utilisant qu'un seul marqueur dynamique pour l'utilisateur.
### Étapes réalisées
1. **Référence Unique** : Ajout d'une variable `private Marker currentMarker;` au niveau de la classe.
2. **Logique de Mise à jour** : 
   - Si le marqueur n'existe pas, il est créé.
   - S'il existe déjà, sa position est simplement mise à jour avec `currentMarker.setPosition(pos)`.
   - Cela permet d'avoir un seul point qui se déplace sur la carte au lieu d'une traînée de points.

### ✅ Checkpoint Final
- La carte est propre, seul un marqueur "Ma Position Actuelle" s'affiche et se déplace de façon fluide.
