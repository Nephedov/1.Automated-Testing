# Домашнее задание к занятию «1.1. Основы автоматизации»

## Решения
### Задание 1
#### Часть 1
 * <a href="https://github.com/Nephedov/1.Automated-Testing/blob/testng/build.gradle">build.gradle</a> для ветки testng.
 * <a href="https://github.com/Nephedov/1.Automated-Testing/blob/testng/src/test/java/ru/netology/CashbackHackServiceTest.java">CashbackHackServiceTest.java</a> - класс с автотестами.
 * <a href="https://github.com/Nephedov/1.Automated-Testing/issues/4">Баг-репорт</a> в issue.

Ветка <a href="https://github.com/Nephedov/1.Automated-Testing/tree/testng">testng</a> репозитория с проектом.
 #### Часть 2
 * <a href="https://github.com/Nephedov/1.Automated-Testing/blob/junit4/build.gradle">build.gradle</a> для ветки junit4.
 * <a href="https://github.com/Nephedov/1.Automated-Testing/blob/junit4/src/test/java/ru/netology/CashbackHackServiceTest.java">CashbackHackServiceTest.java</a> - класс с автотестами.
 * <a href="https://github.com/Nephedov/1.Automated-Testing/issues/5">Баг-репорт</a> - в issue.

Ветка <a href="https://github.com/Nephedov/1.Automated-Testing/tree/junit4">junit4</a> репозитория с проектом.
## Что было сделано
### Задание 1
* Создан Gradle проект c настроенным <a href="https://github.com/Nephedov/1.Automated-Testing/blob/main/.github/workflows/grandle.yml">grandle.yml</a> для Github Ci.
  #### Часть 1
  * Создана ветка <a href="https://github.com/Nephedov/1.Automated-Testing/tree/testng">testng</a> в которой:
    * Добавлена зависимость для testng в <a href="https://github.com/Nephedov/1.Automated-Testing/blob/testng/build.gradle">build.gradle</a>.
    * Реализованы автотесты <a href="https://github.com/Nephedov/1.Automated-Testing/blob/testng/src/test/java/ru/netology/CashbackHackServiceTest.java">CashbackHackServiceTest.java</a> на метод класса
      <a href="https://github.com/Nephedov/1.Automated-Testing/blob/testng/src/main/java/ru/netology/service/CashbackHackService.java">CashbackHackService.java</a>.
    * Заведен <a href="https://github.com/Nephedov/1.Automated-Testing/issues/4">баг-репорт</a> в issue.
  #### Часть 2
  * Создана ветка <a href="https://github.com/Nephedov/1.Automated-Testing/tree/junit4">junit4</a> в которой:
    * Добавлена зависимость для junit4 в <a href="https://github.com/Nephedov/1.Automated-Testing/blob/junit4/build.gradle">build.gradle</a>.
    * Реализованы автотесты <a href="https://github.com/Nephedov/1.Automated-Testing/blob/junit4/src/test/java/ru/netology/CashbackHackServiceTest.java">CashbackHackServiceTest.java</a> на метод класса
      <a href="https://github.com/Nephedov/1.Automated-Testing/blob/junit4/src/main/java/ru/netology/service/CashbackHackService.java">CashbackHackService.java</a>.
    * Заведен <a href="https://github.com/Nephedov/1.Automated-Testing/issues/5">баг-репорт</a> в issue.

## Описание Задания №1: CashBackHacker

### Введение

Вы участвуете в проекте CashBackHacker — это небольшой сервис, который сообщает пользователю о том, сколько ему нужно докупить в рамках конкретной траты, чтобы получить максимальное количество кешбека.

Подробнее: кешбек начисляется за каждую потраченную полную тысячу рублей, поэтому, если вы покупаете что-то на 900 рублей, сервис должен посоветовать вам докупить ещё чего-нибудь на 100 рублей.

### Часть 1. TestNG

#### Что нужно сделать

Сделайте ветку testng, в которой:

1\. Добавьте в зависимости TestNG.
2\. Напишите простые автотесты без параметризации на основании материала следующего раздела.

### Часть 2. JUnit4

#### Что нужно сделать

Сделайте ветку junit4, в которой:

1\. Добавьте в зависимости JUnit.
2\. Напишите простые автотесты без параметризации.

### Об ошибках

В сервисе точно есть ошибка, поэтому один из ваших автотестов должен падать. На обнаруженный дефект должен быть оформлен репорт [по установленным правилам](../report-requirements.md) 
