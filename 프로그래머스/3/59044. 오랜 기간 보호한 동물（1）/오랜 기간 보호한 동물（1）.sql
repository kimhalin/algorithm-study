-- 코드를 입력하세요
# 입양을 못 간 동물 중 가장 오래 보호소에 있었던 동물 3마리 이름, 보호 시작일 조회
SELECT ins.name, ins.datetime
FROM animal_ins ins LEFT JOIN animal_outs outs USING(animal_id)
WHERE outs.datetime IS NULL
ORDER BY ins.datetime ASC
limit 3;