(ns fns
  (:require [clojure.spec.alpha :as s]))

(defn greet [name]
  (prn (str "Hello, " name "!")))

(s/fdef greet
  :args (s/cat ::a string?))