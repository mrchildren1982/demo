select
  /*%expand*/*
from
  pricebyage
where
  product_id = /* productId */'a'
  and
  low_age = /* lowAge */1
