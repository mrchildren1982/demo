select
id,
name
from customers
where
name like
/* @prefix(name) */'%X%' escape '$'