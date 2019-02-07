select
id,
name
from customers
where
/*%if customer != null */
/*%if customer.id != null */
		id = /* customer.id */1
/*%end*/
/*%if customer.name != null && customer.name.length() > 0 */
and
name = /* customer.name */'hoge'
/*%end */
/*%end */

