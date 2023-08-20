const { addNumber } = require('../app');

const assert = require('chai').assert;

const sayHello = require('../app').sayHello;
// const app = require('../app');

describe('App', function(){
    it('app should return hello', function(){
        let result = sayHello();
        assert.equal(sayHello(),'hello');
    })

    it('sayhello should return type String', function(){
        let result = sayHello();
        assert.typeOf(result,'String');

    })

    it('addNumber should return output if it is above 10', function(){
        let result = addNumber(12,4);
        assert.isAbove(result, 10);
    })
})