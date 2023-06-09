(ns tools.drilling.uikit.native.fab
  (:require [com.fulcrologic.fulcro-native.alpha.components :refer [react-factory]]
            ["react-native-paper" :as rnp]))

(def prim-fab (react-factory rnp/FAB))
(defn fab [props & children]
  (prim-fab (merge {} props) children))
(defn fab-plus [props & children]
  (prim-fab (merge {:icon "plus"} props) children))

