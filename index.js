console.log('hello world');
let name=8;
console.log(typeof name);
let person={
    name:'Vijay',
    age:21
};
console.log(person.name);
let colors=['red','green'];
console.log(colors[0]);
let c=4;
console.log(recursive(4));
function recursive(n)
{
    if(n<1)
        return 1;
    else
        return n*recursive(n-1);
}
