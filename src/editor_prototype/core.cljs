(ns editor-prototype.core
    (:require
      [reagent.core :as reagent]
      [editor-prototype.components :as components]))


(enable-console-print!)


(defonce app-state (reagent/atom {:text "Editor Prototype"}))


(defn hello-world []
  [:div
   [:h2 (:text @app-state)]
   [:h4 "Edit this and watch it change!"]])


(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
