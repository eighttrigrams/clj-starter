# clj-starter

A very basic project setup.

See also: https://github.com/seancorfield/deps-new

## Getting started

Run the main function

    $ clj -X:run

### Run tests 

#### ... with the Cognitect test-runner

See [test-runner](https://github.com/cognitect-labs/test-runner)

    $ clj -X:test:runner '{:dirs ["test"]}'

#### ... continuously with test-refresh

See [test-refresh](https://github.com/jakemcc/test-refresh)

    $ clj -M:test:refresh

### Develop

Run

    $ clj -M:dev

#### ... with clojure.tools.namespace.repl

See [tools.namespace](https://github.com/clojure/tools.namespace)

Whenever `:dev` is used without `:auto` (see next section)

    user=> (refresh)
    
is provided to reload changed namespaces.

#### ... with clj-reloader

See [clj-reloader](https://github.com/thiru/clj-reloader)

    $ clj -M:dev:auto

#### ... with rebel-readline

See [rebel-readline](https://github.com/bhauman/rebel-readline) .

    $ clj -M:dev:rebel

#### ... with clj-reloader and rebel-readline

Run

    $ clj -M:dev:auto:rebel