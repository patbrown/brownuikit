(ns tools.drilling.uikit.native
  (:require [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
            [com.fulcrologic.fulcro-native.expo-application-40 :as expo]            
            [com.fulcrologic.fulcro.application :as app]
            ["react-native" :as rn]
            ["react-native-paper" :as rnp]
            ["react-native-safe-area-context" :as rnsac]
            [tools.drilling.uikit.native.box :refer [box]]            
            [tools.drilling.uikit.native.button :refer [button button-contained button-outlined button-elevated button-contained-tonal]]
            [tools.drilling.uikit.native.divider :refer [divider]]
            [tools.drilling.uikit.native.fab :refer [fab fab-plus]]
            [tools.drilling.uikit.native.list :refer [accordion accordion-group list-icon list-item list-section list-subheader]]
            [tools.drilling.uikit.native.text :refer [text
                                                      text-display-large text-display-medium text-display-small
                                                      text-headline-large text-headline-medium text-headline-small
                                                      text-title-large text-title-medium text-title-small
                                                      text-body-large text-body-medium text-body-small
                                                      text-label-large text-label-medium text-label-small
                                                      ]]
            [tools.drilling.uikit.native.tooltip :refer [tooltip]]
            [com.fulcrologic.fulcro-native.alpha.components :refer [react-factory]]))

(def scroll-view (react-factory rn/ScrollView))
(def safe-area-provider (react-factory rnsac/SafeAreaProvider))
(def safe-area (react-factory rnsac/SafeAreaView))
(def paper-provider (react-factory rnp/PaperProvider))

(defn window [& children]
  (safe-area-provider
   {}
   (paper-provider
    {}
    (safe-area
     {}
     (scroll-view
      {}
      children)))))

(defsc Root [this props]
  {}

  (window (box {:key "a"}
               (accordion-group
                {}
                (accordion {:title "YOUR MOMMA"}
                           (list-item {:title "first"
                                       :description "Your mom"})
                           (list-item {:title "second"
                                       :description "Your mom"})))
               (text-display-small {:key "TEXT"} "TEXT")
               (divider {})
               (text {} "display")
               (divider {})
               (text-display-large {:key "tdl"} "text display large")
               (text-display-medium {:key "tdm"} "text display medium")
               (text-display-small {:key "tds"} "text display small")
               (divider {})
               (text {} "headline")
               (divider {})
               (text-headline-large {:key "thl"} "text headline large")
               (text-headline-medium {:key "thm"} "text headline medium")
               (text-headline-small {:key "ths"} "text headline small")
               (divider {})
               (text {} "title")
               (divider {})
               (text-title-large {:key "ttl"} "text title large")
               (text-title-medium {:key "ttm"} "text title medium")
               (text-title-small {:key "tts"} "text title small")
               (divider {})
               (text {} "body")
               (divider {})
               (text-body-large {:key "tbl"} "text body large")
               (text-body-medium {:key "tbm"} "text body medium")
               (text-body-small {:key "tbs"} "text body small")
               (divider {})
               (text {} "label")
               (divider {})
               (text-label-large {:key "tll"} "text label large")
               (text-label-medium {:key "tlm"} "text label medium")
               (text-label-small {:key "tls"} "text label small")
               (divider {})
               (text-display-small {:key "BUTTONS"} "BUTTONS")
               (divider {})
               ;; Tooltip is broken, it expects a string?
               #_(tooltip {:title "text display medium"
                           :children "tt"})
               (button {:key "tt"} "regular")
               (button-contained {} "contained")
               (button-outlined {} "outlined")
               (button-elevated {} "elevated")
               (button-contained-tonal {} "contained tonal")
               (divider {})
               (text-display-small {:key "FABS"} "FABS")
               (divider {})
               (fab-plus {} " "))))

(defonce SPA (atom nil))

(defn ^:export start
  {:dev/after-load true}
  []
  (app/mount! @SPA Root :nada))

(defn init []
  (reset! SPA (expo/fulcro-app {}))
  (start))
