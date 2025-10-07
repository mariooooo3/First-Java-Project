# First Java Project 🎮

Acesta este un proiect de joc în Java care simulează lupte între diferiți luptători. Proiectul este organizat pe pachete pentru **entități**, **meciuri** și **jocul principal**, folosind fișiere JSON pentru salvarea și încărcarea progresului.

---

## Structura proiectului

### Entitati
Clase pentru diferitele tipuri de personaje:
- `Caracter.java`
- `Mag.java`
- `Razboinic.java`
- `Arcas.java`
- `Boss.java`

### Meci
Clase pentru mecanica de lupte:
- `Meci.java`
- `OneVsOne.java` – Duel între doi luptători
- `AllForOne.java` – Lupte cu mai mulți participanți

### Joc
Clase pentru jocul propriu-zis și fișiere JSON:
- `Main.java` – Varianta standard a jocului
- `JsonMain.java` – Varianta care folosește JSON pentru salvare/încărcare
- `MiniGame.java` 
- `JSON.json` – Fișier JSON pentru salvare/încărcare
- `test1.json` – Fișier JSON de test

---

## Funcționalități

- **Entități diferite**: `Mag`, `Razboinic`, `Arcas`, `Boss`.
- **Meciuri între caractere**:
  - `OneVsOne` – Duel între doi luptători.
  - `AllForOne` – Lupte cu mai mulți participanți.
- **Alegerea atacurilor**: Fiecare luptător poate folosi atacuri diferite, în funcție de tipul său.
- **Statistici și victorii**: Sistem de urmărire a vieții și a victoriilor pentru fiecare luptător.
- **Fișiere JSON**: Salvarea și încărcarea progresului jocului.

---

## Cum să rulezi proiectul

1. Clonează proiectul:

```bash
git clone <link-repo-tău>
cd First-Java-Project
