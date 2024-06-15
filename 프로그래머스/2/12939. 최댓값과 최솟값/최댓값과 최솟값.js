function solution(s) {
    let min_value = Number.MAX_SAFE_INTEGER;
    let max_value = Number.MIN_SAFE_INTEGER;
    
    s.split(" ").forEach(num => {
        num = Number(num);
        
        if(num > max_value) {
            max_value = num;    
        }
        
        if(num < min_value) {
            min_value = num;
        }
   })

    return min_value + " " + max_value;
}