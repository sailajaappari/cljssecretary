(ns cljssecretary.core
    (:require [reagent.core :as r]
              [ajax.core :as ajax]
              [secretary.core :as secretary :refer-macros [defroute]]))

(enable-console-print!)

(secretary/set-config! :prefix "#")

(defroute "/user/:id" [id]
  (js/console.log (str "User: " id)))

(secretary/dispatch! "users/gf3")

(defn root-component []
  (fn []
    [:div
     [:h1 "Hello world!"]
     [:span "Loaded stuff in the background:"]]))

(defn ^:export main []
  (r/render-component
   [root-component]
   (js/document.getElementById "app")))
