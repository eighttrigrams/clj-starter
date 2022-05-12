# clj-starter

A very basic project setup.

See also: https://github.com/seancorfield/deps-new

## Getting started

Run the main function

    $ clj -X:run

### Run tests with the Cognitect test-runner

See [test-runner](https://github.com/cognitect-labs/test-runner)

    $ clj -X:test:runner '{:dirs ["test"]}'

### Run tests continuously with test-refresh

See [test-refresh](https://github.com/jakemcc/test-refresh)

    $ clj -M:test:refresh

### Develop with clj-reload and rebel-readline

See [rebel-readline](https://github.com/bhauman/rebel-readline) and [clj-reloader](https://github.com/thiru/clj-reloader).

    $ clj -M:dev