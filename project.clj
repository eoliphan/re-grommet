(defproject re-grommet "0.1.0-SNAPSHOT"
  :description "Re-grommet is an interface between ClojureScript Reagent and Grommet"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [cljsjs/grommet "1.3.4-0"]
                 [org.clojure/clojurescript "1.9.229"]
                 [reagent "0.6.0"]]
  ;:main ^:skip-aot re-grommet.core
  :target-path "target/%s"
  ;:profiles {:uberjar {:aot :all}}
  )
