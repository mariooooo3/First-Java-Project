# Joc de Luptă – Proiect Java

Un joc de luptă în care **Magi**, **Războinici** și **Arcași** se confruntă într-o arenă. Există două tipuri de meciuri: **OneVsOne** și **AllForOne** (toți contra unui boss).

## 🧠 Caracteristici

- **Magi**: Abilități magice, regenerare de mană  
- **Războinici**: Lovituri critice, gestionare energie  
- **Arcași**: Atacuri la distanță, gestionare săgeți  
- **Boss**: Puteri speciale, regenerare viață  

## 🧱 Structura Codului

- [`Caracter.java`](joc/Caracter.java) – Clasa de bază cu proprietăți comune  
- `Mag.java` – Subclasă cu abilități specifice pentru Magi  
- `Razboinic.java` – Subclasă cu abilități specifice pentru Războinici  
- `Arcas.java` – Subclasă cu abilități specifice pentru Arcași  
- [`Meci.java`](joc/Meci.java) – Clasa de bază pentru tipurile de meci  
- `OneVsOne.java` – Duel între 2 luptători  
- `AllForOne.java` – Meci între mai mulți luptători și un boss  
- [`MiniGame.java`](joc/MiniGame.java) – Punctul de pornire al jocului  

## ⚔️ Descrierea Meciurilor

- **OneVsOne**: Un meci între 2 luptători (Mag, Războinic sau Arcaș)  
- **AllForOne**: Mai mulți luptători se unesc pentru a înfrunta un boss puternic  

## ▶️ Instalare și Rulare

```bash
git clone https://github.com/mariooooo3/First-Java-Project.git
cd First-Java-Project/joc
javac *.java
java MiniGame
