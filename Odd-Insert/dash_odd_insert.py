def insert_dash(num):
    list_ = list(str(num))
    for i in list_:
        if int(list_[list_.index(i)]) % 2 != 0:
            if int(list_[list_.index(i)  - 1]) % 2 != 0:
                list_.insert(list_.index(i), '-')
    return ''.join(sort_)
print(insert_dash(454793))
