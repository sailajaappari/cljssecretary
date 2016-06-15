(ns cljssecretary.dev
  (:require [cljssecretary.core :as core]))

(enable-console-print!)

(defn on-jsload []
  (core/main))
