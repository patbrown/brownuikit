(ns tools.drilling.uikit.native.tooltip
  (:require [com.fulcrologic.fulcro-native.alpha.components :refer [react-factory]]
            ["react-native-paper" :as rnp]))

(def prim-tooltip (react-factory rnp/Tooltip))
(defn tooltip [props & children]
  (prim-tooltip (merge {} props) children))
