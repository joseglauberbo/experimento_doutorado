#!/bin/bash

# Define a variável base para a raiz do projeto
PROJECT_ROOT="projeto_java"

# Cria a estrutura de diretórios
mkdir -p $PROJECT_ROOT/src/main/java/com/example

# Cria o arquivo App.java
cat > $PROJECT_ROOT/src/main/java/com/example/App.java <<EOL
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
EOL

# Cria o arquivo build.gradle
cat > $PROJECT_ROOT/build.gradle <<EOL
plugins {
    id 'java'
}

group 'com.example'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
}

test {
    useJUnitPlatform()
}

jar {
    manifest {
        attributes(
            'Main-Class': 'com.example.App'
        )
    }
}
EOL

# Cria o arquivo settings.gradle
cat > $PROJECT_ROOT/settings.gradle <<EOL
rootProject.name = 'projeto_java'
EOL

echo "Estrutura de projeto criada com sucesso em $PROJECT_ROOT"
