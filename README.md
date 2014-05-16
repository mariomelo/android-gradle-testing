Unit Testing Android with Gradle
======================

This repo is a small sample of unit tests running local on an Android Studio project (that is, a gradle based project).

# Instructions

* Clone the repo
* **Create a local.properties file** with your local Android SDK path (take a look at the ci.properties file, it's just like that)
* Run ***gradle tdd***

The tests will run quickly and generate a lot of reports at test/build.

# Motivations

Run tests quicly and extract code metrics such as code coverage.

# Thanks

Adam Porter, who created the project I used as a bootstrap.

# But hey... Isn't TDD dead?

I don't think so, but you can keep testing your app only in your device/emulator if you like.
