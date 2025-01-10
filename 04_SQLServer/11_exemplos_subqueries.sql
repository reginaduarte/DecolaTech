USE DB_RH
GO

SELECT * FROM TB_AREAS
SELECT * FROM TB_CARGOS

-- 1. Listar todas as �reas que possuem um cargo correspodente cadastrado
SELECT * FROM TB_AREAS WHERE ID IN (SELECT ID_AREA FROM TB_CARGOS)

-- 2. Listar todas as �reas que n�o possuem um cargo correspodente cadastrado
SELECT * FROM TB_AREAS WHERE ID NOT IN (SELECT ID_AREA FROM TB_CARGOS)

-- 3. Buscar todos os cargos cujo ID esteja no intervalo entre 3 e 5
SELECT * FROM TB_AREAS WHERE ID BETWEEN 3 AND 5
SELECT * FROM TB_AREAS WHERE ID = 3 OR ID = 4 OR ID = 5
SELECT * FROM TB_AREAS WHERE ID IN (3, 4, 5)

-- 4. Listar todos os candidatos que ainda n�o se inscreveram ainda em nenhuma vaga
SELECT * FROM TB_CANDIDATOS WHERE CPF NOT IN (SELECT CPF FROM TB_INSCRICOES)