(ns tools.drilling.uikit.native.text
  (:require [com.fulcrologic.fulcro-native.alpha.components :refer [react-factory]]
            ["react-native-paper" :as rnp]))

(def prim-text (react-factory rnp/Text))
(defn text [props & children]
  (prim-text (merge {} props) children))
(defn text-display-large [props & children]
  (prim-text (merge {:variant "displayLarge"} props) children))
(defn text-display-medium [props & children]
  (prim-text (merge {:variant "displayMedium"} props) children))
(defn text-display-small [props & children]
  (prim-text (merge {:variant "displaySmall"} props) children))

(defn text-headline-large [props & children]
  (prim-text (merge {:variant "headlineLarge"} props) children))
(defn text-headline-medium [props & children]
  (prim-text (merge {:variant "headlineMedium"} props) children))
(defn text-headline-small [props & children]
  (prim-text (merge {:variant "headlineSmall"} props) children))

(defn text-title-large [props & children]
  (prim-text (merge {:variant "titleLarge"} props) children))
(defn text-title-medium [props & children]
  (prim-text (merge {:variant "titleMedium"} props) children))
(defn text-title-small [props & children]
  (prim-text (merge {:variant "titleSmall"} props) children))

(defn text-body-large [props & children]
  (prim-text (merge {:variant "bodyLarge"} props) children))
(defn text-body-medium [props & children]
  (prim-text (merge {:variant "bodyMedium"} props) children))
(defn text-body-small [props & children]
  (prim-text (merge {:variant "bodySmall"} props) children))

(defn text-label-large [props & children]
  (prim-text (merge {:variant "labelLarge"} props) children))
(defn text-label-medium [props & children]
  (prim-text (merge {:variant "labelMedium"} props) children))
(defn text-label-small [props & children]
  (prim-text (merge {:variant "labelSmall"} props) children))

