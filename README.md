# Context

This is a project which try to integrate Cucumber test with Spring boot, buy not completely finished

## Prerequisite

- JDK7+
- maven 3.6.3
- IntelliJ IDEA

## Instruction to run

The port of application is 8083.

1. The class `src/main/java/qilin/zhang/test/AddressModification/AddressModificationApplication` is the application class of Spring, after you run the main method of this class. You can type url start with: http://localhost:8083/
2. To initialization the subscriber of users, you can go into http://localhost:8083/init
3. To modify an subscriber's address, you can go http://localhost:8083/init/modify/{channelID}/address={address}, with which **channelID** is the channel that an advisor connects to and **address** is the new address you want modify to.

## Problems

This project is not finished, the part of test is the same with another repository: [TestAuto-Cucumber](https://github.com/qilingit/TestAuto-Cucumber)

So the part of test without Springboot is the same with that repository.