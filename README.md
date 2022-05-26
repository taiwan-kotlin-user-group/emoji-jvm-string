# emoji-jvm-string

> Let's access emoji like Enum and print it easily 😎

# For Gradle Dependency

```groovy
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    implementation "com.github.PureFuncInc:emoji-jvm-string:1.0.0"
}
```

# For Gradle Kotlin Dependency

```kotlin
repositories {
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    implementation("com.github.PureFuncInc:emoji-jvm-string:1.0.0")
}
```

# How to use

* Java
```java
System.out.printf("Damn it! Who write these shit %s%s%s%n",Emoji.PILE_OF_POO,Emoji.PILE_OF_POO,Emoji.PILE_OF_POO);
```

* Kotlin
```kotlin
println("Damn it! Who write these shit ${Emoji.PILE_OF_POO}${Emoji.PILE_OF_POO}${Emoji.PILE_OF_POO}")
```

