(ns tools.drilling.uikit.browser
  (:require [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
            [com.fulcrologic.fulcro.application :as app]
            [com.fulcrologic.fulcro.algorithms.react-interop :refer [react-factory]]
            [tools.drilling.uikit.u :refer [pc ppc]]
            ["@mui/material" :as mui]))

(def t (react-factory mui/Typography))
(def text (pc t))

(defsc Root [this props]
  {}
  (text {} "this is cool"))

(defonce SPA (atom nil))

(defn ^:export start
  {:dev/after-load true}
  []
  (app/mount! @SPA Root "app"))

(defn init []
  (reset! SPA (app/fulcro-app {}))
  (start))

