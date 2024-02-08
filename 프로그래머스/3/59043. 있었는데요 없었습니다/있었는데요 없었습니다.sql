-- 코드를 입력하세요
# 보호 시작일보다 입양일이 더 빠른 동물 ID, 이름 조회
SELECT ins.animal_id, ins.name
FROM animal_ins ins JOIN animal_outs outs USING(animal_id)
WHERE outs.datetime < ins.datetime
ORDER BY ins.datetime ASC;