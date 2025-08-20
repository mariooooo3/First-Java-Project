# First Java Project 🎮

Acesta este un proiect de joc în Java care simulează lupte între diferiți luptători. Proiectul este organizat pe pachete pentru **entități**, **meciuri** și **jocul principal**.  

---

## Structura proiectului

- **[Entitati](Entitati/)** – Clasele pentru diferitele tipuri de personaje:
  - [Caracter.java](Entitati/Caracter.java)
  - [Mag.java](Entitati/Mag.java)
  - [Razboinic.java](Entitati/Razboinic.java)
  - [Arcas.java](Entitati/Arcas.java)
  - [Boss.java](Entitati/Boss.java)

- **[Meci](Meci/)** – Clase pentru mecanica de lupte:
  - [Meci.java](Meci/Meci.java)
  - [OneVsOne.java](Meci/OneVsOne.java)
  - [AllForOne.java](Meci/AllForOne.java)

- **[Joc](Joc/)** – Clase pentru jocul propriu-zis și fișiere JSON:
  - [Main.java](Joc/Main.java)
  - [MiniGame.java](Joc/MiniGame.java)
  - [JSON.json](Joc/JSON.json)
  - [test1.json](Joc/test1.json)

---

## Funcționalități

- **Entități diferite**: `Mag`, `Razboinic`, `Arcas`, `Boss`.
- **Meciuri între caractere**:
  - `OneVsOne`: Duel între doi luptători.
  - `AllForOne`: Lupte cu mai mulți participanți.
- **Alegerea atacurilor**: Fiecare luptător poate folosi atacuri diferite, în funcție de tipul său.
- **Statistici și victorii**: Sistem de urmărire a vieții și a victoriilor pentru fiecare luptător.
- **Fișiere JSON**: Pentru a salva și încărca progresul jocului.

---

## Cum să rulezi proiectul

1. Clonează proiectul:

```bash
git clone <link-repo-tău>
cd First-Java-Project
