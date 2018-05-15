(ns editor-prototype.components
  (:require [reagent.core :as reagent]))


(defmulti button :platform)


(defmethod button :ios [{:keys [text]}]
  [:div.editor-button.ios text])


(defmethod button :android [{:keys [text]}]
  [:div.editor-button.android text])