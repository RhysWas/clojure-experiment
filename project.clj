(defproject markdown-notes "0.1.0-SNAPSHOT"
  :description "A minimal markdown notes app in Clojure/ClojureScript"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.11.60"]
                 [ring "1.10.0"]
                 [compojure "1.7.0"]
                 [reagent "1.2.0"]
                 [markdown-clj "1.11.5"]
                 [cljs-ajax "0.8.4"]]

  :plugins [[lein-ring "0.12.6"]
            [lein-cljsbuild "1.1.8"]]

  :ring {:handler markdown-notes.handler/app}

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src/markdown_notes/frontend"]
              :compiler {:main markdown-notes.frontend.core
                         :output-to "resources/public/js/app.js"
                         :output-dir "resources/public/js/out"
                         :asset-path "/js/out"
                         :optimizations :none
                         :source-map true
                         :pretty-print true}}]})
