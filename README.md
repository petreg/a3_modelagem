# A3
O projeto pode ser baixado link do [GitHub](https://github.com/petreg/a3_modelagem/archive/refs/heads/develop.zip) no formato zip.

## Instalação
Após baixa e descompactar, abrir o projeto no NetBeans e adicionar jar do conector do MySQL e do Validados de email.
Esses estão na pasta jar do projeto.

## Estrutura do banco

São três tabelas no total, sendo elas:

```sql

CREATE TABLE `friends` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tel` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tools` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `value` float DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `loans` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tool_id` int NOT NULL,
  `friend_id` int NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `tool_id` (`tool_id`),
  KEY `friend_id` (`friend_id`),
  CONSTRAINT `loans_ibfk_1` FOREIGN KEY (`tool_id`) REFERENCES `tools` (`id`),
  CONSTRAINT `loans_ibfk_2` FOREIGN KEY (`friend_id`) REFERENCES `friends` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

```
Os dados para conexão com o banco são:

- usuario: root
- senha: root
- database: tiozao
- host 127.0.0.1

Caso seus dados estejam diferentes, alterar os arquivos DAO.

