-- 코드를 입력하세요
# 가장 리뷰를 많이 작성한 회원의 리뷰들 조회
SELECT member_name, rv.review_text, DATE_FORMAT(rv.review_date, '%Y-%m-%d') AS review_date
FROM rest_review rv JOIN member_profile USING(member_id)
WHERE rv.member_id = (SELECT member_id FROM rest_review GROUP BY member_id ORDER BY COUNT(*) DESC limit 1)
ORDER BY rv.review_date, rv.review_text ASC;