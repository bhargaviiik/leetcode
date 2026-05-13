/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let c=-1;  //this will stay in the memory till youre calling like this: createCounter()
    return function() { //if you call like this //createCounter(n), n will reset...
        c=c+1;
        return n+c;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */