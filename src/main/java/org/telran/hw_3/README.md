# Описание задания.

1 уровень сложности: Задача написать мини приложение по загрузке товаров на склад отправления, перевозке их и разгрузке их на складе доставки
Принцип работы приложения следующий:
С консоли вводится 3 - 5 наименований продукта,
на основе наименований, создаются продукты трех различных типов (TechProduct,FoodProduct,BookProduct)
Все созданные продукты помещаются на склад отправления.
Пример хранения  в классе  Storage (складов должно быть 2):

//array with products (Tech,Book,Food)
private Product[] products = new Product[5];

Класс должен иметь методы загрузки склада (проверять заполненность склада при загрузке),
метод разгрузки склада, метод вывода всех товаров на складе


Запрашиваем с косоли тип трака - "Big,Medium,Small"
В зависимости от введенного типа, создавайте траки разных классов !!!, на котором повезем продукты
Создается объект truck, на основе класса одного из наследников класса Truck, который будет отвечать за перевозку данных продуктов
до склада, у данного класса должна быть переменная - массив, в которую нужно добавить все загруженные
продукты со склада.(каждый трак имеет свое количество товаров, которые можно перевозить)


Трак должен иметь методы загрузки товаров и разгрузки их.


Необходимо загрузить трак продуктами и сообщить об этом.(При этом уменьшить товары на складе отправления и увеличить в траке)
Вывести список продуктов в траке.


Выгрузить все продукты из трака на склад доставки, сообщить об этом и вывести список продуктов в траке и на складе.


2 уровень сложности: 