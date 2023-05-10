-- SELECT I.NAME NAME, I.DATETIME DATETIME
--      FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
--          ON I.ANIMAL_ID = O.ANIMAL_ID
--          WHERE O.ANIMAL_ID IS NULL AND ROWNUM < 4
--          ORDER BY I.DATETIME
        
        
-- SELECT NAME, DATETIME
--     FROM (SELECT * 
--             FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
--                 ON I.ANIMAL_ID = O.ANIMAL_ID
--             WHERE O.ANIMAL_ID IS NULL
--             ORDER BY I.DATETIME)
            
 -- SELECT I.NAME, I.DATETIME
 --             FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
 --                 ON I.ANIMAL_ID = O.ANIMAL_ID
 --             WHERE O.ANIMAL_ID IS NULL
 --             ORDER BY I.DATETIME
 SELECT *
    FROM( SELECT I.NAME, I.DATETIME
             FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
                 ON I.ANIMAL_ID = O.ANIMAL_ID
             WHERE O.ANIMAL_ID IS NULL
             ORDER BY I.DATETIME)
    WHERE ROWNUM < 4