(ns user)

(try
  (require '[reloader.core :refer :all])
  ((resolve 'reloader.core/start) ["src"])
  (catch Exception _ nil))
  