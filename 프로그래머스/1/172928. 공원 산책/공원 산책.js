const direct = {
        E: [0, 1],
        W: [0, -1],
        S: [1, 0],
        N: [-1, 0]
    };

function solution(park, routes) {
    const H = park.length;
    const W = park[0].length;
    
    const cur = findStart(park);

    routes.forEach(route => {
        const [dr, ds] = route.split(' ');
        
        for(let i = 0; i < +ds; i++) {
            shiftOnePos(dr, cur);
            
            if(!(cur[0] < H && cur[1] < W
              && cur[0] >= 0 && cur[1] >= 0)) {
                rollbackOnePos(dr, cur, i + 1);
                return;
            }
            
            if(isObstacle(park, cur)) {
                rollbackOnePos(dr, cur, i + 1);
                return;
            }
            
        }
    })
    
    return cur;
}




function findStart(park) {
    for(let sx = 0; sx < park.length; sx++) {
        let sy = park[sx].indexOf('S');
        
        if(sy !== -1) {
            return [sx, sy];
        }
    }
}

function shiftOnePos(route_dr, cur) {
    cur[0] += direct[route_dr][0];
    cur[1] += direct[route_dr][1];
}

function rollbackOnePos(route_dr, cur, count) {
    cur[0] -= direct[route_dr][0] * count;
    cur[1] -= direct[route_dr][1] * count;
}

function isObstacle(park, cur) {
    return park[cur[0]][cur[1]] === 'X';
}