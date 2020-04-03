# summary
jacocoによるカバレッジ計測がどう実現されているかを確認したい．
逆コンパイルしてバイトコードの中身を確認する．

# usage
```bash
$ # 初期セットアップ
$ ./run.sh init

$ # 生成
$ ./run.sh generate Main.java

$ # 中身の確認
$ cat generated/Main-0-*.java   # 生ソース
$ cat generated/Main-1-*.java   # 生ソース → コンパイル → 逆コンパイル
$ cat generated/Main-2-*.java   # 生ソース → コンパイル → jacoco書き換え → 逆コンパイル
```

# file example
入力javaファイル
```java
main() {
  Object o = null;
  System.out.println(o);
```

生成javaファイル（jacoco書き換え済み）
```java
main() {
  boolean aflag[] = $jacocoInit();  // メソッド文頭に挿入される初期化処理
  Object obj = null;
  aflag[1] = true;                  // その行を通過したかどうかをflag配列に格納
  System.out.println(obj);
  aflag[2] = true;                  // その行を通過したかどうかをflag配列に格納
```

# tools
decompile: jad
http://www.javadecompilers.com/jad

jacoco
https://www.eclemma.org/jacoco/
