(ns user)

(try
  (require 'reloader.core)
  ((resolve 'reloader.core/start) ["src"])
  (catch Exception _
    (require 'clojure.tools.namespace.repl)
    (defn reset []
      ((resolve 'clojure.tools.namespace.repl/refresh))
      (require 'orchestra.spec.test)
      (prn ((resolve 'orchestra.spec.test/instrument)))
      nil)))
