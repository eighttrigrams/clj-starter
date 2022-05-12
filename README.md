# clj-starter

A very basic project with tests, automatic code reloading, and [rebel-readline](https://github.com/bhauman/rebel-readline).

See also: https://github.com/seancorfield/deps-new

## Getting started

Run the main function

    $ clj -X:run

Run tests

    $ clj -X:test:runner '{:dirs ["test"]}'

Run tests continuously

    $ clj -M:test:refresh

Develop with hot code reloading.

    $ clj -M:dev