select
  /*%expand*/*
from
  receipts
where
  cust_id = /* custId */'a'
  and
  seq = /* seq */1
