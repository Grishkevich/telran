# Описание задания.

1 уровень сложности: Homework for lesson seven (iterators)
Task 1:
Создать лист, наполнить его 10М (миллионами) элементов.
Выполнить различные варианты обхода данного листа :
При выполнении операций обхода, для нагрузки, внутри тела циклов
кладем i- тый элемент в переменную temp
(Пример :
for (int i : list) {
int temp = i;
})


перебрать for-each loop

classic for и вызываем list.size() для каждой итерации

classic for, но list.size() определяем в переменную

classic for, list.size() определяем в переменную, перебираем с конца (i--)

используя Itertor

используя ListIterator


для всех случаев(1-6) сделать замер времени
результат вывести в консоль


Task 2:
Создать свой собственный итератор!
Это должен быть класс, который имплементирует интерфейс Iterator.
Приведу пример его создания :
public class CustomIterator implements Iterator {


private int[] integers;
//Добавить поля которые будут нужны для отслеживания текущей позиции

//Добавить конструктор который будет принимать массив чисел и //присваивать его
//в переменную integers


//Реализовать методы hasNext() и next()

}


В основном классе для теста итератора, нужно создать массив чисел,
передать его в конструктор кастомного итератора и проитерироваться по массиву,выводя
его элементы в консоль


2 уровень сложности: 