#!/bin/bash
mvn compile dependency:copy-dependencies package
java -jar ./target/book-mvn-1.3.jar input.json output.json
        # input default: ./input.json
        # output default: ~/output.json

        # https://www.mojohaus.org/exec-maven-plugin/examples/example-exec-for-java-programs.html
        # https://ja.getdocs.org/maven-how-to-create-a-manifest-file-with-maven
        # https://qiita.com/seijikohara/items/ba259aedddff726d995a
