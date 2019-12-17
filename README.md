# Scala templates for Open FaaS

## Versions
There are templates for scala 2.12

## Usage:

```shell
faas-cli template pull https://github.com/billius/scala-template-faas.git
faas-cli new my-function-in-scala --lang scala
```

You will find in the newly created directory `scala`:
- the [sbt directory structure](https://www.scala-sbt.org/1.0/docs/Directories.html)
  - function/Handler.scala: entrypoint
  - build.sbt: to declare dependency scopes
  - Certain dependencies are added for you:
    - [org.scalatest %% scalatest](http://www.scalatest.org/): if you feel the urge to write tests
    - akka-http, so you only have to define a routeMap

## template
# scala-template-faas
