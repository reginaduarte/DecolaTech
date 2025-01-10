USE DB_RH
GO

-- 1. Removendo um �rea que tenha um cargo cadastrado
DELETE * FROM TB_AREAS WHERE ID = 2

-- 2. Removendo uma ar�a que tenha um cargo cadastrado
DELETE * FROM TB_AREAS WHERE ID = 1

-- 3. Removendo todas as �reas que n�o possuem um cargo associado
-- (isso inclui as �reas repetidas)
DELETE FROM TB_AREAS WHERE ID NOT IN (SELECT ID_AREA FROM TB_CARGOS