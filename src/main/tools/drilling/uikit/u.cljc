(ns tools.drilling.uikit.u)

(defn pc [tag]
  (fn [props & children]
    (tag props children)))
(defn ppc [tag base-props]
  (fn [props & children]
    (tag (merge base-props props) children)))
