def solution(s):
    
    if s[0] == ')':
        return False
    
    stack = []
    
    for i in s:
        if i == ')':
            if len(stack) == 0 or stack[-1] != '(':
                return False
            stack.pop()
        else:
            stack.append(i)
            
    if len(stack) != 0:
        return False
    
    return True