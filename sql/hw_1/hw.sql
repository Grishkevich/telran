-- 1. Создать базу данных homeworks
CREATE database homeworks;

-- 2. В этой базе создать таблицу employees с полями:
-- • id – integer - уникальное значение, не пустое, с автозаполнением
-- • firstname - varchar(128) - не пустое
-- • lastname - varchar(128) - не пустое
-- • job - varchar(64)
-- • age - integer - от 20 до 100(вкл.)
-- • hascar – char только один символ, по умолчанию 'N'
-- • username - varchar(128) - уникальное значение, не пустое
CREATE TABLE employees (
   id INT AUTO_INCREMENT PRIMARY KEY,
   firstname VARCHAR(128) NOT NULL,
   lastname VARCHAR(128) NOT NULL,
   job VARCHAR(64),
   age INT CHECK (age >= 20 AND age <= 100),
   hascar CHAR DEFAULT 'N',
   username VARCHAR(128) UNIQUE NOT NULL,
   UNIQUE(id)
);

-- 3. Добавить 5 строк.
INSERT INTO employees (firstname, lastname, job, age, hascar, username)
VALUES
    ('John', 'Doe', 'Developer', 30, 'Y', 'johndoe'),
    ('Alice', 'Smith', 'Designer', 28, 'N', 'asmith'),
    ('Bob', 'Johnson', 'Manager', 35, 'Y', 'bjohnson'),
    ('Eva', 'Brown', 'Analyst', 27, 'N', 'ebrown'),
    ('Michael', 'Lee', 'Engineer', 32, 'Y', 'mlee');

-- 4. Удалить таблицу employees
DROP TABLE employees;

-- 5. Удалить бд homeworks
DROP database homeworks;

-- 6. Создать бд tasks и в этой базе создать таблицу Staff используя скрипт.
CREATE database tasks;
-- тут должен бить большой код с гитхаба

-- 7. Из таблицы вывести работников, которым больше 20 и меньше 40.
SELECT *
FROM Staff
WHERE age > 20 AND age < 40;

-- 8. Вывести только имена сотрудников, у которых юзернейм начинается на букву А и им больше 20.
SELECT firstname
FROM Staff
WHERE username LIKE 'A%' AND age > 20;

-- 9. Вывести имена, фамилии и возраст тех сотрудников, у которых id либо 3, либо 7, либо 10.
SELECT firstname, lastname, age
FROM Staff
WHERE id IN(3,7,10);

-- 10. Вывести сотрудников у которых имя начинается на букву 'A', а фамилия заканчивается на букву 'S'.
SELECT *
FROM Staff
WHERE username LIKE 'A%' AND lastname LIKE '%S';
