candy = int(input())

count = 0
for hoon in range(1, candy):
    for gyu in range(hoon+2, candy):
        taek = candy - (hoon + gyu)
        if taek <= 0:
            break
        if taek % 2 == 0:
            count += 1
print(count)