USE DB_RH
GO

-- 1. Buscando as informa��es: AREA, CARGO E SALARIO.
--    Usaremos duatabelas, com seus nomes completos (N�O FA�AM ISSO EM CASA)
SELECT
	TB_AREAS.DESCRICAO AS AREA,
	TB_CARGOS.DESCRICAO AS CARGO,
	TB_CARGOS.SALARIO AS SALARIO
FROM
	TB_AREAS, TB_CARGOS
WHERE 
	TB_AREAS.ID = TB_CARGOS.ID_AREA

-- 2. O mesmo exemplo anterior, usando ALIASES para as tabelas
SELECT
	A.DESCRICAO AS AREA,
	C.DESCRICAO AS CARGO,
	C.SALARIO AS SALARIO
FROM
	TB_AREAS A, TB_CARGOS C
WHERE 
	A.ID = C.ID_AREA

-- 3. Trabalhando com JOINS
-- a. JOIN ou INNER JOIN
SELECT
	A.DESCRICAO AS AREA,
	C.DESCRICAO AS CARGO,
	C.SALARIO AS SALARIO
FROM
	TB_AREAS A INNER JOIN TB_CARGOS C
ON
	A.ID = C.ID_AREA

-- Aplicando JOINS entre quatro tabelas
SELECT
	A.DESCRICAO AS AREA,
	C.DESCRICAO AS CARGO,
	I.DATA_INSCRICAO AS [DATA INSCRI��O],
	CD.NOME AS CANDIDATO,
	CD.TELEFONE
FROM
	TB_AREAS A INNER JOIN TB_CARGOS C 
		ON A.ID = C.ID_AREA
	INNER JOIN TB_INSCRICOES I 
		ON C.ID = I.ID_CARGO
	INNER JOIN TB_CANDIDATOS CD 
		ON I.CPF = CD.CPF

-- Outro exemplo
SELECT
	CD.CPF AS CPF, 
	CD.NOME AS CANDIDATO, 
	IC.DATA_INSCRICAO AS [DATA INSCRI��O]
FROM 
	TB_CANDIDATOS CD INNER JOIN TB_INSCRICOES IC
ON
	CD.CPF = IC.CPF
 