#!/bin/bash

function init() {
  mkdir -p bin
  mkdir -p tmp

  # jad
  #wget -O tmp/jad-1.5.8g.zip http://www.javadecompilers.com/jad/Jad%201.5.8g%20for%20Windows%209x-NT-2000%20on%20Intel%20platform.zip
  #unzip tmp/jad-1.5.8g.zip -d bin/jad-1.5.8g

  # procyon
  #wget -O bin/procyon-decompiler-0.5.36.jar https://bitbucket.org/mstrobel/procyon/downloads/procyon-decompiler-0.5.36.jar

  # cfr
  wget -O bin/cfr-0.150.jar https://github.com/leibnitz27/cfr/releases/download/0.150/cfr-0.150.jar

  # jacoco
  #   TODO: jacoco latest(v0.8.5) cannot be decompiled with jad and JD-GUI but v0.8.2 works.
  wget -O tmp/jacoco-0.8.6.zip http://search.maven.org/remotecontent?filepath=org/jacoco/jacoco/0.8.6/jacoco-0.8.6.zip
  unzip tmp/jacoco-0.8.6.zip -d bin/jacoco-0.8.6
}

function generate() {
  src="${1%.*}"

  mkdir -p generated

  # step0 orig
  cp $src.java generated/$src-0-orig.java

  # step1 compile -> decompile
  echo 'generating "generated/'$src'-1-compile-decompile.java"'
  echo '>> compile'
  javac -d tmp/ $src.java

  echo '>> decompile'
  $cfr tmp/$src.class --outputdir tmp/
  cp tmp/$src.java generated/$src-1-compile-decompile.java

  # step3 compile -> jacoco-instrument -> decompile
  echo 'generating "generated/'$src'-2-compile-jacoco-decompile.java"'
  echo '>> compile'
  javac -d tmp/ $src.java

  echo '>> jacoco instrument'
  $jacococli instrument tmp/$src.class --dest tmp/j/

  echo '>> decompile'
  $cfr tmp/j/$src.class --outputdir tmp/
  cp tmp/$src.java generated/$src-2-compile-jacoco-decompile.java
}

jad=bin/jad-1.5.8g/jad.exe
jacococli="java -jar bin/jacoco-0.8.6/lib/jacococli.jar"
jacocoagent="java -jar bin/jacoco-0.8.6/lib/jacocoagent.jar"
#procyon="java -jar bin/procyon-decompiler-0.5.36.jar"
cfr="java -jar bin/cfr-0.150.jar"
case "$1" in
  init)
      init
      ;;
  generate)
      generate $2
      ;;
esac
