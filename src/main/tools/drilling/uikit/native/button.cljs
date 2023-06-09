(ns tools.drilling.uikit.native.button
  (:require [com.fulcrologic.fulcro-native.alpha.components :refer [react-factory]]
            ["react-native-paper" :as rnp]))

(def prim-button (react-factory rnp/Button))
(defn button [props & children]
  (prim-button (merge {} props) children))
(defn button-contained [props & children]
  (prim-button (merge {:mode "contained"} props) children))
(defn button-outlined [props & children]
  (prim-button (merge {:mode "outlined"} props) children))
(defn button-elevated [props & children]
  (prim-button (merge {:mode "elevated"} props) children))
(defn button-contained-tonal [props & children]
  (prim-button (merge {:mode "contained-tonal"} props) children))
