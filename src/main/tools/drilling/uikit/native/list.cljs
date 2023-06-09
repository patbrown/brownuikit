(ns tools.drilling.uikit.native.list
  (:require [com.fulcrologic.fulcro-native.alpha.components :refer [react-factory]]
            ["react-native-paper" :as rnp]))

(def prim-list (react-factory rnp/List))
(def prim-list-accordion (react-factory rnp/List.Accordion))
(def prim-list-accordion-group (react-factory rnp/List.AccordionGroup))
(def prim-list-icon (react-factory rnp/List.Icon))
(def prim-list-item (react-factory rnp/List.Item))
(def prim-list-section (react-factory rnp/List.Section))
(def prim-list-subheader (react-factory rnp/List.Subheader))

(defn pc [tag]
  (fn [props & children]
    (tag props children)))

(def accordion (pc prim-list-accordion))
(def accordion-group (pc prim-list-accordion))
(def list-icon (pc prim-list-icon))
(def list-item (pc prim-list-section))
(def list-section (pc prim-list-section))
(def list-subheader (pc prim-list-subheader))
