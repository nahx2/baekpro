-- 코드를 입력하세요
--2022년 10월에 작성된 게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일을 조회
--댓글 작성일을 기준으로 오름차순 정렬, 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬
SELECT tb1.TITLE TITLE, tb1.BOARD_ID BOARD_ID
        , tb2.REPLY_ID REPLY_ID, tb2.WRITER_ID WRITER_ID
        , tb2.CONTENTS CONTENTS, TO_CHAR(tb2.CREATED_DATE,'YYYY-MM-DD') CREATED_DATE
    from USED_GOODS_BOARD tb1
    inner join USED_GOODS_REPLY tb2
        on tb1.BOARD_ID = tb2.BOARD_ID
    where TO_CHAR(tb1.CREATED_DATE, 'YYYY-MM-DD') between '2022-10-01' and '2022-10-31'
order by CREATED_DATE,TITLE