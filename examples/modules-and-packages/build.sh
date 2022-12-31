#!/bin/bash

rm -rf target

# Compile and Package First.java
mkdir -p target/classes
javac -d target/classes $(find src/first -name "*.java")
jar -c -f target/first.jar -C target/classes .
rm -rf target/classes

# Compile and Package Second.java
mkdir -p target/classes
javac -d target/classes -p target/first.jar $(find src/second -name "*.java")
jar -c -f target/second.jar -C target/classes .
rm -rf target/classes
