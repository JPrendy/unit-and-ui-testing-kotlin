# Unit and Ui testing us

## Description

The existing repository is a template, I can generate new repositories with the same directory structure, branches, and files.

## Contents

- [How to run the project locally](#how-to-run-the-project-locally)
- [Helpful resources](#helpful-resources)


## Setup Steps

Go to the `app/build.gradle` and add the following and then sync the gradle

```
androidTestImplementation 'androidx.test:rules:1.1.1'
androidTestImplementation 'androidx.test.ext:truth:1.1.0'
androidTestImplementation 'androidx.test.ext:junit:1.1.0'
```

Install Jest.

```
npm install --save-dev jest
``` 

## How to run the project locally

To run the unit tests locally

```
./gradlew testdebugUnitTest
```

## Helpful resources

The following link provides an intro on how you can use Kotlin with Android including the Java examples.
- [link](https://developer.android.com/kotlin/get-started).

A good guide for writing espresso tests in Kotlin.
- [link](https://www.raywenderlich.com/949489-espresso-testing-and-screen-robots-getting-started).

Guide for how to use Fastlane to run tests.
- [link](https://docs.fastlane.tools/getting-started/android/running-tests/).
