CREATE TABLE users
(
    `id`            INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `username`      VARCHAR(50) NOT NULL,
    `full_name`     VARCHAR(75) NOT NULL,
    `password_hash` VARCHAR(32) NOT NULL
);

INSERT INTO `users` (`id`, `username`, `full_name`, `password_hash`)
VALUES (1, 'pesho', 'Petur Petrov', 'd2de3a6d8360140858016a2ded29b754'),
       (2, 'ivan', 'Ivan Ivanov', '88c75c78bfd909aa3e85d341863b09b5'),
       (3, 'gosho', 'Georgi Georgiev', 'dea212cee54d411bae0bf792869c0468'),
       (4, 'mariika', 'Maria Petrova', 'f521a51d6472c38b14b9c4d855f658be'),
       (5, 'naruto', 'uzumaki naruto', '56c28f25a1ba1cfddb6403d3dd546a8c'),
       (6, 'tengo', 'Teng Qingshan', '1b25433efef6396f6b9cd8f37a5959ce'),
       (7, 'may', 'May Nuwa', '3de885842c7c72e54192a00b9d8e896c'),
       (8, 'loo', 'Loo Chao-xing', '1e4213e13a52f81ea280132534e8957a'),
       (9, 'abdur', 'Abdur Raheem Hatem', 'eb5e0c2e010b355dc2f916b14bd61403'),
       (10, 'CRay', 'Charles Ray', 'f08cefd23ade1307b617664e6a642c3a'),
       (11, 'dama', 'Damaskinos Stathakis', '272b10e4e2e28e0c232a5f0d681405de'),
       (12, 'C.Athena', 'Athena Collia', '2973be21cd2fed7672fc50191afd7bf8'),
       (13, 'GBotev', 'Grozdan Botev', '2461c9f57c0233f3d322b37a15cca139'),
       (14, 'V.R.S.', 'Vanya Radkova Stoeva', 'e7615840dfe541279eda16fde6e83020'),
       (15, 'kaila', 'Uluwehi Kaila', '01b8c26fc3d16c0bc1fdba59005c4e8c');
