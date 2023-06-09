(ns tools.drilling.uikit.native.divider
  (:require [com.fulcrologic.fulcro-native.alpha.components :refer [react-factory]]
            ["react-native-paper" :as rnp]))

(def prim-divider (react-factory rnp/Divider))
(defn divider [props & children]
  (prim-divider (merge {} props) children))

