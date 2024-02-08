-- 코드를 입력하세요
# 보호소에서 중성화 수술 거친 동물 아이디, 생물 종, 이름
SELECT outs.animal_id, outs.animal_type, outs.name
FROM animal_outs outs JOIN animal_ins ins USING(animal_id)
WHERE ins.sex_upon_intake LIKE 'Intact%' AND outs.sex_upon_outcome NOT LIKE 'Intact%'
ORDER BY outs.animal_id;