select
  /*%expand*/*
from
  orders
where
  ordno = /* ordno */'a'
  and
  custno = /* custno */'a'
