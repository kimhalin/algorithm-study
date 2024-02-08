-- 코드를 입력하세요
# 상품코드 별 매출액 합계 출력
SELECT p.product_code, SUM(sales_amount * p.price) AS sales
FROM offline_sale JOIN product p USING(product_id)
GROUP BY product_id
ORDER BY sales DESC, p.product_code ASC;