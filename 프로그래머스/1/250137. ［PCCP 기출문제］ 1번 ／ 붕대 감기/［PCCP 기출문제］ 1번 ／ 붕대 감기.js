function solution(bandage, health, attacks) {
    const final_attack_time = attacks[attacks.length - 1][0];
    const [t, x, y] = bandage;
    const max_health = health;
    let recovery_count = 0;
    
    for(let i = 1; i <= final_attack_time; i++) {
        let cur_health = health;
        
        health = attackedByMonster(i, health, attacks);      
        
        if(health <= 0) {
            return -1;
        } else if(cur_health !== health) {
            recovery_count = 0;
            continue;
        }
        
        recovery_count++;
        health += x;    
        if(recovery_count === t) {
            recovery_count = 0;
            health += y;
        }
        
        if(health > max_health) {
            health = max_health;
        }
    }
    
    return health;
}

function attackedByMonster(cur_time, health, attacks) {
    const damage = attacks.filter(attack => attack[0] === cur_time);
    
    if(damage.length === 0) {
        return health;   
    }
    
    return health - damage[0][1];
}