def solution(plans):
    answer = []
    for arr in plans:
        h, m = map(int, arr[1].split(':'))
        arr[1] = h * 60 + m
        arr[2] = int(arr[2])
    plans.sort(key = lambda x : x[1])

    st = []
    prev = 0
    for ar in plans:
        time = ar[1] - prev
        prev = ar[1]
        while st and time:
            arr = st.pop()
            if time >= arr[2]:
                answer.append(arr[0])
                time -= arr[2]
            else:
                arr[2] -= time
                time = 0
                st.append(arr)
        st.append(ar)
    while st:
        ar = st.pop()
        answer.append(ar[0])

    return answer