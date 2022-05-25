--테이블 삭제
drop table person;

--시퀀스 삭제
DROP SEQUENCE person;

--시퀀스 삭제
DROP SEQUENCE seq_person_id;

--person 테이블 만들기
create table person(
        person_id number (5)
        , name varchar2 (30) not null
        , hp varchar2 (20)
        , company varchar2 (20)
        , primary key (person_id)
);

--person 스퀀스 생성
CREATE SEQUENCE seq_person_id
INCREMENT BY 1
START WITH 1
nocache;

--조회
select *
from person;

select person_id
          , name
          , hp
          , company
from person;

--마지막 commit했던 시점으로 돌려줌
--하지만 테이블 관리만 해당(테이블, 시퀀스를 삭제한 것은 해당 안 됨)
rollback;

/** 데이터 저장 **/
commit;




























