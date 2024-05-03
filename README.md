# Домашнее задание к занятию «1.1. Основы автоматизации»

## Решения
### Задание 1
#### Часть 1
 * <a href="https://github.com/Nephedov/1.Automated-Testing/blob/8203d3fd5eda4732f418676c4a285b33a0c841b1/build.gradle">build.gradle</a> для ветки testng.
 * <a href="https://github.com/Nephedov/1.Automated-Testing/blob/8203d3fd5eda4732f418676c4a285b33a0c841b1/src/test/java/ru/netology/CashbackHackServiceTest.java">CashbackHackServiceTest.java</a> - класс с автотестами.
 * <a href="https://github.com/Nephedov/1.Automated-Testing/issues/4#issue-1464901491">Баг-репорт</a> в issue.

<a href="https://github.com/Nephedov/1.Automated-Testing/tree/testng?tab=readme-ov-file">Ветка</a> репозитория с проектом.
 #### Часть 2
 * <a href="https://github.com/Nephedov/1.Automated-Testing/blob/7b66a1501680335fb81357d82ca1fe604d2204b3/build.gradle">build.gradle</a> для ветки junit4.
 * <a href="https://github.com/Nephedov/1.Automated-Testing/blob/7b66a1501680335fb81357d82ca1fe604d2204b3/src/test/java/ru/netology/CashbackHackServiceTest.java">CashbackHackServiceTest.java</a> - класс с автотестами.
 * <a href="https://github.com/Nephedov/1.Automated-Testing/issues/5#issue-1464902130">Баг-репорт</a> - в issue.

<a href="https://github.com/Nephedov/1.Automated-Testing/tree/junit4?tab=readme-ov-file">Ветка</a> репозитория с проектом.
## Что было сделано
* Создан Gradle проект c настроенным <a href="https://github.com/Nephedov/1.Automated-Testing/blob/0ac31373fa98ec288dfce3574b5144cea748144f/.github/workflows/grandle.yml">grandle.yml</a> для Github Ci.
  ### Задание 1
  * Создана ветка <a href="https://github.com/Nephedov/1.Automated-Testing/tree/testng?tab=readme-ov-file">testng</a> в которой:
    * Добавлена зависимость для testng в <a href="https://github.com/Nephedov/1.Automated-Testing/blob/8203d3fd5eda4732f418676c4a285b33a0c841b1/build.gradle">build.gradle</a>.
    * Реализованы автотесты на метод класса CashbackHackService.java -
      <a href="https://github.com/Nephedov/1.Automated-Testing/blob/8203d3fd5eda4732f418676c4a285b33a0c841b1/src/test/java/ru/netology/CashbackHackServiceTest.java">CashbackHackServiceTest.java</a>.
    * Заведен <a href="https://github.com/Nephedov/1.Automated-Testing/issues/4#issue-1464901491">баг-репорт</a> в issue.
  ### Задание 2
  * Создана ветка <a href="https://github.com/Nephedov/1.Automated-Testing/tree/junit4?tab=readme-ov-file">junit4</a> в которой:
    * Добавлена зависимость для junit4 в <a href="https://github.com/Nephedov/1.Automated-Testing/blob/7b66a1501680335fb81357d82ca1fe604d2204b3/build.gradle">build.gradle</a>.
    * Реализованы автотесты на метод класса CashbackHackService.java -
      <a href="https://github.com/Nephedov/1.Automated-Testing/blob/7b66a1501680335fb81357d82ca1fe604d2204b3/src/test/java/ru/netology/CashbackHackServiceTest.java">CashbackHackServiceTest.java</a>.
    * Заведен <a href="https://github.com/Nephedov/1.Automated-Testing/issues/5#issue-1464902130">баг-репорт</a> в issue.

## Задача №1: CashBackHacker

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
