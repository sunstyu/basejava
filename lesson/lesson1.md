# Первое занятие

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) [Вебинар ПРЕЗЕНТАЦИЯ обучения](https://drive.google.com/file/d/0B_4NpoQW1xfpNzdqT2hOcUJ6TGs)
#### [Итоговый пример приложения, разрабатываемого в рамках данного курса (на примере резюме Григория Кислина)](https://javawebinar.github.io/)

### Подготовка рабочего окружения
- Установите [JDK8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (выбрать Accept License Agreement)
- Установите систему управления версиями [Git](http://git-scm.com/downloads) (опции по умолчанию)
- Создайте аккаунт на [GitHub](https://github.com/)
- Для удобной навигации по файлам на GitHub установите расширение для браузера - [Octotree](https://habrahabr.ru/post/223527/)
- Установите [IntelliJ IDEA Ultimate](http://www.jetbrains.com/idea/download/index.html)
> Данная среда разработки является платным продуктом, рассчитанным на 30 дней пробного бесплатного использования. Для выполнения заданий в этой IDE каждый участник курса получит ключ на 6 месяцев

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. [Разработка ПО](https://drive.google.com/open?id=0B_4NpoQW1xfpVjZUTEpvVUN1TTA)
- [Книга: Мифический человеко-месяц](https://ru.wikipedia.org/wiki/Мифический_человеко-месяц)
- [Размеры проектов в количестве строк кода](https://medium.freecodecamp.com/the-biggest-codebases-in-history-a128bb3eea73)
- [Соглашения по именованию](http://www.intuit.ru/studies/courses/16/16/lecture/27113?page=4)
- [Методологии разработки ПО](https://dou.ua/forums/topic/14015/)
   - **Доступ из России через прокси (например [friGate CDN](https://chrome.google.com/webstore/detail/frigate-cdn-smooth-access/mbacbcfdfaapbcnlnbmciiaakomhkbkb))**
- [Ещё раз про семь основных методологий разработки](https://habrahabr.ru/company/edison/blog/269789/)

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. [Обзор инструментов и технологий](https://drive.google.com/file/d/0B_4NpoQW1xfpTXJYU2xZbjN2d2M)
- [Bash — шпаргалка для начинающих](https://tproger.ru/translations/bash-cheatsheet)
- [Типичный тест SQL на собеседованиях](https://habrahabr.ru/post/181033/)
- **Обновление!!**[Что и почему используют Java-разработчики: опрос RebelLabs](https://jug.ru/2017/12/rebellabs-report/)
  - [Java Tools and Technologies Landscape Report 2016](https://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-2016/)
  - [Java Tools and Technologies Landscape for 2014](http://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-for-2014)
-  Дополнительно:
   - [Автоматизированные сборки в Java](http://www.quizful.net/post/automated-builds-java)

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 3. [Обзор языка Java](https://drive.google.com/open?id=0B_4NpoQW1xfpTU5SSElhUjlGNnc)
- [Java](http://ru.wikipedia.org/wiki/Java), [JVM](http://ru.wikipedia.org/wiki/Виртуальная_машина_Java), [JIT-компиляция](http://ru.wikipedia.org/wiki/JIT)
- [Что такое Java? История создания](http://www.intuit.ru/studies/courses/16/16/lecture/27105)
- [Programming languages TIOBE Index](http://www.tiobe.com/index.php/content/paperinfo/tpci/index.html)

![jvm](https://cloud.githubusercontent.com/assets/18701152/15219296/e6c67e86-186b-11e6-986f-651a87deec6c.png)

- [Java Microbenchmark JMH](https://github.com/JavaOPs/masterjava#Занятие-2) используем на курсе Masterjava
- [Oracle Java8 Home](http://docs.oracle.com/javase/8/docs/index.html)
- [ME](http://ru.wikipedia.org/wiki/Java_Platform,_Micro_Edition), [SE](http://en.wikipedia.org/wiki/Java_Platform,_Standard_Edition) (<a href="http://ru.wikipedia.org/wiki/Java_Platform,_Standard_Edition">русский</a>), [EE](http://en.wikipedia.org/wiki/Java_Platform,_Enterprise_Edition) ([русский](http://ru.wikipedia.org/wiki/Java_Platform,_Enterprise_Edition))
-  Дополнительно:
   - [Java version and vendor data analyzed](https://plumbr.eu/blog/java/java-version-and-vendor-data-analyzed-2016-edition)
   - [Most Popular Java EE Servers](https://dzone.com/articles/most-popular-java-ee-servers-2016-edition)
   - [Понимаем основы Java garbage collection](https://ggenikus.github.io/blog/2014/05/04/gc)

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 4. [Системы управления версиями. Git](https://drive.google.com/file/d/0B9Ye2auQ_NsFSUNrdVc0bDZuX2s)
### Настройка проекта
- Создайте на GitHub репозиторий с названием `basejava`
- [Занесите](https://www.java.com/ru/download/help/path.xml) git в переменную окружения PATH и перезапустите cmd
- Создайте локальную копию ЭТОГО проекта: `git clone https://github.com/JavaOps/basejava.git`
- Перейти в каталог проекта: `cd basejava`
- Настроить git в локальном проекте на свой проект в GitHub:
  - `git remote -v`
  - `git remote set-url origin https://github.com/[твой_GITHUB_аккаунт]/[твой_репозиторий].git` - настройка pull
  - `git remote set-url --push origin https://github.com/[твой_GITHUB_аккаунт]/[твой_репозиторий].git` - настройка push
  - `git push -u origin master`

### <a href="http://ru.wikipedia.org/wiki/Система_управления_версиями">Система управления версиями</a>. <a href="http://ru.wikipedia.org/wiki/%D0%A1%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B0_%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F_%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D1%8F%D0%BC%D0%B8#.D0.A0.D0.B0.D1.81.D0.BF.D1.80.D0.B5.D0.B4.D0.B5.D0.BB.D1.91.D0.BD.D0.BD.D1.8B.D0.B5_.D1.81.D0.B8.D1.81.D1.82.D0.B5.D0.BC.D1.8B_.D1.83.D0.BF.D1.80.D0.B0.D0.B2.D0.BB.D0.B5.D0.BD.D0.B8.D1.8F_.D0.B2.D0.B5.D1.80.D1.81.D0.B8.D1.8F.D0.BC.D0.B8">VCS/DVSC</a> 

![image](https://cloud.githubusercontent.com/assets/18701152/15219746/9295a2fe-186d-11e6-876b-c61cc9be71e4.png)

-  Ресурсы:            
    -  <a href="https://try.github.io/levels/1/challenges/1">Интерактивная Git обучалка</a>
    -  <a href="http://learngitbranching.js.org/">Еще одна интерактивная обучалка, по русски</a>    
    -  <a href="https://git-scm.com/book/ru/v2">Книга Git</a>
    -  <a href="https://illustrated-git.readthedocs.org/en/latest/#working-with-remote-repositories">Working with remote repositories</a>
    -  <a href="https://www.youtube.com/playlist?list=PLIU76b8Cjem5B3sufBJ_KFTpKkMEvaTQR">Видео по обучению Git</a>
    -  <a href="https://blog.interlinked.org/tutorials/git.html">Git Overview</a>
    -  <a href="http://geekbrains.ru/gitstart">Видеокурс по Git</a>
    -  [Основы Git за 20 минут](https://www.youtube.com/watch?v=TMeZGvtQnT8)
- [Популярность разный VSC](http://www.netinstructions.com/the-case-for-git/)
- <a href="https://git-scm.com/book/ru/v2">Книга по Git</a>

## Домашнее задание HW1
- Создайте в IntelliJ IDEA новый проект, выбрав каталог `basejava`, **в котором находится локальная копия моего проекта (необходимо выполнить все действия выше по настройке проекта)**:

![newproject](https://user-images.githubusercontent.com/13649199/27245917-c66f0b5a-52f6-11e7-98dc-f88d0198b5c4.png)

![next](https://user-images.githubusercontent.com/13649199/27245921-c88b4570-52f6-11e7-83a3-e52627468be7.png)

![finish](https://user-images.githubusercontent.com/13649199/27245924-cab3618e-52f6-11e7-9655-4293149b4126.png)

- Реализуйте класс `com.urise.webapp.storage.ArrayStorage` (вставте код в пустые методы класса): работа с `com.urise.webapp.model.Resume` на основе массива (методы `clear, get, save, delete, getAll, size`)
   - Не используйте в решении коллекции, реализацию на их основе мы добавим позднее
   - Не меняйте синтаксис методов `com.urise.webapp.storage.ArrayStorage` и не меняйте класс `com.urise.webapp.model.Resume`. Нужет только код внутри готовых методов `com.urise.webapp.storage.ArrayStorage`
   - [Массивы](http://study-java.ru/uroki-java/massivy-v-java/)
   - [Java массивы](http://info.javarush.ru/javarush_articles/2015/12/10/Java-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D1%8B.html)
- Протестируйте вашу реализацию, запустив `com.urise.webapp.MainTestArrayStorage.main()`: в IDEA слева на полях зеленая стрелка.
- Протестируйте вашу реализацию интерактивно с помощью `com.urise.webapp.MainArray.main()`.
- Дополнительные материалы по IntelliJ IDEA
  - <a href="https://github.com/JavaOPs/topjava/wiki/IDEA">Idea Wiki</a> (поставить кодировку UTF-8, поменять фонт по умолчанию на DejaVu)
  - <a href="http://learn.javajoy.net/debug-intellij-idea">Отладчик IntelliJ IDEA</a>
  - <a href="http://jeeconf.com/archive/jeeconf-2013/materials/intellij-idea/">Эффективная работа с кодом в IntelliJ IDEA</a>

### Optional
- Модифицировать класс `com.urise.webapp.storage.ArrayStorage`: хранить все резюме в начале storage (без дырок null), чтобы не перебирать каждый раз все 10000 элементов.
```
Хранеие резюме в storage (от 0 до size-1 элементов null нет):

r1, r2, r3,..., rn, null, null,..., null
<----  size ----->
<----  storage.length (10000)---------->
```
- Посмотреть на класс `Arrays`. Там есть полезные вещи, которые могут упростить код `com.urise.webapp.storage.ArrayStorage`.
- Протестируйте реализацию, запустив com.urise.webapp.MainArray.main(): в IDEA слева на полях зеленая стрелка.
