# Proiect Joc de Luptă

## Descriere
Un joc de luptă în care Magi, Războinici și Arcași se confruntă într-o arenă. Există două tipuri de meciuri: **OneVsOne** și **AllForOne** (toți contra unui boss).

## Caracteristici

- **Magi**: Abilități magice, regenerare de mană.
- **Războinici**: Lovituri critice, gestionare energie.
- **Arcași**: Atacuri la distanță, gestionare săgeți.
- **Boss**: Puteri speciale, regenerare viață.

## Structura Codului

- **Caracter**: Clasa de bază cu proprietăți comune.
- **Mag, Razboinic, Arcas**: Subclase cu abilități specifice.
- **Meci**: Clasa de bază pentru meciuri.
  - **OneVsOne**: Duel între 2 luptători.
  - **AllForOne**: Meci între mai mulți luptători și un boss.