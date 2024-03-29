-- 코드를 입력하세요
-- ANIMAL_OUTS에 정보가 없는
# SELECT TOP(3) NAME, DATETIME
#     FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
#         ON I.ANIMAL_ID = O.ANIMAL_ID
#     WHERE NAME IS NULL
#     ORDER BY I.DATETIME DESC

# SELECT *
#     FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
#         ON I.ANIMAL_ID = O.ANIMAL_ID
#     WHERE O.NAME IS NULL 
#     ORDER BY I.DATETIME DESC

# SELECT TOP(3)
#     FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
#         ON I.ANIMAL_ID = O.ANIMAL_ID
#         WHERE O.ANIMAL_ID IS NULL
#         ORDER BY I.DATETIME

 # SELECT NAME, DATETIME
 #    FROM( SELECT I.NAME NAME, I.DATETIME DATETIME
 #             FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
 #                 ON I.ANIMAL_ID = O.ANIMAL_ID
 #             WHERE O.ANIMAL_ID IS NULL
 #             ORDER BY I.DATETIME)

# SELECT TOP(3) NAME, DATETIME
#              FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
#                  ON I.ANIMAL_ID = O.ANIMAL_ID
#              WHERE O.ANIMAL_ID IS NULL
#              ORDER BY I.DATETIME

SELECT *
FROM (SELECT I.NAME AS NAME
            , I.DATETIME AS DATETIME
             FROM ANIMAL_INS AS I LEFT OUTER JOIN ANIMAL_OUTS AS O
                 ON I.ANIMAL_ID = O.ANIMAL_ID
             WHERE O.ANIMAL_ID IS NULL) AS A
ORDER BY DATETIME ASC
LIMIT 3

# SELECT I.NAME NAME, I.DATETIME DATETIME
#              FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O
#                  ON I.ANIMAL_ID = O.ANIMAL_ID
#              WHERE O.ANIMAL_ID IS NULL


# SELECT TOP(3)
#       FROM ANIMAL_INS AS I LEFT OUTER JOIN ANIMAL_OUTS AS O
#            ON I.ANIMAL_ID = O.ANIMAL_ID
#       WHERE O.ANIMAL_ID IS NULL
# ORDER BY I.DATETIME ASC

# SELECT TOP(3)
#     FROM ANIMAL_INS