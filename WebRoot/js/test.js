Person function(name,age,sex){
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.toString = function(){
        alert("我的名字是："+this.name+"，今年"+this.age+"岁了，性别"+this.sex+"。");
    }
}

var jack = new Person("jack",24,"男");
jack.toString();