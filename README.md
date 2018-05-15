# Editor Prototype
[![Build Status](https://travis-ci.org/akshlu/editor-prototype.svg?branch=master)](https://travis-ci.org/akshlu/editor-prototype)

ClojureScript prototype of web-based editor for mobile development

## Setup

To get an interactive development environment run:

    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein do clean, cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL. 

### References
- [ClojureScript](https://clojurescript.org)
- [Reagent](https://reagent-project.github.io)
- [re-frame](https://github.com/Day8/re-frame)


## License

Copyright © 2018 Alexey Ustinov

Distributed under the MIT License.
