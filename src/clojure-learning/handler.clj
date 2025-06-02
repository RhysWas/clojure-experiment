(ns markdown-notes.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [markdown.core :as md]))

(defn markdown-page [text]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (md/md-to-html-string text)})

(defroutes app-routes
  (GET "/" [] {:status 200
               :headers {"Content-Type" "text/html"}
               :body (slurp "resources/public/index.html")})
  (POST "/render" [markdown]
        (markdown-page markdown))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
