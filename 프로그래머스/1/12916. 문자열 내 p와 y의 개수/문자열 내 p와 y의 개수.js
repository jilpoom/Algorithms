function solution(s){
    let pCount = 0;
    let yCount = 0;
    
    [...s].forEach(c => {
        c === 'y' || c === 'Y' ? yCount++ : '';
        c === 'p' || c === 'P' ? pCount++ : '';
    })

    return pCount === yCount;
}