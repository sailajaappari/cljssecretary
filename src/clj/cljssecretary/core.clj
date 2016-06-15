(ns cljssecretary.core
  (:require [cljssecretary.server :as server])
  (:gen-class))


(defn start! []
  (server/start!))

(defn -main []
  (start!))
