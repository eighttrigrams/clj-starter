# clj-starter

A basic project setup.

See also: [seancorfield/deps-new](https://github.com/seancorfield/deps-new)

## Getting started

Run the main function

    $ clj -X:run

### Run tests 

#### ... with the Cognitect test-runner

See [cognitect-labs/test-runner](https://github.com/cognitect-labs/test-runner)

    $ clj -X:test:runner '{:dirs ["test"]}'

#### ... continuously with test-refresh

See [jakemcc/test-refresh](https://github.com/jakemcc/test-refresh)

    $ clj -M:test:refresh

### Develop

Run

    $ clj -M:dev

#### ... with clojure.tools.namespace.repl

See [clojure/tools.namespace](https://github.com/clojure/tools.namespace)

By default

    user=> (refresh)
    
is provided to reload changed namespaces.

#### ... with clj-reloader

Instead of using `(refresh)`, code can also be loaded automatically.

See [thiru/clj-reloader](https://github.com/thiru/clj-reloader)

    $ clj -M:dev:auto

#### ... with rebel-readline

See [bhauman/rebel-readline](https://github.com/bhauman/rebel-readline) .

    $ clj -M:dev:rebel

#### ... with clj-reloader and rebel-readline

Run

    $ clj -M:dev:auto:rebel

### Package and execute

See [tonsky/uberdeps](https://github.com/tonsky/uberdeps)

    $ clj -M:package <package name>.jar
    $ java -cp <package name>.jar clojure.main -m main