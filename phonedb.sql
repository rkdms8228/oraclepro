--���̺� ����
drop table person;

--������ ����
DROP SEQUENCE person;

--������ ����
DROP SEQUENCE seq_person_id;

--person ���̺� �����
create table person(
        person_id number (5)
        , name varchar2 (30) not null
        , hp varchar2 (20)
        , company varchar2 (20)
        , primary key (person_id)
);

--person ������ ����
CREATE SEQUENCE seq_person_id
INCREMENT BY 1
START WITH 1
nocache;

--��ȸ
select *
from person;

select person_id
          , name
          , hp
          , company
from person;

--������ commit�ߴ� �������� ������
--������ ���̺� ������ �ش�(���̺�, �������� ������ ���� �ش� �� ��)
rollback;

/** ������ ���� **/
commit;




























