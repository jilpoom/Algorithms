function solution(ingredient) {
    const stack = []
    let answer = 0;
    
    ingredient.forEach((e, index) => {
        stack.push(e);
        
        if(stack.length >= 4) {
            if(stack.slice(-4).join('') == '1231') {
                stack.splice(-4);
                answer+= 1;
            }
        }
    })
    

    
    return answer;
}