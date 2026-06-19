#!/bin/bash
if [ -n "$BASH_VERSION" ]; then
  shopt -s globstar
fi
javac -d bin -cp lib/* src/**/*.java
java -cp bin:lib/* main.MainApplication
