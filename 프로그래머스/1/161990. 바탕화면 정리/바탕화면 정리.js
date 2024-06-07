function solution(wallpaper) {
    let answer = {
        lux: Number.MAX_SAFE_INTEGER,
        luy: Number.MAX_SAFE_INTEGER,
        rdx: Number.MIN_SAFE_INTEGER,
        rdy: Number.MIN_SAFE_INTEGER
    }
    
    wallpaper.forEach((row, y_index) => {
        row.split('').forEach((v, x_index) => {
            if(v === '#') {
                answer.lux = Math.min(answer.lux, y_index);
                answer.luy = Math.min(answer.luy, x_index);
                answer.rdx = Math.max(answer.rdx, y_index + 1);
                answer.rdy = Math.max(answer.rdy, x_index + 1);
            }
        })
    })
    
    
    return Object.values(answer);
}