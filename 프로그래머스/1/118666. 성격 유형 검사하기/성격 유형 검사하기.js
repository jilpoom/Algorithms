function solution(survey, choices) {
    const indicates = {
        'RT': 0,
        'CF': 0,
        'JM': 0,
        'AN': 0,
    }
    
    
    survey.forEach((q, index) => {
        let p;
        let is_reverse = false;
        
        if(!Object.keys(indicates).includes(q)) {
            p = q.split('').reverse().join('');
            is_reverse = !is_reverse;
        }
        
        let score = inspect(choices[index]);
     
        if(is_reverse) {
            indicates[p] += -score;
            return;
        }
        
        indicates[q] += score;
     })
    console.log(indicates);
    
    let answer = Object.keys(indicates).reduce((acc, cur) => {
        let indicate = indicates[cur] > 0 ? cur[1] : cur[0]
        return acc + indicate;
    }, '')
        
    return answer;
}

function inspect(choice) {
    return choice - 4;         
} 