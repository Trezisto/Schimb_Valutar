create table dictionar_valute (
    id bigint primary key,
    code char(3)
);
create table angajati (
    id bigint primary key,
    name varchar(80)
);
create table curs_valutar (
    id bigint primary key,
    id_currency bigint REFERENCES dictionar_valute,
    ordinal integer,
    exchange_rate numeric(20,2),
    exchange_date date
);
create table schimb_valutar (
    id bigint primary key,
    id_currency bigint REFERENCES dictionar_valute,
    exchange_rate numeric(20,2),
    received numeric(40,2),
    withdrawn numeric(40,2)
);
create table numerar (
    id bigint primary key,
    id_employee bigint  REFERENCES angajati,
    id_currency bigint REFERENCES dictionar_valute,
    total numeric(40,2),
    exchange_date date
);

INSERT INTO dictionar_valute(id, code) VALUES (1,'EUR'), (2,'KZT'), (3,'JPY');
INSERT INTO angajati(id, name) VALUES (1, 'oper1');
INSERT INTO curs_valutar(id, id_currency, ordinal, exchange_rate, exchange_date)
  SELECT 1, id, 1, 19.7, CURRENT_DATE
  FROM dictionar_valute
  WHERE code = 'EUR';