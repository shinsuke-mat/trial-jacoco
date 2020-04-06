#!/bin/bash

function init() {
  mkdir -p bin
  mkdir -p tmp

  # jad
  #wget -O tmp/jad-1.5.8g.zip http://www.javadecompilers.com/jad/Jad%201.5.8g%20for%20Windows%209x-NT-2000%20on%20Intel%20platform.zip
  #unzip tmp/jad-1.5.8g.zip -d bin/jad-1.5.8g

  # procyon
  wget -O bin/procyon-decompiler-0.5.36.jar https://bitbucket.org/mstrobel/procyon/downloads/procyon-decompiler-0.5.36.jar
  
  # jacoco
  #   TODO: jacoco latest(v0.8.5) cannot be decompiled with jad and JD-GUI but v0.8.2 works.
  wget -O tmp/jacoco-0.8.2.zip http://search.maven.org/remotecontent?filepath=org/jacoco/jacoco/0.8.2/jacoco-0.8.2.zip
  unzip tmp/jacoco-0.8.2.zip -d bin/jacoco-0.8.2
}

function generate() {
  src="${1%.*}"

  mkdir -p generated

  # step0 orig
  cp $src.java generated/$src-0-orig.java

  # step1 compile -> decompile
  javac -d tmp/ $src.java
  $procyon tmp/$src.class -o tmp/
  cp tmp/$src.java generated/$src-1-compile-decompile.java

  # step3 compile -> jacoco-instrument -> decompile
  javac -d tmp/ $src.java
  $jacococli instrument tmp/$src.class --dest tmp/j/
  $procyon tmp/j/$src.class -o tmp/
  cp tmp/$src.java generated/$src-2-compile-jacoco-decompile.java
}

jad=bin/jad-1.5.8g/jad.exe
jacococli="java -jar bin/jacoco-0.8.2/lib/jacococli.jar"
jacocoagent="java -jar bin/jacoco-0.8.2/lib/jacocoagent.jar"
procyon="java -jar bin/procyon-decompiler-0.5.36.jar"
case "$1" in
  init)
      init
      ;;
  generate)
      generate $2
      ;;
esac
