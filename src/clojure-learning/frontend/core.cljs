(ns markdown-notes.frontend.core
  (:require [reagent.core :as r]
            [ajax.core :refer [POST]]))

(defonce state (r/atom {:markdown "" :preview ""}))

(defn render-markdown [text]
  (POST "/render"
        {:params {:markdown text}
         :handler #(swap! state assoc :preview %)}))

(defn editor []
  [:div
   [:h2 "Markdown Editor"]
   [:textarea {:rows 10 :cols 60
               :value (:markdown @state)
               :on-change #(let [text (.. % -target -value)]
                             (swap! state assoc :markdown text)
                             (render-markdown text))}]])

(defn preview []
  [:div
   [:h2 "Preview"]
   [:div {:dangerouslySetInnerHTML {:__html (:preview @state)}}]])

(defn app []
  [:div
   [editor]
   [preview]])

(defn ^:export init []
  (r/render [app] (.getElementById js/document "app")))
