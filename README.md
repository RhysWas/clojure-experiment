# Markdown Notes App (Clojure/ClojureScript)

A minimal Markdown notes editor with live preview, built using Clojure and ClojureScript.

## 🧰 Requirements

Before running the app, make sure you have the following installed:

- [Java 8+](https://adoptopenjdk.net/)
- [Leiningen](https://leiningen.org/) – Clojure project/dependency manager
- Node.js (only if using frontend libraries that depend on npm)

## 🚀 Running the App

1. **Clone or download this project**

```bash
git clone https://github.com/yourusername/markdown-notes.git
cd markdown-notes
```

2. **Start the backend**

```bash
lein ring server
```

3. **Compile and watch ClojureScript**

```bash
lein cljsbuild auto
```

4. **Visit in your browser**

Open [http://localhost:3000](http://localhost:3000) to see the app.

## 📝 Features

- Markdown input area with live preview
- Backend-rendered markdown for consistency
- Reagent-based frontend using Re-frame patterns (expandable)

## 🔧 Tech Stack

- Clojure (Ring + Compojure)
- ClojureScript (Reagent)
- markdown-clj (for Markdown parsing)

---

This project is ideal for learning Clojure's functional architecture, frontend with ClojureScript, and building full-stack applications.
