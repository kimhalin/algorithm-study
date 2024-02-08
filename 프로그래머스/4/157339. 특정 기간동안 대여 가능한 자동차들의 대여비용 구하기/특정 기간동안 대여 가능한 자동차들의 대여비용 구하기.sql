-- 코드를 입력하세요
# 자동차 ID, 자동차 종류, 대여 금액
# 자동차 종류=['세단', 'SUV'] AND 2022-11-01~2022-11-30일까지 대여 가능 AND 30일 간 대여 금액: 50만원 <= x < 200만원
SELECT car_id, c.car_type, FLOOR(30*daily_fee*(1-discount_rate/100)) AS fee
FROM car_rental_company_car c JOIN car_rental_company_discount_plan USING(car_type)
WHERE c.car_type IN ('세단', 'SUV') AND car_id NOT IN (
    SELECT car_id
    FROM car_rental_company_rental_history
    WHERE end_date >= '2022-11-01' AND start_date <= '2022-11-30'
    
) AND duration_type='30일 이상'
HAVING fee >= 500000 AND fee < 2000000
ORDER BY fee DESC, car_type ASC, car_id DESC;
