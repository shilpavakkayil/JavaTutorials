/**
 * 
 */
function getalert()
{
	const obj ={
		firstName:"Arun",
		getName: function(){
			return firsName;
		}
	} 
	const myArray = Object.values(obj)
	
	let str = "";
	for(let [attrib,value] of Object.entries(obj))
	{
		str += "attribute: "+attrib+" ,value:"+value+"<br>";
	}
	let mystr = JSON.stringify(obj);
	document.getElementById("mydiv").innerHTML = mystr;
	document.getElementById("odiv").innerHTML = Object.values(new Person("shilpa",123,36));
}

function Person(name,id,age)
{
	this.name = name;
	this.id = id;
	this.age = age;
}

function iterator_custom()
{
	myObject = {};
	myObject[Symbol.iterator] = function(){
		let n = 0;
		done = false;
		return {
			next(){
				n += 10;
				if(n == 100){
					done = true;
				}
				return {value:n, done:done};
			}
		};
	}
	let txt = "";
	for(const num of myObject)
	{
		txt += num+"<br>";
	}
	document.getElementById("odiv").innerHTML = txt;
}

function iterator_custom1()
{
	const v = myFunction();
	document.getElementById("odiv").innerHTML = v.next().value;
}

function myFunction(){
	n = 0;
	return {
		next : function(){
			n += 5;
			return {value:n, done:false}
		}
	}
}