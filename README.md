# re-grommet

__re-grommet__ adapts the excellent [grommet](https://grommet.github.io) UI library for 
simplified use with [reagent](https://github.com/reagent-project/reagent).  The approach is shamelessly copied
 from [soda-ash](https://github.com/gadfly361/soda-ash) which performs the same service 
 for the also excellent [semantic-ui-react](http://react.semantic-ui.com/introduction)

[![Clojars Project](http://clojars.org/re-grommet/latest-version.svg)](http://clojars.org/re-grommet)

## Usage

* Include the regrommet dependency in your project file

* In your source  refer to the re-grommet namespace
```clojure
(ns myapp.core
  (:require [re-grommet.core :as rg]))
```




## Examples

* Create a gromment _Anchor_.  Note the use of the Reagent `:>` syntax to refer to native React objects 
```clojure
(defn nav-link
  [uri title page]
  (let [selected-page (rf/subscribe [:page])]
    [:> rg/Anchor {:class (when (= page @selected-page) "active")
                   :href  uri}
     title]))
```


*  Create a simple footer.   
```clojure
(defn footer
  []
  [:> rg/Footer {:size "medium"}
   [:> rg/Title ]
   [:> rg/BoxRG {:direction "row"
                 :align "center"
                 :pad {:between "medium"}}
    [:> rg/Paragraph "2017 Re-Grommet"]]])
```

_More examples on the way..._

### Notes
* To avoid symbol collisions, Grommet __Box__ and __List__ have been named __BoxRG__ and __ListRG__ respectively
* Grommet icons are suffixed with __Icon__ such that the __Add__ icon should be referenced as __AddIcon__ in code
* This is  rather _alpha_ at this point, any comments, questions and PR's are welcme

### Todo
* Support the more complex Grommet components (e.g. Chart)

## License


Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
