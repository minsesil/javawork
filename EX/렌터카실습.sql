--렌터카 정보 저장 테이블 생성하기
CREATE TABLE RENT_CAR (
  CARNUMBER VARCHAR2(10) PRIMARY KEY,
  CARNAME VARCHAR2(20),
  CARCOLOR VARCHAR2(20),
  CARSIZE NUMBER(5),
  CARMAKER VARCHAR2(20)
);

DESC RENT_CAR;