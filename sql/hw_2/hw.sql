-- 1. Создать новую базу данных homeworks и в этой базе создать таблицу employees;
-- employeeid целое число первичный ключ автоинкремент,
-- fname строка не null,
-- lastname строка не null,
-- email строка не null,
-- phone строка не null
CREATE database homeworks;

CREATE TABLE employees (
   employeeid INT AUTO_INCREMENT PRIMARY KEY,
   fname VARCHAR(128) NOT NULL,
   last_name VARCHAR(128) NOT NULL,
   email VARCHAR(128) NOT NULL,
   phone VARCHAR(128) NOT NULL,
   UNIQUE(employeeid)
);

-- 2. Ой, забыли про зарплату)) Добавить поле salary numeric(9, 2),
ALTER TABLE employees
    ADD salary NUMERIC(9, 2);

-- 3. Ойййй, нет, зарплата должна быть целым числом. Изменить тип salary на integer.
ALTER TABLE employees
    MODIFY COLUMN salary INT;

-- 4. Переименовать поле name на first_name
ALTER TABLE employees
    RENAME COLUMN fname TO first_name;

-- 5.  Удалить поле phone
ALTER TABLE employees DROP COLUMN phone;

-- 6. Добавить поле department строка не null
ALTER TABLE employees
    ADD department VARCHAR(128) NOT NULL;

-- 7. Заполнить таблицу
-- https://github.com/annykh/GT301023-e/blob/main/employees.txt

-- 8. Найти всех IT работников с зарплатой выше 12000 и отсортировать по убыванию зарплаты.
SELECT * from employees
         WHERE employees.salary > 12000
         ORDER BY salary DESC;

-- 9. Повысить зарплату работников отдела Human Resources в 5 раз
UPDATE employees
SET employees.salary = employees.salary * 5 WHERE employees.department = 'Human Resources';

-- 10. Найти первых двух работников отдела Marketing с зарплатой ниже 3000.
SELECT * FROM employees
         WHERE employees.department = 'Marketing' and employees.salary < 3000
             LIMIT 2;

-- 11. У руководителя родились близнецы Лаура и Адам, в честь праздника он решил повысить зарплату работников с именами Лаура и Адам в 10 раз.
UPDATE employees
SET employees.salary = employees.salary * 10
WHERE employees.first_name IN ('Laura', 'Adam');

-- 12. Diana Lorentz вышла замуж и поменяла фамилию на King. Поменяйте у Diana Lorentz фамилию на King.
UPDATE employees
SET employees.last_name = 'King'
WHERE employees.first_name = 'Diana' AND employees.last_name = 'Lorentz';

-- 13. Всех работников отдела sales уволили. Удалите работников sales из таблицы.
DELETE FROM employees
       WHERE employees.department = 'sales';

-- 14. Сотрудник с id 7 уволился. Удалите его из таблицы
DELETE FROM employees
       WHERE employees.employeeid = 7;

-- 15. После праздника руководитель протрезвел и уменьшил зарплаты работников с именами Лаура и Адам в 10 раз.
UPDATE employees
SET employees.salary = employees.salary / 10
WHERE employees.first_name IN ('Laura', 'Adam');

-- 16. Laura Bissot поменяла свой мейл на BISSOTLAURA. Измените данные для работника Laura Bissot.
UPDATE employees
SET employees.email = 'BISSOTLAURA'
WHERE employees.first_name = 'Laura' AND employees.last_name = 'Bissot';

-- 17. Diana King развелась и поменяла фамилию обратно на Lorentz. И в честь развода руководитель повысил ее зарплату на 2000.  Измените данные для работника Diana King.
UPDATE employees
SET employees.last_name = 'Lorentz' AND employees.salary = employees.salary + 2000
WHERE employees.first_name = 'Diana' AND employees.last_name = 'King';
