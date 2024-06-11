function solution(friends, gifts) {    
    const table = getPresentRSTable(friends, gifts);
    const score_map = getPresentScoreMap(friends, table);
    const next_month_present = getNextMonthPresentList(friends, table, score_map);
    console.log(next_month_present);
    
    
    return next_month_present.reduce((acc, next) => Math.max(acc, next), 0)
}

function getPresentRSTable(friends, gifts) {
    const row = new Array(friends.length).fill(0);
    const table = row.map((r) => new Array(friends.length).fill(0));
    
    gifts.forEach(gift => {
        const [sender, receiver] = gift.split(' ');
        
        //TODO: 최적화 가능
        const sender_index = friends.indexOf(sender);
        const receiver_index = friends.indexOf(receiver);
        
        table[sender_index][receiver_index] += 1;
    })
    
    return table;
}

function getPresentScoreMap(friends, rs_table) {
    const map = {};
    
    friends.forEach((friend, index) => {
        const send_count = rs_table[index].reduce((acc, b) => acc + b, 0);
        const receive_count = rs_table.reduce((acc, cur) => acc + cur[index], 0);
        map[friend] = send_count - receive_count;
    })
    
    return map;
}

function getNextMonthPresentList(friends, rs_table, score_map) {
    const next_month_present = new Array(friends.length).fill(0);
    
    friends.forEach((friend, index) => {
        
        for(let i = index + 1; i < friends.length; i++) {
            const send_count = rs_table[index][i];
            const receive_count = rs_table[i][index];
            
            if(send_count > receive_count) {
                next_month_present[index]++;
            } else if(send_count < receive_count) {
                next_month_present[i]++;
            } else {
                if(score_map[friend] > score_map[friends[i]]) {
                    next_month_present[index]++;
                } else if (score_map[friend] < score_map[friends[i]]) {
                    next_month_present[i]++
                }
            }
        }
    
    })
    
    return next_month_present;
}