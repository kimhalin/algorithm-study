-- 코드를 입력하세요
# 입양을 갔는데, 보호소에 들어온 기록이 없는 동물의 ID, 이름 조회
SELECT outs.animal_id, outs.name
FROM animal_outs outs LEFT JOIN animal_ins ins USING(animal_id)
WHERE ins.datetime IS NULL
ORDER BY outs.animal_id;