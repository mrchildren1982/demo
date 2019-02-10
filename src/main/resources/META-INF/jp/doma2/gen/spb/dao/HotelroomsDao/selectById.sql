select
  /*%expand*/*
from
  hotelrooms
where
  room_nbr = /* roomNbr */1
  and
  start_date = /* startDate */'2010-01-23'
