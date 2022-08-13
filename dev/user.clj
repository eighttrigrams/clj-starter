(ns user)

(try
  (require 'reloader.core)
  ((resolve 'reloader.core/start) ["src"])
  (catch Exception _
    (require 'clojure.tools.namespace.repl)
    (defn refresh [] ((resolve 'clojure.tools.namespace.repl/refresh)))
    nil))

(defn invoke
  "Resolves `sym`, then invokes it with `args`. Useful for avoiding
  compile-time dependency on `sym`s namespace."
  [sym & args]
  (let [fun (requiring-resolve sym)]
    (apply fun args)))

(defn instrument []
  (require 'main :reload-all)
  (invoke 'orchestra.spec.test/instrument))
