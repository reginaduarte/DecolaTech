USE DB_RH
GO

-- Efetuando inscrições 
INSERT INTO TB_INSCRICOES (ID_CARGO, CPF, DATA_INSCRICAO) VALUES
(1, '60887019005', GETDATE()),
(2, '69586848000', '2024-12-29'),
(2, '60887019005', '2024-12-27')
GO

-- Efetuando novas inscrições 
INSERT INTO TB_INSCRICOES (ID_CARGO, CPF, DATA_INSCRICAO) VALUES
(3, '35972701073', GETDATE()),
(2, '35972701073', '2024-12-29'),
(1, '35972701073', '2024-12-27')
GO