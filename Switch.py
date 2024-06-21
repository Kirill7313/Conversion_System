match (int(input("Выберите, куда переводим(1 - из двоичной в десятичную, 2 - из десятичной в двоичную): "))):
    case 1:
        inp = input("Введите двоичное число: ")[::-1]
        res = 0
        for i in range(len(inp)): 
            if (int(inp[i]) == 1):
                res += 2 ** i
        print("Результат: " + str(res))
    case 2:
        inp = input("Введите десятичное число: ")
        bet = int(inp)
        res = []
        while (bet != 0):
            if (bet % 2 == 1):
                bet -= 1
                bet /= 2
                res.append(1)
            else:
                bet /= 2
                res.append(0)
        res.reverse()
        print("Результат: ", end='')
        for i in res:
            print(i, end='')
        print("\n")
