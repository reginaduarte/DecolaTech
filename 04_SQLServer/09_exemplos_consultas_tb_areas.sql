USE DB_RH
GO

-- 1. Buscando TODOS os registros da tabela
SELECT * FROM TB_AREAS

-- 2. Buscando a descrição apenas da área
SELECT DESCRICAO FROM TB_AREAS
SELECT DISTINCT ID, DESCRICAO FROM TB_AREAS

-- 3. Buscando uma area com base no ID informado (restrições - constraints)
SELECT * FROM TB_AREAS WHERE ID = 3
SELECT * FROM TB_AREAS WHERE ID < 3
SELECT * FROM TB_AREAS WHERE ID > 2 AND ID <> 3 -- Diferente: <>

-- 4. Buscando todas as áreas cuja descrição seja uma substring
SELECT * FROM TB_AREAS WHERE DESCRICAO = 'Financeiro%'
SELECT * FROM TB_AREAS WHERE DESCRICAO LIKE 'F%'
SELECT * FROM TB_AREAS WHERE DESCRICAO LIKE '%o'