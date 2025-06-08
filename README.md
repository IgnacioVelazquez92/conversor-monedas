# 💱 Conversor de Monedas - Java Backend

Un conversor de monedas de línea de comandos desarrollado en **Java 17**, aplicando buenas prácticas de arquitectura como separación por capas (`api`, `logic`, `models`, `app`). Este proyecto fue creado como parte del desafío de formación Java Backend de **Alura Latam + Oracle Next Education**.

---

## 🚀 Funcionalidades

✅ Obtiene tasas de cambio en tiempo real desde la **ExchangeRate API**  
✅ Convierte entre USD y:

- 🇦🇷 **Peso argentino (ARS)**
- 🇧🇷 **Real brasileño (BRL)**
- 🇨🇴 **Peso colombiano (COP)**

✅ Permite conversiones **en ambos sentidos**:
- De **USD a moneda local**
- De **moneda local a USD**

✅ Menú interactivo por consola  
✅ Lógica desacoplada de la API (solo una consulta por sesión)  
✅ Manejo profesional de errores y separación de responsabilidades

---

## 📦 Estructura del Proyecto

conversorMonedas/
├── main # Clase Main - punto de entrada
├── api/ # Lógica de conexión con la API
├── logic/ # Conversión de monedas
├── models/ # Representación del JSON (modelo)
└── README.md


---

## 🧠 Tecnologías utilizadas

- Java 17+
- Gson (Google) para parseo de JSON
- API pública de [ExchangeRate](https://www.exchangerate-api.com/)
- Consola interactiva con `Scanner`

---

## 🛠 Cómo ejecutar

1. Cloná este repositorio
2. Abrilo con IntelliJ IDEA o cualquier IDE compatible con Java 17
3. Asegurate de tener Gson en tu classpath o como dependencia Maven
4. Ejecutá la clase `Main.java`

---

## 📈 Ejemplo de uso

===== CONVERSOR DE MONEDAS =====
1 - Peso argentino (ARS) → Dólar (USD)
2 - Dólar (USD) → Peso argentino (ARS)
3 - Real brasileño (BRL) → Dólar (USD)
4 - Dólar (USD) → Real brasileño (BRL)
5 - Peso colombiano (COP) → Dólar (USD)
6 - Dólar (USD) → Peso colombiano (COP)
7 - Salir
Elegí una opción: 2
Ingresá el monto a convertir: 100
100 USD = 90000 ARS



---

## ✨ Créditos

Proyecto realizado por **Ignacio Velazquez** como parte del desafío **Oracle Next Education - Backend Java**.

---


