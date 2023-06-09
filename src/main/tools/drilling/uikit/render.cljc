(ns tools.drilling.uikit.render)


(def frame-hierarchy [:platform :window :app])
(def display-hierarchy [:view :section :compound :molecule :atomic])
(def ui-hierarchy (into frame-hierarchy display-hierarchy))

(declare render-contents)

(defn render-contents [component-ids props])
