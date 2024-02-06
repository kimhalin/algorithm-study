-- 코드를 입력하세요
SELECT a.flavor
FROM first_half a JOIN (SELECT flavor, SUM(total_order) AS total_order FROM july GROUP BY flavor) b
ON a.flavor = b.flavor
ORDER BY (a.total_order + b.total_order) DESC
LIMIT 3;