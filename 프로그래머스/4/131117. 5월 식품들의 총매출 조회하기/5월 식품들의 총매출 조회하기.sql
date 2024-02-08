-- 코드를 입력하세요
SELECT pd.product_id, pd.product_name, SUM(od.amount * pd.price) AS total_sales
FROM food_order od JOIN food_product pd USING(product_id)
WHERE od.produce_date LIKE '2022-05%'
GROUP BY pd.product_id
ORDER BY total_sales DESC, pd.product_id ASC;