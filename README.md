# Proiect Joc de Luptă

Un joc de luptă în care Magi, Războinici și Arcași se confruntă într-o arenă. Există două tipuri de meciuri: OneVsOne și AllForOne (toți contra unui boss).

## Caracteristici

- **Magi**: Abilități magice, regenerare de mană.
- **Războinici**: Lovituri critice, gestionare energie.
- **Arcași**: Atacuri la distanță, gestionare săgeți.
- **Boss**: Puteri speciale, regenerare viață.

## Structura Codului

- **Caracter.java**: Clasa de bază cu proprietăți comune. [Vezi fișierul](Caracter.java)
- **Mag.java**: Subclasă cu abilități specifice pentru Magi. [Vezi fișierul](Mag.java)
- **Razboinic.java**: Subclasă cu abilități specifice pentru Războinici. [Vezi fișierul](Razboinic.java)
- **Arcas.java**: Subclasă cu abilități specifice pentru Arcași. [Vezi fișierul](Arcas.java)
- **Meci.java**: Clasa de bază pentru meciuri. [Vezi fișierul](Meci.java)
- **OneVsOne.java**: Duel între 2 luptători. [Vezi fișierul](OneVsOne.java)
- **AllForOne.java**: Meci între mai mulți luptători și un boss. [Vezi fișierul](AllForOne.java)

## Descrierea Meciurilor

- **OneVsOne**: Un meci între 2 luptători (poate fi un Mag, Războinic sau Arcaș) care se luptă pentru a înfrunta și înfrânge unul pe celălalt.
- **AllForOne**: Mai mulți luptători (Magi, Războinici sau Arcași) se unesc pentru a înfrunta un boss puternic cu abilități speciale.

## Instalare și rulare

1. Clonează repository-ul.
2. Compilează fișierele `.java`.
3. Rulează jocul pentru a începe meciurile.

Acesta este un joc bazat pe abilități de programare orientată pe obiecte, cu un sistem de luptă dinamic și interesant!
