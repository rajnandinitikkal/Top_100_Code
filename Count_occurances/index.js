function count(s,c){
    let res = 0;
    for (let i =0; i<s.length; i++){
        if(s.charAt(i) ==c)
            res++
    }
    return res;
}

let s = "Rutuja";
let c = "u";
console.log(s);
console.log(count(s,c));