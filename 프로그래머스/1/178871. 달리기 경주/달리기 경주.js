function solution(players, callings) {
    const map = {};

    players.map((player, index) => {
        map[player] = index;
    })

    for (let i = 0; i < callings.length; i++) {
        const idx = map[callings[i]];
        
        const temp = players[idx-1];
        players[idx-1] = callings[i];
        players[idx] = temp;

        map[callings[i]] = idx - 1;
        map[temp] = idx;
    }
    
    return players;
}