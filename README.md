# Unit and Ui testing using Kotlin

## Description

The following is a project that uses Kotlin and has unit and ui tests written in Kotlin

## Contents

- [Setup Steps](#setup-steps)
- [Tools](#tools)
- [How to run the project locally](#how-to-run-the-project-locally)
- [Helpful resources](#helpful-resources)


## Setup Steps

To setup Android for espresso tests, go to the `app/build.gradle` and add the following and then sync the gradle

```
androidTestImplementation 'androidx.test:rules:1.1.1'
androidTestImplementation 'androidx.test.ext:truth:1.1.0'
androidTestImplementation 'androidx.test.ext:junit:1.1.0'
```

## Tools
- Fastlane
- Github Actions 

## How to run the project locally

To run the unit tests locally

```
./gradlew testdebugUnitTest
```

To run the ui tests locally, but first we need an emulator to be open.

```
./gradlew connectedCheck
```

## Helpful resources

The following link provides an intro on how you can use Kotlin with Android including the Java examples.
- [link](https://developer.android.com/kotlin/get-started).

A good guide for writing espresso tests in Kotlin.
- [link](https://www.raywenderlich.com/949489-espresso-testing-and-screen-robots-getting-started).

Another guide on how to write espresso tests in Kotlin
- [link](https://developer.android.com/training/testing/ui-testing/espresso-testing).

Guide for how to use Fastlane to run tests.
- [link](https://docs.fastlane.tools/getting-started/android/running-tests/).
