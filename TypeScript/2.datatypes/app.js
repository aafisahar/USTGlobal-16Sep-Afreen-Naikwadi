var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "Afreen";
console.log('My name is ', myName, typeof myName);
var age = 22;
console.log('age ', age, typeof age);
var mobileNumber;
console.log('mobile no ', mobileNumber, typeof mobileNumber);
var address;
console.log('Address ', address, typeof address);
var momName = function () {
    console.log('My mother name is Fatima');
};
momName();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var person1 = new Person('Afreen', 22);
console.log(person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollNumber) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNumber = rollNumber;
        return _this;
    }
    return Student;
}(Person));
var studengt1 = new Student('Afreen', 22, 72);
console.log(studengt1);
