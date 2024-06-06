function solution(keymap, targets) {
    const answer = []
    
    // targets 원소 반복
    targets.forEach(target => {
        let count = 0
        let is_not_matched = false;
        
        // target 키 반복
        target.split("").forEach(t => {
            if(is_not_matched) {
                return;
            }
            
            let min = 101;
            
            keymap.forEach(keys => {
                let tmp = keys.indexOf(t);
                if(tmp !== -1 && tmp < min) {
                    min = tmp;
                }
            })
            
            if(min < 101) {
                count += min + 1;
            } else if(min === 101) {
                is_not_matched = true;
                count = 0;
            }     
        })
        
        if(count === 0) {
            answer.push(-1);
            return;
        }
        
        answer.push(count);
    })
    
    
    
    
    
    return answer;
}