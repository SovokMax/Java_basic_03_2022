
CREATE TABLE question
(
    id            SERIAL PRIMARY KEY,
    question_text VARCHAR(1024),
    answer_text   VARCHAR(1024)
);

CREATE TABLE answer
(
    id              SERIAL PRIMARY KEY,
    question_id     INTEGER REFERENCES question (id),
    correct_answer  INTEGER
);

INSERT INTO question (question_text, answer_text)
VALUES ('Первый вопрос. Сколько пальцев на человеческой руке?', "1)Два 2)Три 3)Пять 4)Семь"),
       ('Второй вопрос. Сколько букв в русском алфавите?', "1)15  2)20 3)40 4)33"),
       ('Третий вопрос. Какое животное находится под защитой закона в Риме?', "1)Курицы  2)Собаки 3)Кошки 4)Львы");   
       ('Четвертый вопрос. Какое самое быстрое сухопутное животное?', "1)Гепард  2)Лев 3)Тигр 4)Леопард");
       ('Пятый вопрос. Сколько костей у акул?', "1)Четыре  2)Ноль 3)Пять 4)Десять");  

INSERT INTO answer(question_id, correct_answer)
VALUES (1, 3),
       (2, 4),
       (3, 3),
       (4, 1),
       (5, 2),
      

SELECT * FROM question 
JOIN answer a ON question.id = a.question_id;