TO be completed

This is the wrapper for processing tweets using CMU Twitter Parser

### Prerequisites ###
Py4j
    * install
        * git clone https://github.com/bartdag/py4j.git
        * ./gradlew assemble

### How to use ###
1. create a lib folder and copy the twitter parse in the folder

2. compile
`mvn install:install-file -Dfile=./mylib/ark-tweet-nlp-0.3.2.jar -DgroupId=com.mylib -DartifactId=mylib -Dversion=1.0 -Dpackaging=jar -DlocalRepositoryPath=./lib`

`mvn clean compile assembly:single`

3. start the jar
`java -jar ./target/CMUTwitterParserWrapper-0.0.1-SNAPSHOT-jar-with-dependencies.jar`


### demo code ###
see in demo.py
