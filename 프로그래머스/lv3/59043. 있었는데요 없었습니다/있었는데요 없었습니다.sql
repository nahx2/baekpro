-- 보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문
-- 보호 시작일이 빠른 순
SELECT tb1.ANIMAL_ID, tb1.NAME
    from ANIMAL_INS tb1 
        inner join ANIMAL_OUTS tb2 
        on tb1.ANIMAL_ID = tb2.ANIMAL_ID
    where tb1.DATETIME > tb2.DATETIME
    order by tb1.DATETIME 